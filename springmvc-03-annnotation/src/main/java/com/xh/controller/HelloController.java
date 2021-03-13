package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String sayHello(Model model){
        model.addAttribute("msg","helloSpringMvc====OVO");
        //这里返回值会自动传到视图解析器进行拼接/WEB-INF/jsp/ + hello + /.jsp
        return "hello";
    }

}
