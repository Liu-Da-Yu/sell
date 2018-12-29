package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
