package com.example.helloCar.domain.hellocar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/hellocar")
public class HelloCarController {
    @GetMapping("/start")
    public String start(){
        return "hellocar_start";
    }
    @GetMapping("/home")
    public String home(){
        return "car_home";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/testdrive")
    public String testdrive(){
        return "car_testdrive";
    }
}

