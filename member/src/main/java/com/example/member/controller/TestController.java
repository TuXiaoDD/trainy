package com.example.member.controller;

import com.example.common.TestUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        TestUtil.test();
        return "hello";
    }

}
