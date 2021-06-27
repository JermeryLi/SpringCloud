package com.lining.springcloud.controller;

import com.lining.springcloud.entities.CommonResult;
import com.lining.springcloud.entities.Payment;
import com.lining.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author lining
 * @date 2021/4/19 18:39
 */
@RestController
@Slf4j
public class PayController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult<>("200", "插入数据库成功, serverPort:" + serverPort, result);
        } else {
            return new CommonResult<>("444", "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult<>("200", "查询成功, serverPort:" + serverPort, payment);
        } else {
            return new CommonResult<>("444", "查询失败，没有对应记录，查询id:" + id, null);
        }
    }

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "SpringCloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
