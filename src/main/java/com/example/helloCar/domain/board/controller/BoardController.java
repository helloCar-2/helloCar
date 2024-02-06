package com.example.helloCar.domain.board.controller;

import com.example.helloCar.domain.board.service.BoardService;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

//    @GetMapping("/board")
//    public String getBoard(@RequestParam long id) {
//        Board board = boardService.findBoard(id).orElseThrow(RuntimeException::new);
//        String imgPath = board.getStoredFileName();
//
//        return "<img src=" + imgPath + ">";
//    }
}
