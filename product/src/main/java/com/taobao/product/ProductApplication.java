package com.taobao.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataID = "example" , autoRefreshed = true )
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
        System.out.println("-------------product-----------启动");
    }
}
