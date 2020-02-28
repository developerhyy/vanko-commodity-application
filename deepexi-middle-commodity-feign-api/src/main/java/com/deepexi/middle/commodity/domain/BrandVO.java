package com.deepexi.middle.commodity.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@Data
@ApiModel("品牌VO")
public class BrandVO implements Serializable {
    private static final long serialVersionUID = -1;

    private Long id;

    /**
     * 品牌中文名
     */
    @ApiModelProperty("商品名称")
    private String chineseName;
}
