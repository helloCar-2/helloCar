package com.example.helloCar.domain.hellocar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Controller
@RequiredArgsConstructor
@RequestMapping("/hellocar")
public class HelloCarController {
    @GetMapping("/list")
    public String list(){
        return "car_list";
    }
    @GetMapping("/start")
    public String start() {
        return "hellocar_start";
    }

    @GetMapping("/home")
    public String home() {
        return "car_home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/testdrive")
    public String car_testdrive() {
        return "car_testdrive";
    }


    @GetMapping("/login_search")
    public String login_search() {
        return "login_search";
    }

    @GetMapping("/signup_form_email")
    public String signup_form_email() {
        return "signup_form_email";
    }

    @GetMapping("/signup_form")
    public String signup_form() {
        return "signup_form";
    }

    @GetMapping("/password_search")
    public String password_search() {
        return "password_search";
    }

    @GetMapping("/chat_qna")
    public String chat_qna() {
        return "chat_qna";
    }
    @GetMapping("/testdrive_list")
    public String testdrive_list() {
        return "testdrive_list";
    }
    @GetMapping("/compare")
    public String compare() {
        return "car_compare";
    }
    @GetMapping("/searchandselect")
    public String seachAndSelect() {
        return "car_searchandselect";
    }

    @GetMapping("/mypage")
    public String myPage(){
        return "my_page";
    }
    @GetMapping("/wish_list")
    public String wishList(){
        return "wish_list";
    }
}

