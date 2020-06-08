package com.rjxy.demo.controller;

import com.rjxy.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    @GetMapping("/three")
    public String indexPage(Model m){
        List<User> list=new ArrayList<>();
        User u1=new User();
        u1.setId(2);
        u1.setName("小明");
        u1.setAge(18);
        list.add(u1);
        User u2=new User();
        u2.setId(3);
        u2.setName("小红");
        u2.setAge(19);
        list.add(u2);
        User u3=new User();
        u3.setId(4);
        u3.setName("小蓝");
        u3.setAge(20);
        list.add(u3);
        User u4=new User();
        u4.setId(5);
        u4.setName("小绿");
        u4.setAge(21);
        list.add(u4);
        m.addAttribute("userlist",list);
        return "index3";
    }
}
