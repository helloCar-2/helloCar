package com.example.helloCar.domain.testdrive.repository;

import com.example.helloCar.domain.testdrive.entity.TestDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDriveRepository extends JpaRepository<TestDrive, Long> {
}
