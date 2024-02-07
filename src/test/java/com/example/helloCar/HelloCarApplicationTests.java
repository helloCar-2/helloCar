package com.example.helloCar;

import com.example.helloCar.domain.board.entity.Board;
import com.example.helloCar.domain.board.service.BoardService;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class HelloCarApplicationTests {

    @Autowired
    private BoardService boardService;
    @Autowired
    private HelloCarRepository helloCarRepository;

    @Test
    @DisplayName("아반떼")
    public void test1() throws Exception {
        String filePath1 = "frontapp/static/img/avante.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "avante.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("아반떼")
                    .brand("현대")
                    .minPrice(1975)
                    .maxPrice(2818)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("준중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }
    @Test
    @DisplayName("쏘나타")
    public void test2() throws Exception {
        String filePath1 = "frontapp/static/img/sonata.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "sonata.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("쏘나타")
                    .brand("현대")
                    .minPrice(2808)
                    .maxPrice(3917)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("캐스퍼")
    public void test3() throws Exception {
        String filePath1 = "frontapp/static/img/casper.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "casper.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("캐스퍼")
                    .brand("현대")
                    .minPrice(1375)
                    .maxPrice(1960)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("경차")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("그랜저")
    public void test4() throws Exception {
        String filePath1 = "frontapp/static/img/grandeur.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "grandeur.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("그랜저")
                    .brand("현대")
                    .minPrice(3743)
                    .maxPrice(5103)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("아이오닉6")
    public void test5() throws Exception {
        String filePath1 = "frontapp/static/img/ioniq6.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "ioniq6.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("아이오닉6")
                    .brand("현대")
                    .minPrice(5200)
                    .maxPrice(6370)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("중형")
                    .fuel("전기")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("코나")
    public void test6() throws Exception {
        String filePath1 = "frontapp/static/img/kona.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "kona.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("코나")
                    .brand("현대")
                    .minPrice(2486)
                    .maxPrice(3323)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("경형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("투싼")
    public void test7() throws Exception {
        String filePath1 = "frontapp/static/img/kona.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "kona.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("투싼")
                    .brand("현대")
                    .minPrice(2771)
                    .maxPrice(4004)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("싼타페")
    public void test8() throws Exception {
        String filePath1 = "frontapp/static/img/santafe.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "santafe.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("싼타페")
                    .brand("현대")
                    .minPrice(3546)
                    .maxPrice(4596)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("아이오닉5")
    public void test9() throws Exception {
        String filePath1 = "frontapp/static/img/ioniq5.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "ioniq5.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("아이오닉5")
                    .brand("현대")
                    .minPrice(5005)
                    .maxPrice(6120)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("전기")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("펠리세이드")
    public void test10() throws Exception {
        String filePath1 = "frontapp/static/img/palisade.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "palisade.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("펠리세이드")
                    .brand("현대")
                    .minPrice(3896)
                    .maxPrice(5491)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("스타리아")
    public void test11() throws Exception {
        String filePath1 = "frontapp/static/img/staria.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "staria.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("스타리아")
                    .brand("현대")
                    .minPrice(2596)
                    .maxPrice(4438)
                    .modelYear(2023)
                    .vehicle("RV")
                    .size("대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("레이")
    public void test12() throws Exception {
        String filePath1 = "frontapp/static/img/ray.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "ray.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("레이")
                    .brand("기아")
                    .minPrice(1330)
                    .maxPrice(1865)
                    .modelYear(2023)
                    .vehicle("RV")
                    .size("경형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("K3")
    public void test13() throws Exception {
        String filePath1 = "frontapp/static/img/k3.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "k3.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("K3")
                    .brand("기아")
                    .minPrice(1765)
                    .maxPrice(2468)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("준중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("K5")
    public void test14() throws Exception {
        String filePath1 = "frontapp/static/img/k5.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "k5.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("K5")
                    .brand("기아")
                    .minPrice(2784)
                    .maxPrice(3526)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("K8")
    public void test15() throws Exception {
        String filePath1 = "frontapp/static/img/k8.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "k8.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("K8")
                    .brand("기아")
                    .minPrice(3299)
                    .maxPrice(4624)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("K9")
    public void test16() throws Exception {
        String filePath1 = "frontapp/static/img/k9.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "k9.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("K9")
                    .brand("기아")
                    .minPrice(5815)
                    .maxPrice(7744)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("EV6")
    public void test17() throws Exception {
        String filePath1 = "frontapp/static/img/ev6.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "ev6.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("EV6")
                    .brand("기아")
                    .minPrice(4870)
                    .maxPrice(6230)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("전기")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("셀토스")
    public void test18() throws Exception {
        String filePath1 = "frontapp/static/img/seltos.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "seltos.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("셀토스")
                    .brand("기아")
                    .minPrice(2087)
                    .maxPrice(2903)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("소형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("스포티지")
    public void test19() throws Exception {
        String filePath1 = "frontapp/static/img/sportage.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "sportage.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("스포티지")
                    .brand("기아")
                    .minPrice(2537)
                    .maxPrice(3892)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("쏘렌토")
    public void test20() throws Exception {
        String filePath1 = "frontapp/static/img/sorento.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "sorento.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("쏘렌토")
                    .brand("기아")
                    .minPrice(3506)
                    .maxPrice(4598)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("모하비")
    public void test21() throws Exception {
        String filePath1 = "frontapp/static/img/mohave.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "mohave.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("모하비")
                    .brand("기아")
                    .minPrice(5054)
                    .maxPrice(5993)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준대형")
                    .fuel("디젤")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("카니발")
    public void test22() throws Exception {
        String filePath1 = "frontapp/static/img/carnival.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "carnival.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("카니발")
                    .brand("기아")
                    .minPrice(3470)
                    .maxPrice(4856)
                    .modelYear(2023)
                    .vehicle("RV")
                    .size("대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("G70")
    public void test23() throws Exception {
        String filePath1 = "frontapp/static/img/G70.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "G70.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("G70")
                    .brand("제네시스")
                    .minPrice(4347)
                    .maxPrice(5089)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("G80")
    public void test24() throws Exception {
        String filePath1 = "frontapp/static/img/G80.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "G80.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("G80")
                    .brand("제네시스")
                    .minPrice(5890)
                    .maxPrice(6830)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("G90")
    public void test25() throws Exception {
        String filePath1 = "frontapp/static/img/G90.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "G90.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("G90")
                    .brand("제네시스")
                    .minPrice(9445)
                    .maxPrice(10384)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("GV60")
    public void test26() throws Exception {
        String filePath1 = "frontapp/static/img/GV60.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "GV60.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("GV60")
                    .brand("제네시스")
                    .minPrice(6493)
                    .maxPrice(7357)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("전기")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("GV70")
    public void test27() throws Exception {
        String filePath1 = "frontapp/static/img/GV70.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "GV70.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("GV70")
                    .brand("제네시스")
                    .minPrice(5040)
                    .maxPrice(5989)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("GV80")
    public void test28() throws Exception {
        String filePath1 = "frontapp/static/img/GV80.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "GV80.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("GV80")
                    .brand("제네시스")
                    .minPrice(6930)
                    .maxPrice(7830)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("트레일블레이저")
    public void test29() throws Exception {
        String filePath1 = "frontapp/static/img/trailblazer.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "trailblazer.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("트레일블레이저")
                    .brand("쉐보레")
                    .minPrice(2699)
                    .maxPrice(3339)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("소형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("이쿼녹스")
    public void test30() throws Exception {
        String filePath1 = "frontapp/static/img/equinox.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "equinox.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("이쿼녹스")
                    .brand("쉐보레")
                    .minPrice(3145)
                    .maxPrice(4145)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("트래버스")
    public void test31() throws Exception {
        String filePath1 = "frontapp/static/img/traverse.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "traverse.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("트래버스")
                    .brand("쉐보레")
                    .minPrice(5640)
                    .maxPrice(6615)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("타호")
    public void test32() throws Exception {
        String filePath1 = "frontapp/static/img/tahoe.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "tahoe.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("타호")
                    .brand("쉐보레")
                    .minPrice(9390)
                    .maxPrice(9500)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("트랙스 크로스오버")
    public void test33() throws Exception {
        String filePath1 = "frontapp/static/img/trax_crossover.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "trax_crossover.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("트랙스 크로스오버")
                    .brand("쉐보레")
                    .minPrice(2188)
                    .maxPrice(2880)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("소형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("콜로라도")
    public void test34() throws Exception {
        String filePath1 = "frontapp/static/img/colorado.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "colorado.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("콜로라도")
                    .brand("쉐보레")
                    .minPrice(4050)
                    .maxPrice(6476)
                    .modelYear(2023)
                    .vehicle("트럭")
                    .size("준대형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("XM3")
    public void test35() throws Exception {
        String filePath1 = "frontapp/static/img/XM3.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "XM3.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("XM3")
                    .brand("르노")
                    .minPrice(2235)
                    .maxPrice(2864)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("소형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("QM6")
    public void test36() throws Exception {
        String filePath1 = "frontapp/static/img/QM6.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "QM6.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("QM6")
                    .brand("르노")
                    .minPrice(2495)
                    .maxPrice(3670)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("SM6")
    public void test37() throws Exception {
        String filePath1 = "frontapp/static/img/SM6.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "SM6.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("SM6")
                    .brand("르노")
                    .minPrice(2925)
                    .maxPrice(3695)
                    .modelYear(2023)
                    .vehicle("세단")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("MASTER")
    public void test38() throws Exception {
        String filePath1 = "frontapp/static/img/MASTER.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "MASTER.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("MASTER")
                    .brand("르노")
                    .minPrice(3310)
                    .maxPrice(4699)
                    .modelYear(2023)
                    .vehicle("밴")
                    .size("대형")
                    .fuel("디젤")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("토레스")
    public void test39() throws Exception {
        String filePath1 = "frontapp/static/img/torres.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "torres.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("토레스")
                    .brand("KG모빌리티")
                    .minPrice(2627)
                    .maxPrice(3706)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("티볼리")
    public void test40() throws Exception {
        String filePath1 = "frontapp/static/img/tivoli.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "tivoli.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("티볼리")
                    .brand("KG모빌리티")
                    .minPrice(2312)
                    .maxPrice(2719)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("소형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("코란도")
    public void test41() throws Exception {
        String filePath1 = "frontapp/static/img/colorado.avif"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "colorado.avif", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("코란도")
                    .brand("KG모빌리티")
                    .minPrice(2445)
                    .maxPrice(3060)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준중형")
                    .fuel("가솔린")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("렉스턴")
    public void test42() throws Exception {
        String filePath1 = "frontapp/static/img/rexton.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "rexton.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("렉스턴")
                    .brand("KG모빌리티")
                    .minPrice(4010)
                    .maxPrice(5213)
                    .modelYear(2023)
                    .vehicle("SUV")
                    .size("준대형")
                    .fuel("디젤")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("렉스턴 스포츠")
    public void test43() throws Exception {
        String filePath1 = "frontapp/static/img/rexton_sport.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "rexton_sport.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("렉스턴 스포츠")
                    .brand("KG모빌리티")
                    .minPrice(2879)
                    .maxPrice(4031)
                    .modelYear(2023)
                    .vehicle("트럭")
                    .size("준대형")
                    .fuel("디젤")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }

    @Test
    @DisplayName("렉스턴 스포츠 칸")
    public void test44() throws Exception {
        String filePath1 = "frontapp/static/img/rexton_sport_khan.png"; // 클래스패스 상의 경로
        // 파일 경로에서 InputStream 생성
        InputStream inputStream1 = new FileInputStream(filePath1);
        byte[] content = inputStream1.readAllBytes();
        MultipartFile multipartFile = new MockMultipartFile("file", "rexton_sport_khan.png", "image/png", content);
        List<Board> boards = boardService.addBoard(List.of(multipartFile));

        for (Board board : boards) {
            HelloCar h = HelloCar.builder()
                    .carname("렉스턴 스포츠 칸")
                    .brand("KG모빌리티")
                    .minPrice(3104)
                    .maxPrice(4246)
                    .modelYear(2023)
                    .vehicle("트럭")
                    .size("준대형")
                    .fuel("디젤")
                    .board(board)
                    .createDate(LocalDateTime.now())
                    .build();
            this.helloCarRepository.save(h);
        }
    }
}
