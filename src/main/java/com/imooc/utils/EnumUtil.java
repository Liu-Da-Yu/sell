package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
