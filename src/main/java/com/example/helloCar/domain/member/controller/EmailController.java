package com.example.helloCar.domain.member.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.member.service.EmailService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/member", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class EmailController {
    private final EmailService emailService;

    @AllArgsConstructor
    @Getter
    public static class EmailResponse {
        private final String number;
    }

    @Data
    public static class EmailRequest {
        @NotBlank(message = "필수 입력 항목 입니다.")
        @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "이메일 형식이 올바르지 않습니다.")
        private String email;
    }

    @PostMapping(value = "/email")
    public RsData<EmailResponse> sendVerificationCode(@Valid @RequestBody EmailRequest emailRequest) {
        String email = emailRequest.getEmail();

        // 이메일 중복 검사
        if (emailService.isEmailDuplicate(email) == true) {
            return RsData.of("S-9", "중복된 이메일", null);
        } else {
            int number = emailService.sendEmail(emailRequest.getEmail());
            String num = "" + number;
            return RsData.of("S-10", "이메일 인증번호 발송완료", new EmailResponse(num));
        }
    }


//    @AllArgsConstructor
//    @Getter
//    public static class EmailverificationCodeResponse {
//        private final String verificationCode;
//    }
//    @Data
//    public static class EmailverificationCodeRequest {
//        @NotBlank
//        private int verificationCode;
//        @NotBlank
//        private String email;
//    }
//
//    @PostMapping(value = "/verificationCode")
//    public RsData<EmailverificationCodeResponse> getVerificationCode(@Valid @RequestBody EmailverificationCodeRequest emailverificationCodeRequest) {
//
//
//        return RsData.of("S-11", "이메일 인증번호 발송완료", new EmailverificationCodeResponse());
//    }
}
