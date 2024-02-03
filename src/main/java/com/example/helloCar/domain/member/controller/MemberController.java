package com.example.helloCar.domain.member.controller;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.global.tokenverify.TokenController;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.EmailService;
import com.example.helloCar.domain.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.ALL_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/member", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class MemberController {
    private final MemberService memberService;
    private final JwtProvider jwtProvider;
    private final TokenController tokenController;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;

    @Data
    public static class LoginRequest {
        @NotBlank
        private String username;
        @NotBlank
        private String password;
    }

    @Getter
    public static class loginresponse {

        private String accessToken;
        private String refreshToken;

        public loginresponse(String accessToken, String refreshToken) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        }
    }

    @PostMapping(value = "/login", consumes = APPLICATION_JSON_VALUE)
    public RsData<loginresponse> login(@Valid @RequestBody LoginRequest loginRequest, HttpServletResponse resp) {

        String accessToken = memberService.genAccessToken(loginRequest.getUsername(), loginRequest.getPassword());
        String refreshToken = memberService.genRefreshToken(loginRequest.getUsername(), loginRequest.getPassword());

        if (accessToken == null) {
            return RsData.of("Invalid username or password", null);
        }
        resp.addHeader("Authentication", accessToken);
        resp.addHeader("Authentication", refreshToken);

        return RsData.of("S-1", "토큰이 생성되었습니다.", new loginresponse(accessToken, refreshToken));
    }

    @AllArgsConstructor
    @Getter
    public class newAccessRequest {
        private String newAccessToken;
    }

    @PostMapping(value = "/refresh", consumes = APPLICATION_JSON_VALUE)
    public RsData<newAccessRequest> refresh(HttpServletRequest request, HttpServletResponse resp) {
        String token = tokenController.extractTokenFromHeader(request);

        String username = jwtProvider.getUsername(token);
        String newAccessToken = memberService.genNewAccessToken(username);

        if (newAccessToken == null) {
            return RsData.of("Invalid refresh request", null);
        }
        // 새로운 토큰을 응답 헤더에 추가
        resp.addHeader("Authentication", newAccessToken);

        return RsData.of("S-1", "새로운 Access 토큰이 발급되었습니다.", new newAccessRequest(newAccessToken));
    }

    @AllArgsConstructor
    @Getter
    public static class MeResponse {
        private final Member member;
    }

    @GetMapping(value = "/my-page", consumes = ALL_VALUE)
    public RsData<MeResponse> mypage(HttpServletRequest request) {
        String token = tokenController.extractTokenFromHeader(request);

        String username = jwtProvider.getUsername(token);

        if (username == null) {
            // 사용자가 인증되지 않은 경우 처리
            return RsData.of("E-1", "사용자가 인증되지 않았습니다.", null);
        }

        Member member = memberService.findByUsername(username).orElse(null);

        return RsData.of(
                "S-2",
                "성공",
                new MeResponse(member)
        );
    }

    @AllArgsConstructor
    @Getter
    public static class MemberResponse {
        private final Member member;
    }

    @Data
    public static class MemberRequest {
        @NotBlank
        private String username;
        @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}")
        @NotBlank
        private String password;
        @NotBlank
        private String passwordConfirm;
        @NotBlank
        private String name;
        @NotBlank
        @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$")
        private String email;
    }

    // 회원가입
    @PostMapping(value = "/create", consumes = ALL_VALUE)
    public RsData<MemberResponse> create(@Valid @RequestBody MemberRequest memberRequest) {
        Member member = memberService.join(memberRequest.getEmail(), memberRequest.getName(), memberRequest.getPassword(), memberRequest.getUsername());
        return RsData.of("S-3", "성공", new MemberResponse(member));
    }

    //회원 수정
    @AllArgsConstructor
    @Getter
    public static class ModifyResponse {
        private final Member member;
        private final String newAccessToken;
    }

    @PostMapping(value = "/modify", consumes = ALL_VALUE)
    public RsData<ModifyResponse> modify(@Valid @RequestBody MemberRequest memberRequest) {
        Member member = memberService.modify(memberRequest.getUsername(), memberRequest.getName(), memberRequest.getPassword());
        // 수정된 회원 정보로 다시 로그인하여 새로운 토큰 발급
        String newAccessToken = memberService.genAccessToken(memberRequest.getUsername(), memberRequest.getPassword());
        return RsData.of("S-3", "성공", new ModifyResponse(member, newAccessToken));
    }

    //회원 탈퇴
    @AllArgsConstructor
    @Getter
    public static class MemberIdResponse {
        private final String memberId;
    }

    @DeleteMapping(value = "/delete", consumes = ALL_VALUE)
    public RsData<MemberIdResponse> delete(@RequestParam(value = "memberId") Long memberId) {
        Member member = memberService.findById(memberId);
        memberService.deleteMember(member.getId());
        return RsData.of("S-4", "회원탈퇴 성공", null);
    }

    //아이디 중복 검사
    @AllArgsConstructor
    @Getter
    public static class UsernameResponse {
        private final Optional<Member> member;
    }

    @Data
    public static class UsernameRequest {
        @NotBlank
        private String username;
    }

    @PostMapping(value = "/check-username", consumes = ALL_VALUE)
    public RsData<UsernameResponse> checkUsernameDuplicate(@Valid @RequestBody UsernameRequest usernameRequest) {
        Optional<Member> username = memberService.findByUsername(usernameRequest.getUsername());
        if (username.isPresent()) {
            return RsData.of("S-4", "중복된 아이디", new UsernameResponse(username));
        } else {
            return RsData.of("S-5", "아이디 사용 가능", null);
        }
    }


    @Data
    public static class SearchIdValue {
        private String name;
        @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$")
        private String email;
        private String username;
    }

    @AllArgsConstructor
    @Getter
    public static class UserSearchResponse {
        private final String member;
    }

    @PostMapping(value = "/idSearch", consumes = ALL_VALUE)
    public RsData<UserSearchResponse> idSearch(@Valid @RequestBody SearchIdValue searchIdValue) {
        Member username = memberService.findByNameAndEmail(searchIdValue.getName(), searchIdValue.getEmail());
        if (username != null) {
            return RsData.of("S-6", "해당 회원의 아이디", new UserSearchResponse("회원님의 아이디는 \"" + username.getUsername() + "\" 입니다."));
        } else {
            return RsData.of("S-7", "해당 회원 없음", new UserSearchResponse("해당 회원정보가 없습니다."));
        }
    }


    @PostMapping(value = "/pwSearch", consumes = ALL_VALUE)
    public RsData<UserSearchResponse> PWSearch(@Valid @RequestBody SearchIdValue searchIdValue) {
        Member username = memberService.findByNameAndEmailAndUsername(searchIdValue.getName(), searchIdValue.getEmail(),searchIdValue.getUsername());
        if (username != null) {
            String PW = this.emailService.PWSearch(searchIdValue.getEmail());
            this.memberService.PWmodify(username,PW);
            return RsData.of("S-8", "성공", new UserSearchResponse("등록된 이메일로 임시 비밀번호를 전송했습니다."));
        } else {
            return RsData.of("S-9", "실패", new UserSearchResponse("해당 회원정보가 없습니다."));
        }
    }
}
