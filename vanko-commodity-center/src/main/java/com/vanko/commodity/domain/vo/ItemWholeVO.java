package com.vanko.commodity.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@Data
@ApiModel("item聚合")
public class ItemWholeVO implements Serializable {

    /**
     * spuID
     */
    @ApiModelProperty("spuID")
    private Long spuId;
    /**
     * 类目ID
     */
    @ApiModelProperty("类目ID")
    private Long categoryId;
    /**
     * 品牌ID
     */
    @ApiModelProperty("品牌ID")
    private Long brandId;

    /**
     * 品牌名称
     */
    @ApiModelProperty("品牌名称")
    private String chineseName;

    /**
     * 类目名称
     */
    @ApiModelProperty("类目名称")
    private String categoryName;
    /**
     * 店铺ID
     */
    @ApiModelProperty("店铺ID")
    private Long shopId;
    /**
     * item编号
     */
    @ApiModelProperty("item编号")
    private String code;
    /**
     * item名称
     */
    @ApiModelProperty("item名称")
    private String name;
    /**
     * 商品副名称
     */
    @ApiModelProperty("商品副名称")
    private String subName;
    /**
     * 主图
     */
    @ApiModelProperty("主图")
    private String majorPicture;
    /**
     * 审核状态
     */
    @ApiModelProperty("审核状态")
    private Integer status;

    /**
     * 上架状态
     */
    @ApiModelProperty("上架状态")
    private Integer saleStatus;

    /**
     * item详情数组
     * ItemDetailVO
     */
    @ApiModelProperty("item详情数组")
    private List<Object> itemDetail;

    /**
     * item属性值数组
     * ItemPropertyVO
     */
    @ApiModelProperty("item属性值数组")
    private List<Object> itemProperty;

}
