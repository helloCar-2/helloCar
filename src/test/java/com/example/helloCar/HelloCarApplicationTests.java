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
                    .carname("소나타")
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
}
