package com.example.helloCar;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.service.HelloCarService;
import com.example.helloCar.domain.member.repository.MemberRepository;
import com.example.helloCar.domain.testdrive.repository.TestDriveRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloCarApplicationTests {

    @Autowired
    private TestDriveRepository testDriveRepository;
    @Autowired
    private HelloCarService helloCarService;
    @Autowired
    private MemberRepository memberRepository;

//    @Test
//    public void test1() {
//        Area area = this.areaRepository.findById(1L).get(); //헬리스
//        Member member = this.memberRepository.findById(1L).get(); // admin
//        HelloCar helloCar1 = this.helloCarService.findById(1L);
//        HelloCar helloCar2 = this.helloCarService.findById(2L);
//        HelloCar helloCar3 = this.helloCarService.findById(3L);
//
//
//
//        TestDrive test1 = TestDrive.builder()
//                .car(helloCar1)
//                .date(LocalDate.now())
//                .member(member)
//                .area(area)
//                .time("14:00")
//                .build();
//        this.testDriveRepository.save(test1);
//
//        TestDrive test2 = TestDrive.builder()
//                .car(helloCar2)
//                .date(LocalDate.now())
//                .member(member)
//                .area(area)
//                .time("14:00")
//                .build();
//        this.testDriveRepository.save(test2);
//
//        TestDrive test3 = TestDrive.builder()
//                .car(helloCar3)
//                .date(LocalDate.now())
//                .member(member)
//                .area(area)
//                .time("14:00")
//                .build();
//        this.testDriveRepository.save(test3);
//    }




    @Test
    public void contextLoads() {

        //아반떼
        HelloCar avanteHD2010_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 hd")
                .minPrice(1198)
                .maxPrice(1897)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteHD2010_G);

        HelloCar avanteHD2010_LH = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 hd")
                .minPrice(2188)
                .maxPrice(2553)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteHD2010_LH);

        HelloCar avanteMD2010_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2010_G);

        HelloCar avanteMD2010_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2010)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2010_L);

        HelloCar avanteHD2011HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteHD2011HBD);

        HelloCar avanteMD2011_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2011_G);

        HelloCar avanteMD2011_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2011)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2011_L);

        HelloCar avanteMD2012_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1340)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2012_G);

        HelloCar avanteMD2012_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1353)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2012_L);

        HelloCar avanteHD2012HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2012)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteHD2012HBD);

        HelloCar avanteMD2013_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1365)
                .maxPrice(1955)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2013_G);

        HelloCar avanteMD2013_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md")
                .minPrice(1358)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2013_L);


        HelloCar avanteMD2013FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1395)
                .maxPrice(1990)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2013FL_G);

        HelloCar avanteMD2013FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1595)
                .maxPrice(2180)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2013FL_D);

        HelloCar avanteMD2013_Coupe = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 쿠페")
                .minPrice(1645)
                .maxPrice(1995)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2013_Coupe);

        HelloCar avanteHD2013HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 hd")
                .minPrice(2054)
                .maxPrice(2324)
                .vehicle("세단")
                .fuel("LPi 하이브리드")
                .modelYear(2013)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteHD2013HBD);

        HelloCar avanteMD2014FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1395)
                .maxPrice(2065)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2014FL_G);

        HelloCar avanteMD2014FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1595)
                .maxPrice(2255)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2014FL_D);

        HelloCar avanteMD2014FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1387)
                .maxPrice(1696)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2014FL_L);

        HelloCar avanteMD2014_Coupe = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 쿠페")
                .minPrice(1690)
                .maxPrice(2305)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2014)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2014_Coupe);

        HelloCar avanteMD2015FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1384)
                .maxPrice(1968)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2015FL_G);

        HelloCar avanteMD2015FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1581)
                .maxPrice(2155)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2015FL_D);

        HelloCar avanteMD2015FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 md 페이스리프트")
                .minPrice(1358)
                .maxPrice(1663)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2015FL_L);

        HelloCar avanteMD2015_Coupe = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 쿠페")
                .minPrice(1690)
                .maxPrice(2305)
                .vehicle("쿠페")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteMD2015_Coupe);

        HelloCar avanteAD2015_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1410)
                .maxPrice(2455)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2015_G);

        HelloCar avanteAD2015_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1630)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2015_D);

        HelloCar avanteAD2015_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1590)
                .maxPrice(1815)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2015_L);

        HelloCar avanteAD2016_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1410)
                .maxPrice(2455)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2016_G);

        HelloCar avanteAD2016_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1630)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2016_D);

        HelloCar avanteAD2016_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1590)
                .maxPrice(1815)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2016)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2016_L);

        HelloCar avanteAD2017_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1394)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2017_G);

        HelloCar avanteAD2017_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1610)
                .maxPrice(2383)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2017_D);

        HelloCar avanteAD2017_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1600)
                .maxPrice(1840)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2017_L);

        HelloCar avanteAD2018_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1394)
                .maxPrice(2415)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018_G);

        HelloCar avanteAD2018_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1610)
                .maxPrice(2383)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018_D);

        HelloCar avanteAD2018_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1600)
                .maxPrice(1840)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018_L);

        HelloCar avanteAD2018FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad 페이스리프트")
                .minPrice(1404)
                .maxPrice(2365)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018FL_G);

        HelloCar avanteAD2018FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad 페이스리프트")
                .minPrice(1796)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018FL_D);

        HelloCar avanteAD2018FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad 페이스리프트")
                .minPrice(1617)
                .maxPrice(1861)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2018FL_L);

        HelloCar avanteAD2019FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1376)
                .maxPrice(2306)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2019FL_G);

        HelloCar avanteAD2019FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1803)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2019FL_D);

        HelloCar avanteAD2019FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1656)
                .maxPrice(2050)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2019)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2019FL_L);

        HelloCar avanteAD2020FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1376)
                .maxPrice(2306)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2020FL_G);

        HelloCar avanteAD2020FL_D = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1803)
                .maxPrice(2454)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2020FL_D);

        HelloCar avanteAD2020FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 ad")
                .minPrice(1656)
                .maxPrice(2050)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteAD2020FL_L);

        HelloCar avanteCN7_2020_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1570)
                .maxPrice(2779)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2020_G);

        HelloCar avanteCN7_2020_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1855)
                .maxPrice(2223)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2020_L);

        HelloCar avanteCN7_2020_HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7 하이브리드")
                .minPrice(2199)
                .maxPrice(2814)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2020)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2020_HBD);

        HelloCar avanteCN7_2021_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1570)
                .maxPrice(2779)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2021_G);

        HelloCar avanteCN7_2021_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1855)
                .maxPrice(2223)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2021_L);

        HelloCar avanteCN7_2021_HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7 하이브리드")
                .minPrice(2199)
                .maxPrice(2814)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2021_HBD);

        HelloCar avanteCN7_2021N = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2021)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2021N);

        HelloCar avanteCN7_2022_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1866)
                .maxPrice(2806)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2022_G);

        HelloCar avanteCN7_2022_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(2005)
                .maxPrice(2641)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2022_L);

        HelloCar avanteCN7_2022_HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(2346)
                .maxPrice(2892)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2022_HBD);

        HelloCar avanteCN7_2022N = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2022)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2022N);

        HelloCar avanteCN7_2023_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(1866)
                .maxPrice(2806)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_G);

        HelloCar avanteCN7_2023_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(2005)
                .maxPrice(2641)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_L);

        HelloCar avanteCN7_2023_HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 CN7")
                .minPrice(2346)
                .maxPrice(2892)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_HBD);

        HelloCar avanteCN7_2023N = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N")
                .minPrice(3212)
                .maxPrice(3402)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023N);

        HelloCar avanteCN7_2023_FL_N = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N 페이스리프트")
                .minPrice(3352)
                .maxPrice(3560)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_FL_N);

        HelloCar avanteCN7_2023_FL_G = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N 페이스리프트")
                .minPrice(1975)
                .maxPrice(2780)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_FL_G);

        HelloCar avanteCN7_2023_FL_L = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N 페이스리프트")
                .minPrice(2115)
                .maxPrice(2818)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_FL_L);

        HelloCar avanteCN7_2023_FL_HBD = HelloCar.builder()
                .brand("현대")
                .carname("아반떼 N 페이스리프트")
                .minPrice(2466)
                .maxPrice(3153)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("준중형")
                .build();
        this.helloCarService.save(avanteCN7_2023_FL_HBD);

        //쏘나타

        HelloCar YFsonata_2010_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타")
                .minPrice(1960)
                .maxPrice(2992)
                .vehicle("세단")
                .fuel("휘발유")
                .modelYear(2010)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2010_G);

        HelloCar YFsonata_2010_L = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타")
                .minPrice(1420)
                .maxPrice(1758)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2010)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2010_L);

        HelloCar YFsonata_2011_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타")
                .minPrice(2002)
                .maxPrice(3000)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2011)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2011_G);

        HelloCar YFsonata_2011_L = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타")
                .minPrice(1420)
                .maxPrice(1758)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2011)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2011_L);

        HelloCar YFsonata_2011_HBD = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(2928)
                .maxPrice(3232)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2011)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2011_HBD);

        HelloCar YFsonata_2012_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(2020)
                .maxPrice(2960)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2012_G);

        HelloCar YFsonata_2012_LPG = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(1445)
                .maxPrice(2040)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2012_LPG);

        HelloCar YFsonata_2012_HBD = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(2824)
                .maxPrice(2824)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2012)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2012_HBD);

        HelloCar YFsonataFL_2012_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(2040)
                .maxPrice(2980)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2012)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2012_G);

        HelloCar YFsonataFL_2012_LPG = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(1445)
                .maxPrice(2120)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2012)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2012_LPG);

        HelloCar YFsonataFL_2013_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(2040)
                .maxPrice(2980)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2013)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2013_G);

        HelloCar YFsonataFL_2013_LPG = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(1445)
                .maxPrice(2120)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2013)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2013_LPG);

        HelloCar YFsonata_2013_HBD = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(2875)
                .maxPrice(3180)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2013)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2013_HBD);

        HelloCar YFsonataFL_2014_G = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(2895)
                .maxPrice(3200)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2014_G);

        HelloCar YFsonataFL_2014_LPG = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 페이스리프트")
                .minPrice(1465)
                .maxPrice(2195)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonataFL_2014_LPG);

        HelloCar YFsonata_2014_HBD = HelloCar.builder()
                .brand("현대")
                .carname("YF쏘나타 하이브리드")
                .minPrice(2895)
                .maxPrice(3200)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2014)
                .size("중형")
                .build();
        this.helloCarService.save(YFsonata_2014_HBD);

        HelloCar LFsonata_2014_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3210)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2014)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2014_G);

        HelloCar LFsonata_2014_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(1860)
                .maxPrice(2320)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2014)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2014_L);

        HelloCar LFsonata_2015_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3210)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2015)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2015_G);

        HelloCar LFsonata_2015_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(1860)
                .maxPrice(2320)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2015)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2015_L);

        HelloCar LFsonata_2015_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 하이브리드")
                .minPrice(3013)
                .maxPrice(3343)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2015)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2015_HBD);

        HelloCar LFsonata_2015_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 플러그인 하이브리드")
                .minPrice(4138)
                .maxPrice(4403)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2015)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2015_PlugHBD);

        HelloCar LFsonata_2016_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2204)
                .maxPrice(3132)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2016)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2016_G);

        HelloCar LFsonata_2016_D = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2449)
                .maxPrice(2896)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2016)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2016_D);

        HelloCar LFsonata_2016_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(1705)
                .maxPrice(2220)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2016)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2016_L);

        HelloCar LFsonata_2016_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 하이브리드")
                .minPrice(2829)
                .maxPrice(3139)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2016)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2016_HBD);

        HelloCar LFsonata_2016_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 플러그인 하이브리드")
                .minPrice(3919)
                .maxPrice(4179)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2016)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2016_PlugHBD);

        HelloCar LFsonata_2017_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2255)
                .maxPrice(3190)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2017_G);

        HelloCar LFsonata_2017_D = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(2505)
                .maxPrice(2981)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2017_D);

        HelloCar LFsonata_2017_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타")
                .minPrice(1715)
                .maxPrice(2220)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2017_L);

        HelloCar LFsonata_2017_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 하이브리드")
                .minPrice(2886)
                .maxPrice(3330)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2017_HBD);

        HelloCar LFsonata_2017_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 플러그인 하이브리드")
                .minPrice(3893)
                .maxPrice(4250)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonata_2017_PlugHBD);

        HelloCar LFsonataFL_2017_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2255)
                .maxPrice(3253)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2017_G);

        HelloCar LFsonataFL_2017_D = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2505)
                .maxPrice(3118)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2017_D);

        HelloCar LFsonataFL_2017_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1750)
                .maxPrice(2278)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2017_L);

        HelloCar LFsonataFL_2017_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 하이브리드")
                .minPrice(2886)
                .maxPrice(3358)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2017_HBD);

        HelloCar LFsonataFL_2017_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 플러그인 하이브리드")
                .minPrice(3935)
                .maxPrice(4256)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2017)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2017_PlugHBD);


        HelloCar LFsonataFL_2018_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2219)
                .maxPrice(3233)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2018)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2018_G);

        HelloCar LFsonataFL_2018_D = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2464)
                .maxPrice(3100)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2018)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2018_D);

        HelloCar LFsonataFL_2018_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1680)
                .maxPrice(2288)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2018)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2018_L);

        HelloCar LFsonataFL_2018_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 하이브리드")
                .minPrice(2854)
                .maxPrice(3299)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2018)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2018_HBD);

        HelloCar LFsonataFL_2018_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 플러그인 하이브리드")
                .minPrice(3885)
                .maxPrice(4205)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2018)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2018_PlugHBD);

        HelloCar LFsonataFL_2019_G = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2219)
                .maxPrice(3233)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2019_G);

        HelloCar LFsonataFL_2019_D = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2464)
                .maxPrice(3100)
                .vehicle("세단")
                .fuel("디젤")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2019_D);

        HelloCar LFsonataFL_2019_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1680)
                .maxPrice(2288)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2019_L);

        HelloCar LFsonataFL_2019_HBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 하이브리드")
                .minPrice(2854)
                .maxPrice(3299)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2019_HBD);

        HelloCar LFsonataFL_2019_PlugHBD = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈 플러그인 하이브리드")
                .minPrice(3885)
                .maxPrice(4205)
                .vehicle("세단")
                .fuel("가솔린 플러그인 하이브리드")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2019_PlugHBD);


        HelloCar sonataDN8_2019_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2288)
                .maxPrice(3287)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2019_G);

        HelloCar sonataDN8_2019_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2396)
                .maxPrice(3212)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2019_L);

        HelloCar sonataDN8_2019_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 하이브리드")
                .minPrice(2790)
                .maxPrice(3669)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2019)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2019_HBD);

        HelloCar LFsonataFL_2020_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1685)
                .maxPrice(2084)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2020_L);

        HelloCar sonataDN8_2020_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2386)
                .maxPrice(3642)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2020)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2020_G);

        HelloCar sonataDN8_2020_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2641)
                .maxPrice(3313)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2020)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2020_L);

        HelloCar sonataDN8_2020_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 하이브리드")
                .minPrice(2754)
                .maxPrice(3599)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2020)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2020_HBD);

        HelloCar LFsonataFL_2021_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1945)
                .maxPrice(2550)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2021)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2021_L);

        HelloCar sonataDN8_2021_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2547)
                .maxPrice(3645)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2021)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2021_G);

        HelloCar sonataDN8_2021_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2611)
                .maxPrice(3323)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2021)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2021_L);

        HelloCar sonataDN8_2021_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 하이브리드")
                .minPrice(2881)
                .maxPrice(3635)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2021)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2021_HBD);

        HelloCar LFsonataFL_2022_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(1945)
                .maxPrice(2550)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2022)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2022_L);

        HelloCar sonataDN8_2022_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2547)
                .maxPrice(3645)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2022)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2022_G);

        HelloCar sonataDN8_2022_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2611)
                .maxPrice(3323)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2022)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2022_L);

        HelloCar sonataDN8_2022_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 하이브리드")
                .minPrice(2881)
                .maxPrice(3635)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2022)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2022_HBD);

        HelloCar LFsonataFL_2023_L = HelloCar.builder()
                .brand("현대")
                .carname("LF쏘나타 뉴 라이즈")
                .minPrice(2043)
                .maxPrice(2600)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(LFsonataFL_2023_L);

        HelloCar sonataDN8_2023_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2592)
                .maxPrice(3633)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2023_G);

        HelloCar sonataDN8_2023_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8")
                .minPrice(2655)
                .maxPrice(3362)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2023_L);

        HelloCar sonataDN8_2023_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 하이브리드")
                .minPrice(2946)
                .maxPrice(3706)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8_2023_HBD);

        HelloCar sonataDN8FL_2023_G = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 페이스리프트")
                .minPrice(2808)
                .maxPrice(3917)
                .vehicle("세단")
                .fuel("가솔린")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8FL_2023_G);

        HelloCar sonataDN8FL_2023_L = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 페이스리프트")
                .minPrice(2897)
                .maxPrice(3586)
                .vehicle("세단")
                .fuel("LPG")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8FL_2023_L);

        HelloCar sonataDN8FL_2023_HBD = HelloCar.builder()
                .brand("현대")
                .carname("쏘나타 DN8 페이스리프트 하이브리드")
                .minPrice(3187)
                .maxPrice(3921)
                .vehicle("세단")
                .fuel("가솔린 하이브리드")
                .modelYear(2023)
                .size("중형")
                .build();
        this.helloCarService.save(sonataDN8FL_2023_HBD);


    }

}
