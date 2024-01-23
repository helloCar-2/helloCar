package com.example.helloCar.domain.member.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.member.service.MemberService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

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
    public static class LoginResponse {
        private final String accesssToken;
    }
    @PostMapping(value = "/login", consumes = APPLICATION_JSON_VALUE)
    public RsData<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        //테스트용
//        resp.addHeader("Authentication", "JWT Token");
        String accessToken = memberService.genAccessToken(loginRequest.getUsername(), loginRequest.getPassword());
        return RsData.of(
                "S-1",
                "엑세스 토큰이 생성되었습니다.",
                new LoginResponse(accessToken)
        );
    }
}
