package com.example.helloCar.domain.hellocar.controller;

import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.service.HelloCarService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/hellocar", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class HelloCarController {

    private final HelloCarService helloCarService;

    @Data
    public static class HelloCarRequest {
        @NotBlank
        private String carName;
        private String img;
        @NotBlank
        private String brand;
        @NotNull
        private int maxPrice;
        @NotNull
        private int minPrice;
        @NotNull
        private int modelYear;
        @NotBlank
        private String vehicle;
        @NotBlank
        private String size;
        @NotBlank
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

    @AllArgsConstructor
    @Getter
    public static class ListResponse {
        private final List<HelloCar> helloCarList;
    }

    @GetMapping("")
    public RsData<ListResponse> list() {

        List<HelloCar> helloCarList = this.helloCarService.findAll();

        return RsData.of(
                "s-1",
                "성공",
                new ListResponse(helloCarList));
    }


    //차 목록
    @AllArgsConstructor
    @Getter
    public static class PostResponse {
        private final HelloCar helloCar;
    }

    @GetMapping("/{id}")
    public RsData<PostResponse> post(@PathVariable("id") Long id) {

        HelloCar helloCar = this.helloCarService.findById(id);

        return RsData.of(
                "s-1",
                "성공",
                new PostResponse(helloCar));
    }
}

