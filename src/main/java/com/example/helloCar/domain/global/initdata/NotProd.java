package com.example.helloCar.domain.global.initdata;

import com.example.helloCar.domain.hellocar.service.HelloCarService;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "test"})
public class NotProd {
    @Bean
    CommandLineRunner initData(MemberService memberService, HelloCarService helloCarService) {
        return args -> {
//            Member member1 = memberService.join("user1", password, "user1@test.com");
//            Member member2 = memberService.join("user2", password, "user2@test.com");
//            Member member3 = memberService.join("admin2", password, "admin@test.com");
//
//            articleService.create(member3, "테스트입니다.", "테스트 내용입니다.");
//            articleService.create(member2, "테스트1입니다.", "테스트 내용1입니다.");
//            articleService.create(member1, "테스트2입니다.", "테스트 내용2입니다.");
//            articleService.create(member2, "테스트3입니다.", "테스트 내용3입니다.");
//            articleService.create(member1, "테스트4입니다.", "테스트 내용4입니다.");
//helloCarService.create("아반떼",  "/img/car3.png", "현대", 2000, 1500, 2024,"세단","준중형", "가솔린");
        };

    }
}
