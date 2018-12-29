package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
