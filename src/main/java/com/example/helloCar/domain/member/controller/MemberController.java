package com.example.helloCar.domain.member.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.MemberService;
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

    @Data
    public static class LoginRequest {
        @NotBlank
        private String username;
        @NotBlank
        private String password;
    }

    @AllArgsConstructor
    @Getter
    public static class loginresponse{
        private final String acesstoken;
    }
    @PostMapping(value = "/login", consumes = APPLICATION_JSON_VALUE)
    public RsData<loginresponse> login(@Valid @RequestBody LoginRequest loginRequest, HttpServletResponse resp) {

        String accestoken = memberService.genAccessToken(loginRequest.getUsername(), loginRequest.getPassword());

        if (accestoken == null) {
            return RsData.of("Invalid username or password", null);
        }
        resp.addHeader("Authentication", accestoken);

        return RsData.of("S-1", "토큰이 생성되었습니다.", new loginresponse(accestoken));
    }

    @AllArgsConstructor
    @Getter
    public static class MeResponse {
        private final Member member;
    }

    @GetMapping(value = "/me", consumes = ALL_VALUE)
    public RsData<MeResponse> me (@AuthenticationPrincipal User user) {
        Member member = memberService.findByUsername(user.getUsername()).get();

        return RsData.of(
                "S-2",
                "성공",
                new MeResponse(member)
        );
    }
}
