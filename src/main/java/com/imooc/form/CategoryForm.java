package com.imooc.form;

import lombok.Data;

/**
 * author: JST - Dayu
 * date:   2018-11-12  19:27
 * context:
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
