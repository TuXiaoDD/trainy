package com.example.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.member.entity.TestDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper extends BaseMapper<TestDO> {
}


