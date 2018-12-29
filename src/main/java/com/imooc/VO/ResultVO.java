package com.imooc.VO;

import lombok.Data;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
