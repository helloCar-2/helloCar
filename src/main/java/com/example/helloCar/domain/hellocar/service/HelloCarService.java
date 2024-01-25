package com.example.helloCar.domain.hellocar.service;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloCarService {
    private final HelloCarRepository helloCarRepository;

    public void save (HelloCar car){
        this.helloCarRepository.save(car);
    }

    public HelloCar findById(Long id){
        return this.helloCarRepository.findById(id).get();
    }
}
