package com.fh.shop.member.controller;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.member.service.IMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Resource(name="memberService")
    private IMemberService memberService;

    @GetMapping("/memberlist")
    public ServerResponse memberlist() {
        ServerResponse serverResponse = memberService.findMemberList();
        return serverResponse;
    }
}
