package com.example.helloCar.domain.testdrive.controller;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.global.tokenverify.TokenController;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.MemberService;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import com.example.helloCar.domain.testdrive.service.TestDriveService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.ALL_VALUE;

@RestController
@RequestMapping(value = "/api/v1/testdrive", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class TestDriveController {
    private final TestDriveService testDriveService;
    private final TokenController tokenController;
    private final JwtProvider jwtProvider;
    private final MemberService memberService;


    @AllArgsConstructor
    @Getter
    public static class TestDrivesResponse {
        private final List<TestDrive> testDrives;
    }


    @GetMapping(value = "", consumes = ALL_VALUE)
    public RsData<TestDrivesResponse> list(HttpServletRequest request, HttpServletResponse resp){
        String token = tokenController.extractTokenFromHeader(request);
        String username = jwtProvider.getUsername(token);

        List<TestDrive> testDrivelist = this.testDriveService.findByUser(username);

        return RsData.of(
                "s-1",
                "성공",
                new TestDrivesResponse(testDrivelist));
    }

    @AllArgsConstructor
    @Getter
    public static class PostResponse {
        private final TestDrive testDrive;
    }
    @GetMapping("/{id}")
    public RsData<PostResponse> post(@PathVariable("id") Long id){

        TestDrive testDrive = this.testDriveService.findById(id);


        return RsData.of(
                "s-1",
                "성공",
                new PostResponse(testDrive));
    }

    @Data
    public static class TestDriveWrite {

        private String brand;

        private String carName;

        private String area;

        private String testDriveDate;

        private String time;

        private String hasCarAndYear;

        private String testDriveQnA;
    }

    @AllArgsConstructor
    @Getter
    public static class MemberResponse {
        private final TestDrive testDrive;
    }

    @PostMapping(value = "/write")
    public RsData<MemberResponse> testDriveWrite(@RequestBody TestDriveWrite testDriveWrite, HttpServletRequest request){
        String token = tokenController.extractTokenFromHeader(request);

        Map<String, Object> claims = jwtProvider.getClaims(token);
        String username = (String) claims.get("username");
        Member member = memberService.findByUsername(username).orElse(null);

        if (member == null) {
            // 사용자가 인증되지 않은 경우 처리
            return RsData.of("E-1", "사용자가 인증되지 않았습니다.", null);
        }

        TestDrive testDrive = testDriveService.testDriveWrite(
                member,
                testDriveWrite.getCarName(),
                testDriveWrite.getArea(),
                testDriveWrite.getBrand(),
                testDriveWrite.getTestDriveDate(),
                testDriveWrite.getTime(),
                testDriveWrite.getHasCarAndYear(),
                testDriveWrite.getTestDriveQnA()
                );

        return RsData.of(
                "S-2",
                "성공",
                new MemberResponse(testDrive)
        );
    }

    @AllArgsConstructor
    @Getter
    public static class getTestDrive {
        private final List<TestDrive> testDrive;
    }
    @GetMapping(value = "/getlist")
    public RsData<getTestDrive> getTestDrive(){

        List<TestDrive> testDrives = testDriveService.findAll();

        return RsData.of(
                "s-1",
                "성공",
                new getTestDrive(testDrives));
    }
}
