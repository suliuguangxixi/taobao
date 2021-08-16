package com.taobao.product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NacosPropertySource(dataID = "example" , autoRefreshed = true )
public class ProductController {

    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable Integer productId) {
        return "手机 " + productId;
    }

}
