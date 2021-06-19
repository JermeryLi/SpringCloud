package com.lining.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lining
 * @date 2021/6/19 11:51
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9001.class, args);
    }
}
