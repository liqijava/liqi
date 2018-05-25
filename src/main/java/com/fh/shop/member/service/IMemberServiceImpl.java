package com.fh.shop.member.service;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.member.mapper.IMemberMapper;
import com.fh.shop.member.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberService")
public class IMemberServiceImpl implements IMemberService {

    @Autowired
    private IMemberMapper memberMapper;

    @Override
    public ServerResponse findMemberList() {
        List<Member> memberList = memberMapper.findMemberList();
        return ServerResponse.success(memberList);
    }
}
