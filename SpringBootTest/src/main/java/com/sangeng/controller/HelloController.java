package com.sangeng.controller;

import com.sangeng.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController //相当于@Controller+@ResponseBody
public class HelloController {
    @Value("${student.lastName}")
    private String lastName;

    @Autowired
    private Student stu;

    @RequestMapping("/hello")
    public String hello() {
        return "HelloSpringBoot";
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println(stu);
        return "test";
    }




}
