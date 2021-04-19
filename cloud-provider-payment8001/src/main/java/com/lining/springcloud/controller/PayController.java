package com.lining.springcloud.controller;

import com.lining.springcloud.entities.CommonResult;
import com.lining.springcloud.entities.Payment;
import com.lining.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lining
 * @date 2021/4/19 18:39
 */
@RestController
@Slf4j
public class PayController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入payment:" + result);
        if(result > 0){
            return new CommonResult<>("200", "插入数据库成功", result);
        }else{
            return new CommonResult<>("444", "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询payment:" + payment);
        if(payment != null){
            return new CommonResult<>("200", "查询成功", payment);
        }else{
            return new CommonResult<>("444", "查询失败，没有对用记录，查询id:" + id, null);
        }
    }


}
