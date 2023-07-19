package com.example.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.member.entity.TestDO;
import com.example.member.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestDO> {
}
