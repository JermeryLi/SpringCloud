package com.lining.springcloud.service;

import com.lining.springcloud.entities.Payment;

import javax.websocket.server.PathParam;

/**
 * @author lining
 * @date 2021/4/19 18:36
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@PathParam("id") Long id);
}
