package com.example.AutoSys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.AutoSys.mapper")  // 이 부분 필수
public class AutoSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoSysApplication.class, args);
	}

}
