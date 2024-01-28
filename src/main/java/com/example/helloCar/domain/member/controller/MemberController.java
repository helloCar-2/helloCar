package com.example.helloCar.domain.member.controller;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.global.tokenverify.TokenController;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.ALL_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/member", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class MemberController {
    private final MemberService memberService;
    private final JwtProvider jwtProvider;
    private final TokenController tokenController;

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
        private final String newAccessToken;
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

    @GetMapping(value = "/me", consumes = ALL_VALUE)
    public RsData<MeResponse> me(@AuthenticationPrincipal User user) {
        Member member = memberService.findByUsername(user.getUsername()).get();

        return RsData.of(
                "S-2",
                "성공",
                new MeResponse(member)
        );
    }
    // 회원가입
}
