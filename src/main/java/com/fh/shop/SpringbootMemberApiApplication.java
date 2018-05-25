package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.shop.member.mapper")
public class SpringbootMemberApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMemberApiApplication.class, args);
	}
}
