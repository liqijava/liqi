package com.fh.shop.member.mapper;

import com.fh.shop.member.po.Member;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.swing.*;
import java.util.List;

public interface IMemberMapper {

    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "memberName", property = "memeberName"),
            @Result(column = "realName", property = "realName")
    })
    @Select("select id,memberName,realName from t_member")
    public List<Member> findMemberList();
}
