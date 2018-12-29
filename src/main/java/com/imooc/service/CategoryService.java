package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
