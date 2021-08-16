package com.taobao.product.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "order")
public class User {

    private int maxNum = 12 ;

    private boolean tset = false ;

}
