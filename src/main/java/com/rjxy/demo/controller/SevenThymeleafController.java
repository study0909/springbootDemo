package com.rjxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class SevenThymeleafController {

    @GetMapping("/seven")
    public String indexPage(Model m){
        //日期和时间
        Date date=new Date();
        m.addAttribute("date",date);
        //小数的金额
        double price=128.5678D;
        m.addAttribute("price",price);
        //定义大文本数据
        String str="Thymeleaf 是 Web 和独立环境的现代服务器端 Java 模板引擎，能够处理 HTML，XML，JavaScript，CSS 甚至纯文本。\\r\\n\" + \"Thymeleaf 的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了 实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设 计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \"Thymeleaf 也从一开始就设计了 Web 标准 - 特别是 HTML5 - 允许您创建完全 验证的模板，如果这是您需要的\\r\\n";
        m.addAttribute("strText",str);
        //定义字符串
        String str2="JAVA-offcn";
        m.addAttribute("str2",str2);
        return "index7";
    }
}
