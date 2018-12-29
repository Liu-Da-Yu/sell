package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
