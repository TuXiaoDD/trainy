package com.example.member.controller;

import com.example.common.TestUtil;
import com.example.member.entity.TestDO;
import com.example.member.mapper.TestMapper;
import com.example.member.service.impl.TestServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    TestServiceImpl testService;

    @RequestMapping("/hello")
    public Long hello() {
        TestDO testDO = testService.getBaseMapper().selectById(1L);
        return testDO.getId();
    }

}
