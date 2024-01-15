package com.example.helloCar.domain.hellocar.domain.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public void save(Car car){
        this.carRepository.save(car);
    }
}
