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
@RequestMapping(value = "api/v1/hellocar", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
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
    public static class HelloCarsResponse {
        private final List<HelloCar> helloCars;
    }

    @Data
    public static class HelloCarsRequest {
        private String brand;
    }
    @PostMapping(value = "/lists", consumes = APPLICATION_JSON_VALUE)
    public RsData<HelloCarsResponse> lists(@RequestBody HelloCarsRequest helloCarsRequest){
        List<HelloCar> carList = this.helloCarService.findByBrand(helloCarsRequest.getBrand());
        return RsData.of("S-6","성공",new HelloCarsResponse(carList));
    }

    @AllArgsConstructor
    @Getter
    public static class HelloCarSerchListResponse {
        private final List<HelloCar> helloCars;
    }


    @GetMapping("/lists")
    public RsData<HelloCarSerchListResponse> searchList(@RequestParam(value = "brand", defaultValue = "") String brand,
                                      @RequestParam(value = "carname", defaultValue = "") String carname,
                                      @RequestParam(value = "fuel", defaultValue = "") String fuel,
                                      @RequestParam(value = "minPrice", defaultValue = "0") int minPrice,
                                      @RequestParam(value = "maxPrice", defaultValue = "100000") int maxPrice){

        List<HelloCar> carList = this.helloCarService.keywordSearch(brand,carname,fuel,minPrice,maxPrice);
        return RsData.of("S-7","성공",new HelloCarSerchListResponse(carList));
    }

    @AllArgsConstructor
    @Getter
    public static class detailResponse {
        private final HelloCar helloCar;
    }

    @GetMapping("/{id}")
    public RsData<detailResponse> detail(@PathVariable(value = "id") Long id){
        HelloCar result = this.helloCarService.findById(id);

        return RsData.of("S-8","성공",new detailResponse(result));
    }
}

