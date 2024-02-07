package com.example.helloCar.domain.testdrive.repository;

import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDriveRepository extends JpaRepository<TestDrive, Long> {

    List<TestDrive> findAll();
    List<TestDrive> findByMember(Member member);

    List<TestDrive> findByBrandAndCarAndAreaAndTestDriveDate(String brand, String carName, String area, String testDriveDate);
}
