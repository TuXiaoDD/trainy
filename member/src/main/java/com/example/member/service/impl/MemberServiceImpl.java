package com.example.member.service.impl;

import com.example.member.entity.MemberDO;
import com.example.member.mapper.MemberMapper;
import com.example.member.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lym
 * @since 2023-07-20
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, MemberDO> implements MemberService {

}
