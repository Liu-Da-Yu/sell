package com.imooc.enums;

import lombok.Getter;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
