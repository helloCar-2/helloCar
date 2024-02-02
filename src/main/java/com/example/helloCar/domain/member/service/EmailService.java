package com.example.helloCar.domain.member.service;

import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final MemberRepository memberRepository;
    private final JavaMailSender mailSender;
    private static final String senderEmail = "joeun065@gmail.com";
    private static int number;

    // 랜덤 발송 번호를 보내기 위한 구문
    public static void createNumber() {
        //(int) Math.random() * (최댓값-최소값+1) + 최소값
        number = (int) (Math.random() * (90000)) + 10000;
    }

    // 이메일 인증을 하기 위한 createEmail 구문
    public MimeMessage createEmail(String email) {
        createNumber();
        MimeMessage message = mailSender.createMimeMessage();

        try {
            message.setFrom(senderEmail);
            message.setRecipients(MimeMessage.RecipientType.TO, email);
            message.setSubject("HELLOCAR 이메일 인증");
            String body = "";
            body += "<h3>" + "안녕하세요 HELLOCAR 입니다.";
            body += "<h2>" + "아래 인증코드를 입력해 주세요." + "</h3>";
            body += "<h1>" + number + "</h1>";
            message.setText(body, "UTF-8", "html");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return message;
    }

    public boolean isEmailDuplicate(String email) {
        Optional<Member> existingEmail = memberRepository.findByEmail(email);
        return existingEmail.isPresent(); // true면 중복, false면 중복 아님
    }

    public int sendEmail(String email) {
        MimeMessage message = createEmail(email);
        mailSender.send(message);

        return number;
    }


    public String PWSearch(String email) {
        MimeMessage message = mailSender.createMimeMessage();

        char[] charSet = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String str = "";

        int idx = 0;
        for (int i = 0; i < 10; i++) {
            idx = (int) (charSet.length * Math.random());
            str += charSet[idx];
        }
        try {
            message.setFrom(senderEmail);
            message.setRecipients(MimeMessage.RecipientType.TO, email);
            message.setSubject("HELLOCAR 이메일 인증");
            String body = "";
            body += "<h1>" + "안녕하세요 HELLOCAR 입니다." + "</h3>";
            body += "<h2>" + "아래 비밀번호로 로그인해주세요." + "</h2>";
            body += "<h1>" + str + "</h1>";
            message.setText(body, "UTF-8", "html");
            mailSender.send(message);
            return str;


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

//    // 회원가입 완료 시 가입 이메일을 보내기 위한 send구문
//    public void send(String to, String subject, String body) {
//
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//
//        try {
//            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false, "UTF-8");
//            mimeMessageHelper.setTo(to); // 메일 수신자
//            mimeMessageHelper.setSubject(subject); // 메일 제목
//            mimeMessageHelper.setText(body, true); // 메일 본문 내용, HTML 여부
//            mailSender.send(mimeMessage); // 메일발송
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
