package com.vanko.commodity.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@Data
public class GoodsDTO{

    /**
     * item聚合ItemWholeDTO
     */
    private Object itemWhole;

    /**
     * sku SkuDTO
     */
    private List<Object> sku;
}
