package com.example.helloCar.domain.hellocar.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.service.HelloCarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/hellocar", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class HelloCarController {

    private final HelloCarService helloCarService;

    @Data
    public static class HelloCarRequest {
        private String carName;
        private String img;
        private String brand;
        private int maxPrice;
        private int minPrice;
        private int modelYear;
        private String vehicle;
        private String size;
        private String fuel;
    }

    //등록
    @AllArgsConstructor
    @Getter
    public static class HellocarResponse {
        private final HelloCar helloCar;
    }
    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public RsData<HellocarResponse> create(@RequestBody HelloCarRequest helloCarRequest) {
        HelloCar helloCar = helloCarService.create(helloCarRequest.getCarName(), helloCarRequest.getImg(), helloCarRequest.getBrand(),
                helloCarRequest.getMaxPrice(), helloCarRequest.getMinPrice(), helloCarRequest.getModelYear(), helloCarRequest.getVehicle(),
                helloCarRequest.getSize(), helloCarRequest.getFuel());

        return RsData.of("S-5", "성공", new HellocarResponse(helloCar));
    }
}

