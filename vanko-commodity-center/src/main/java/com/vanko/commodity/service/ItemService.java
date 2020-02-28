package com.vanko.commodity.service;

import com.vanko.commodity.domain.vo.GoodsVO;

/**
 * @author huangyy
 * @date 2020/2/28
 */
public interface ItemService {
    /**
     * 新增商品
     *
     * @param goodsVO 要新增的商品对象
     * @return 新增后的商品id
     */

    Long addGoods(GoodsVO goodsVO);
    /**
     * 校验参数
     * @param goodsVO
     * @return
     */
    Boolean checkCode(GoodsVO goodsVO);
}
