package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
