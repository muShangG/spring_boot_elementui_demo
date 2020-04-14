package com.example.spring_boot_elementui_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.example.spring_boot_elementui_demo.mapper")
@SpringBootApplication
public class SpringBootElementuiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootElementuiDemoApplication.class, args);
    }

}
