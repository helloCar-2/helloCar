package com.example.helloCar.domain.testdrive.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import com.example.helloCar.domain.testdrive.service.TestDriveService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testdrives")
@RequiredArgsConstructor
public class TestDriveController {
    private final TestDriveService testDriveService;


    @AllArgsConstructor
    @Getter
    public static class TestDrivesResponse {
        private final List<TestDrive> testDrives;
    }


    @GetMapping("")
    public RsData<TestDrivesResponse> list(){

        List<TestDrive> testDrivelist = this.testDriveService.findAll();

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
}
