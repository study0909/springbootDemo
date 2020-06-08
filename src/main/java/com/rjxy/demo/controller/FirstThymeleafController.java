package com.rjxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

    @GetMapping("/first")
    public String indexPage(Model m){
        String message="Hello,Thymeleaf!";
        m.addAttribute("message",message);
        return "index";
    }
}
