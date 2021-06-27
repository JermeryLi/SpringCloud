package com.lining.springcloud.dao;

import com.lining.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import javax.websocket.server.PathParam;

/**
 * @author lining
 * @date 2021/4/19 18:22
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@PathParam("id") Long id);
}
