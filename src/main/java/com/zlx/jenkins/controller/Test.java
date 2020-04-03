package com.zlx.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("1")
    public String back(){
        String s = "nihaoa jenkins";
        System.out.println(s);
        return s;
    }
}
