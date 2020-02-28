package com.vanko.commodity.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@Data
@ApiModel("商品新增聚合对象")
public class GoodsVO {

    /**
     * item聚合
     */
    @ApiModelProperty("item聚合")
    private ItemWholeVO itemWhole;

    /**
     * sku
     */
    @ApiModelProperty("sku")
    private List<SkuVO> sku;
}
