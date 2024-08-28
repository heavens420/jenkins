package com.zlx.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhao LongLong
 * @Date 2020/10/10
 * @Version 1.0
 * @Desc
 */
@RequestMapping("/")
@RestController
public class BaseController {

    String str = "hello jenkins 88";
    String str2 = "hello jenkins 88";

    @RequestMapping("/")
    public String goPage1(){
        return str;
    }

    public static void main(String[] args) {
        double a = Math.pow(16, 17);
        double b = Math.pow(17, 16);

        System.out.println(a < b);
    }
}
