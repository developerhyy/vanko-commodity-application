package com.deepexi.middle.commodity.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@ApiModel("订单DTO")
@Getter
@Setter
public class OrderVO {
    /**
     * 品牌中文名
     */
    @ApiModelProperty("商品名称")
    private String chineseName;
    /**
     * 商品编码
     */
    @ApiModelProperty("商品编码")
    private String productCode;
    /**
     * 商品价格
     */
    @ApiModelProperty("商品价格")
    private BigDecimal price;
}
