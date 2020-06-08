package com.rjxy.demo.controller;

import com.rjxy.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model m){
        String message="Hello,Thymeleaf!";
        User user=new User();
        user.setId(1);
        user.setName("小黑");
        user.setAge(18);
        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        m.addAttribute("message",message);
        m.addAttribute("user",user);
        m.addAttribute("src",map);
        return "index2";
    }
}
