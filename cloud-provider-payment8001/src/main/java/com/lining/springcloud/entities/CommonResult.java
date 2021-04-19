package com.lining.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lining
 * @date 2021/4/19 18:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult(String code, String message) {
        this(code, message, null);
    }
}
