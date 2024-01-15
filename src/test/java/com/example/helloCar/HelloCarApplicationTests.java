package com.example.helloCar;

import com.example.helloCar.domain.hellocar.domain.car.Car;
import com.example.helloCar.domain.hellocar.domain.car.CarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloCarApplicationTests {

    @Autowired
    private CarService carService;

    @Test
    void contextLoads() {


        Car avanteHD2010 = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(1198L)
                .maxPrice(2324L)
                .vehicle("세단")
                .size("가솔린,디젤,LPi 하이브리드")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2010);

        Car avanteHD2011HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054L)
                .maxPrice(2324L)
                .vehicle("세단")
                .size("LPi 하이브리드")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2011HBD);

        Car avanteHD2012HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054L)
                .maxPrice(2324L)
                .vehicle("세단")
                .size("LPi 하이브리드")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2012HBD);

        Car avanteHD2013HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054L)
                .maxPrice(2324L)
                .vehicle("세단")
                .size("LPi 하이브리드")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2013HBD);

        Car avanteMD2011 = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1340L)
                .maxPrice(1990L)
                .vehicle("세단")
                .size("가솔린,디젤")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2011);

        Car avanteMD2012 = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1340L)
                .maxPrice(1990L)
                .vehicle("세단")
                .size("가솔린,디젤")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2012);

        Car avanteMD2013 = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1358L)
                .maxPrice(1955L)
                .vehicle("세단")
                .size("가솔린,LPG")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013);

        Car avanteMD2013FL = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1395L)
                .maxPrice(2180L)
                .vehicle("세단")
                .size("가솔린,디젤")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013FL);

        Car avanteMD2014FL = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1387L)
                .maxPrice(2255L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2014FL);

        Car avanteMD2015FL = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1384L)
                .maxPrice(2155L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2015FL);

        Car avanteAD2016 = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1410L)
                .maxPrice(2455L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2016);

        Car avanteAD2017 = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1394L)
                .maxPrice(2415L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2017);

        Car avanteAD2018FL = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1404L)
                .maxPrice(2454L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018FL);

        Car avanteAD2019FL = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1376L)
                .maxPrice(2454L)
                .vehicle("세단")
                .size("가솔린,디젤,LPG")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2019FL);

        Car avanteCN7_2020 = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1570L)
                .maxPrice(2779L)
                .vehicle("세단")
                .size("가솔린,LPG")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2020);




    }

}
