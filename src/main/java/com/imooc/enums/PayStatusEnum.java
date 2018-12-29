package com.imooc.enums;

import lombok.Getter;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
