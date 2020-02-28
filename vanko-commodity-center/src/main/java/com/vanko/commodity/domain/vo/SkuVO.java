package com.vanko.commodity.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@ApiModel("sku视图实体")
@Data
public class SkuVO{
    @ApiModelProperty("price")
    private BigDecimal price;
    @ApiModelProperty("itemID")
    private Long itemId;
    @ApiModelProperty("关联specID")
    private Long cspuId;
    @ApiModelProperty("主图")
    private String majorPicture;
    @ApiModelProperty("sku编号")
    private String code;
    /**
     * SkuPropertyValueVO
     */
    @ApiModelProperty("sku属性数组")
    List<Object> skuPropertyValue;

}
