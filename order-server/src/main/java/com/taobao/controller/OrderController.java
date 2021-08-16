package com.taobao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer id, String users) {
        String s = restTemplate.getForObject("http://localhost:9000/product/12", String.class);
        return "id:" + id + "    users:" + users + "  " + s;
    }
}
