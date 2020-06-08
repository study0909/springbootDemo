package com.rjxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiveThymeleafController {

    @GetMapping("/five")
    public String indexPage(Model m){
        m.addAttribute("flag","yes");
        m.addAttribute("menu","admin");
        m.addAttribute("manager","manager");
        return "index5";
    }
}
