package com.example.helloCar.domain.hellocar.repository;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloCarRepository extends JpaRepository<HelloCar, Long> {
}
