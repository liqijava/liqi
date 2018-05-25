package com.fh.shop.member.po;

import java.io.Serializable;

public class Member implements Serializable {

    private static final long serialVersionUID = 6690553829003107688L;

    private Integer id;

    private String memeberName;

    private String realName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemeberName() {
        return memeberName;
    }

    public void setMemeberName(String memeberName) {
        this.memeberName = memeberName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
