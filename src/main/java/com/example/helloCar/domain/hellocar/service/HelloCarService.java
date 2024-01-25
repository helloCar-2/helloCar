package com.example.helloCar.domain.hellocar.service;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class HelloCarService {

    private final HelloCarRepository helloCarRepository;

    public HelloCar create(String carName, String img, String brand, int maxPrice,
                           int minPrice, int modelYear, String vehicle, String size, String fuel) {

        HelloCar helloCar = HelloCar
                .builder()
                .carName(carName)
                .img(null)
                .brand(brand)
                .maxPrice(maxPrice)
                .minPrice(minPrice)
                .modelYear(modelYear)
                .vehicle(vehicle)
                .size(size)
                .fuel(fuel)
                .build();
        this.helloCarRepository.save(helloCar);
        return helloCar;
    }

    private String saveProfileImage(MultipartFile profileImage) {
        if (profileImage == null || profileImage.isEmpty()) {
            // 프로필 이미지가 없을 경우 null 반환
            return null;
        }
        return null;
    }
    private final HelloCarRepository helloCarRepository;

    public void save (HelloCar car){
        this.helloCarRepository.save(car);
    }

    public HelloCar findById(Long id){
        return this.helloCarRepository.findById(id).get();
    }
}
