package com.imooc.dto;

import lombok.Data;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
