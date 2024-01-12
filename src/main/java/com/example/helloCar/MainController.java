package com.example.helloCar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/home")
    @ResponseBody
    public String test(){
        return "안녕하세요";
    }
}
