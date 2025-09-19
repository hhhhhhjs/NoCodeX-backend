package com.example.aibyhhhhhhjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.aibyhhhhhhjs.mapper")
public class AiByhhhhhhjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiByhhhhhhjsApplication.class, args);
	}

}
