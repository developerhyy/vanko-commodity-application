package com.deepexi.middle.commodity.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("品牌DTO")
public class BrandVO implements Serializable {
    private static final long serialVersionUID = -1;

    private Long id;

    /**
     * 品牌中文名
     */
    private String chineseName;
}
