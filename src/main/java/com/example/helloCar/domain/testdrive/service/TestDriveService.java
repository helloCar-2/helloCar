package com.example.helloCar.domain.testdrive.service;

import com.example.helloCar.domain.area.entity.Area;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import com.example.helloCar.domain.testdrive.repository.TestDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestDriveService {
    private final TestDriveRepository testDriveRepository;

    public List<TestDrive> findAll(){
        return this.testDriveRepository.findAll();
    }

    public void save(TestDrive test) {
        this.testDriveRepository.save(test);
    }

    public TestDrive findById(Long id) {
        return this.testDriveRepository.findById(id).get();
    }

    public TestDrive testDriveWrite(Member member, HelloCar helloCar, Area area, String brand, String testDriveDate, String time, String hasCarAndYear, String testDriveQnA){
        TestDrive testDrive = TestDrive.builder()
                .member(member)
                .car(helloCar)
                .area(area)
                .brand(brand)
                .testDriveDate(testDriveDate)
                .time(time)
                .hasCarAndYear(hasCarAndYear)
                .testDriveQnA(testDriveQnA)
                .build();

        testDriveRepository.save(testDrive);

        return testDrive;
    }
}
