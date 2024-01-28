package com.example.helloCar.domain.testdrive.service;

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
}
