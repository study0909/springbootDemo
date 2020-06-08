package com.rjxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {

    @GetMapping("/four")
    public String indexPage(Model m){
        m.addAttribute("userName","小花");
        m.addAttribute("href","www.baidu.com");
        return "index4";
    }
}
