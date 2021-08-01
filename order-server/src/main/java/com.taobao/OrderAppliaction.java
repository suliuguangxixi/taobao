package com.taobao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(OrderAppliaction.class);
        System.out.println("--------------------------------启动成功-----------------------------");
    }
}
