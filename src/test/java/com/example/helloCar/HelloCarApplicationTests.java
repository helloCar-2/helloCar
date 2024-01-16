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

        //아반떼
        Car avanteHD2010_G = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(1198)
                .maxPrice(1897)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2010_G);

        Car avanteHD2010_LH = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2188)
                .maxPrice(2553)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2010_LH);

        Car avanteMD2010_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2010_G);

        Car avanteMD2010_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2010_L);

        Car avanteHD2011HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2011HBD);

        Car avanteMD2011_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2011_G);

        Car avanteMD2011_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2011_L);

        Car avanteMD2012_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2012_G);

        Car avanteMD2012_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2012_L);

        Car avanteHD2012HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2012HBD);

        Car avanteMD2013_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1365)
                .maxPrice(1955)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013_G);

        Car avanteMD2013_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md")
                .minPrice(1358)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013_L);


        Car avanteMD2013FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1395)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013FL_G);

        Car avanteMD2013FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1595)
                .maxPrice(2180)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013FL_D);

        Car avanteMD2013_Coupe = Car.builder()
                .brand("현대")
                .carName("아반떼 쿠페")
                .minPrice(1645)
                .maxPrice(1995)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2013_Coupe);

        Car avanteHD2013HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.carService.save(avanteHD2013HBD);

        Car avanteMD2014FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1395)
                .maxPrice(2065)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2014FL_G);

        Car avanteMD2014FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1595)
                .maxPrice(2255)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2014FL_D);

        Car avanteMD2014FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1387)
                .maxPrice(1696)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2014FL_L);

        Car avanteMD2014_Coupe = Car.builder()
                .brand("현대")
                .carName("아반떼 쿠페")
                .minPrice(1690)
                .maxPrice(2305)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2014_Coupe);

        Car avanteMD2015FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1384)
                .maxPrice(1968)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2015FL_G);

        Car avanteMD2015FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1581)
                .maxPrice(2155)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2015FL_D);

        Car avanteMD2015FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 md 페이스리프트")
                .minPrice(1358)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2015FL_L);

        Car avanteMD2015_Coupe = Car.builder()
                .brand("현대")
                .carName("아반떼 쿠페")
                .minPrice(1690)
                .maxPrice(2305)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteMD2015_Coupe);

        Car avanteAD2015_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1410)
                .maxPrice(2455)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2015_G);

        Car avanteAD2015_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1630)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2015_D);

        Car avanteAD2015_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1590)
                .maxPrice(1815)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2015_L);

        Car avanteAD2016_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1410)
                .maxPrice(2455)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2016_G);

        Car avanteAD2016_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1630)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2016_D);

        Car avanteAD2016_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1590)
                .maxPrice(1815)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2016_L);

        Car avanteAD2017_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1394)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2017_G);

        Car avanteAD2017_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1610)
                .maxPrice(2383)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2017_D);

        Car avanteAD2017_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1600)
                .maxPrice(1840)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2017_L);

        Car avanteAD2018_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1394)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018_G);

        Car avanteAD2018_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1610)
                .maxPrice(2383)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018_D);

        Car avanteAD2018_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1600)
                .maxPrice(1840)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018_L);

        Car avanteAD2018FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad 페이스리프트")
                .minPrice(1404)
                .maxPrice(2365)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018FL_G);

        Car avanteAD2018FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad 페이스리프트")
                .minPrice(1796)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018FL_D);

        Car avanteAD2018FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad 페이스리프트")
                .minPrice(1617)
                .maxPrice(1861)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2018FL_L);

        Car avanteAD2019FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1376)
                .maxPrice(2306)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2019FL_G);

        Car avanteAD2019FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1803)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2019FL_D);

        Car avanteAD2019FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1656)
                .maxPrice(2050)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2019FL_L);

        Car avanteAD2020FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1376)
                .maxPrice(2306)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2020FL_G);

        Car avanteAD2020FL_D = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1803)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2020FL_D);

        Car avanteAD2020FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 ad")
                .minPrice(1656)
                .maxPrice(2050)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteAD2020FL_L);

        Car avanteCN7_2020_G = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1570)
                .maxPrice(2779)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2020_G);

        Car avanteCN7_2020_L = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1855)
                .maxPrice(2223)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2020_L);

        Car avanteCN7_2020_HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7 하이브리드")
                .minPrice(2199)
                .maxPrice(2814)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2020_HBD);

        Car avanteCN7_2021_G = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1570)
                .maxPrice(2779)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2021_G);

        Car avanteCN7_2021_L = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1855)
                .maxPrice(2223)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2021_L);

        Car avanteCN7_2021_HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7 하이브리드")
                .minPrice(2199)
                .maxPrice(2814)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2021_HBD);

        Car avanteCN7_2021N = Car.builder()
                .brand("현대")
                .carName("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2021N);

        Car avanteCN7_2022_G = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1866)
                .maxPrice(2806)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2022_G);

        Car avanteCN7_2022_L = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(2005)
                .maxPrice(2641)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2022_L);

        Car avanteCN7_2022_HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(2346)
                .maxPrice(2892)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2022_HBD);

        Car avanteCN7_2022N = Car.builder()
                .brand("현대")
                .carName("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2022N);

        Car avanteCN7_2023_G = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(1866)
                .maxPrice(2806)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_G);

        Car avanteCN7_2023_L = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(2005)
                .maxPrice(2641)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_L);

        Car avanteCN7_2023_HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 CN7")
                .minPrice(2346)
                .maxPrice(2892)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_HBD);

        Car avanteCN7_2023N = Car.builder()
                .brand("현대")
                .carName("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023N);

        Car avanteCN7_2023_FL_N = Car.builder()
                .brand("현대")
                .carName("아반떼 N 페이스리프트")
                .minPrice(3352)
                .maxPrice(3560)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_FL_N);

        Car avanteCN7_2023_FL_G = Car.builder()
                .brand("현대")
                .carName("아반떼 N 페이스리프트")
                .minPrice(1975)
                .maxPrice(2780)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_FL_N);

        Car avanteCN7_2023_FL_L = Car.builder()
                .brand("현대")
                .carName("아반떼 N 페이스리프트")
                .minPrice(2115)
                .maxPrice(2818)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_FL_N);

        Car avanteCN7_2023_FL_HBD = Car.builder()
                .brand("현대")
                .carName("아반떼 N 페이스리프트")
                .minPrice(2466)
                .maxPrice(3153)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.carService.save(avanteCN7_2023_FL_N);

        //쏘나타

        Car YFsonata_2010_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타")
                .minPrice(1960)
                .maxPrice(2992)
                .vehicle("세단")
                .fuel("휘발유")
                .modelYear(2010)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2010_G);

        Car YFsonata_2010_L = Car.builder()
                .brand("현대")
                .carName("YF쏘나타")
                .minPrice(1420)
                .maxPrice(1758)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2010)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2010_L);

        Car YFsonata_2011_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타")
                .minPrice(2002)
                .maxPrice(3000)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2011)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2011_G);

        Car YFsonata_2011_L = Car.builder()
                .brand("현대")
                .carName("YF쏘나타")
                .minPrice(1420)
                .maxPrice(1758)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2011)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2011_L);

        Car YFsonata_2011_HBD = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(2928)
                .maxPrice(3232)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2011)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2011_HBD);

        Car YFsonata_2012_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(2020)
                .maxPrice(2960)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2012_G);

        Car YFsonata_2012_LPG = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(1445)
                .maxPrice(2040)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2012_LPG);

        Car YFsonata_2012_HBD = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(2824)
                .maxPrice(2824)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2012)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2012_HBD);

        Car YFsonataFL_2012_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(2040)
                .maxPrice(2980)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2012_G);

        Car YFsonataFL_2012_LPG = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(1445)
                .maxPrice(2120)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2012_LPG);

        Car YFsonataFL_2013_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(2040)
                .maxPrice(2980)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2013_G);

        Car YFsonataFL_2013_LPG = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(1445)
                .maxPrice(2120)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2013)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2013_LPG);

        Car YFsonata_2013_HBD = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(2875)
                .maxPrice(3180)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2013)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2013_HBD);

        Car YFsonataFL_2014_G = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(2895)
                .maxPrice(3200)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2014_G);

        Car YFsonataFL_2014_LPG = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 페이스리프트")
                .minPrice(1465)
                .maxPrice(2195)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("중형")
                .build();
        this.carService.save(YFsonataFL_2014_LPG);

        Car YFsonata_2014_HBD = Car.builder()
                .brand("현대")
                .carName("YF쏘나타 하이브리드")
                .minPrice(2895)
                .maxPrice(3200)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2014)
                .size("중형")
                .build();
        this.carService.save(YFsonata_2014_HBD);

        Car LFsonata_2014_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3210)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2014_G);

        Car LFsonata_2014_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(1860)
                .maxPrice(2320)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2014_L);

        Car LFsonata_2015_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3210)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2015_G);

        Car LFsonata_2015_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(1860)
                .maxPrice(2320)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2015_L);

        Car LFsonata_2015_HBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 하이브리드")
                .minPrice(3013)
                .maxPrice(3343)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2015)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2015_HBD);

        Car LFsonata_2015_PlugHBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 플러그인 하이브리드")
                .minPrice(4138)
                .maxPrice(4403)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2015)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2015_PlugHBD);

        Car LFsonata_2016_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2204)
                .maxPrice(3132)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2016)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2016_G);

        Car LFsonata_2016_D = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2449)
                .maxPrice(2896)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2016)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2016_D);

        Car LFsonata_2016_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(1705)
                .maxPrice(2220)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2016)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2016_L);

        Car LFsonata_2016_HBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 하이브리드")
                .minPrice(2829)
                .maxPrice(3139)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2016)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2016_HBD);

        Car LFsonata_2016_PlugHBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 플러그인 하이브리드")
                .minPrice(3919)
                .maxPrice(4179)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2016)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2016_PlugHBD);

        Car LFsonata_2017_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3190)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2017_G);

        Car LFsonata_2017_D = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(2505)
                .maxPrice(2981)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2017_D);

        Car LFsonata_2017_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타")
                .minPrice(1715)
                .maxPrice(2220)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2017_L);

        Car LFsonata_2017_HBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 하이브리드")
                .minPrice(2886)
                .maxPrice(3330)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2017_HBD);

        Car LFsonata_2017_PlugHBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 플러그인 하이브리드")
                .minPrice(3893)
                .maxPrice(4250)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonata_2017_PlugHBD);

        Car LFsonataFL_2017_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(2255)
                .maxPrice(3253)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_G);

        Car LFsonataFL_2017_D = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(2505)
                .maxPrice(3118)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_D);

        Car LFsonataFL_2017_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(1750)
                .maxPrice(2278)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_L);

        Car LFsonataFL_2017_HBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈 하이브리드")
                .minPrice(2886)
                .maxPrice(3358)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_HBD);

        Car LFsonataFL_2017_PlugHBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈 플러그인 하이브리드")
                .minPrice(3935)
                .maxPrice(4256)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_PlugHBD);



        Car LFsonataFL_2018_G = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(2219)
                .maxPrice(3233)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2018_G);

        Car LFsonataFL_2018_D = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(2464)
                .maxPrice(3100)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2017_D);

        Car LFsonataFL_2018_L = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈")
                .minPrice(1680)
                .maxPrice(2288)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2018_L);

        Car LFsonataFL_2018_HBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈 하이브리드")
                .minPrice(2854)
                .maxPrice(3299)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2018)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2018_HBD);

        Car LFsonataFL_2018_PlugHBD = Car.builder()
                .brand("현대")
                .carName("LF쏘나타 뉴 라이즈 플러그인 하이브리드")
                .minPrice(3885)
                .maxPrice(4205)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2018)
                .size("중형")
                .build();
        this.carService.save(LFsonataFL_2018_PlugHBD);







    }

}
