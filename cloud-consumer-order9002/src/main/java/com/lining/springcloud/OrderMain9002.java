package com.lining.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lining
 * @date 2021/6/19 11:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9002.class, args);
    }
}
