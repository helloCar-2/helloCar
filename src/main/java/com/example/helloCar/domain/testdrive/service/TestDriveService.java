package com.example.helloCar.domain.testdrive.service;

import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import com.example.helloCar.domain.testdrive.repository.TestDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TestDriveService {
    private final TestDriveRepository testDriveRepository;
    private final MemberRepository memberRepository;

    public List<TestDrive> findAll(){
        return this.testDriveRepository.findAll();
    }

    public void save(TestDrive test) {
        this.testDriveRepository.save(test);
    }

    public TestDrive findById(Long id) {
        return this.testDriveRepository.findById(id).get();
    }
    public TestDrive testDriveWrite(Member member, String helloCar, String area, String brand, String testDriveDate, String time, String hasCarAndYear, String testDriveQnA, Map<String, Boolean> buttonState){
        TestDrive testDrive = TestDrive.builder()
                .member(member)
                .car(helloCar)
                .area(area)
                .brand(brand)
                .testDriveDate(testDriveDate)
                .time(time)
                .hasCarAndYear(hasCarAndYear)
                .testDriveQnA(testDriveQnA)
                .buttonState(buttonState)
                .build();

        testDriveRepository.save(testDrive);

        return testDrive;
    }
    public List<TestDrive> findByUser(String username) {
        return this.testDriveRepository.findByMember(this.memberRepository.findByUsername(username).get());
    }

    public List<TestDrive> findByBrandAndCarNameAndArea(String brand, String carName, String area, String testDriveDate) {
        return this.testDriveRepository.findByBrandAndCarAndAreaAndTestDriveDate(brand,carName,area,testDriveDate);
    }
}
