package com.vanko.commodity.service.impl;

import com.vanko.commodity.domain.vo.GoodsVO;
import com.vanko.commodity.domain.vo.ItemWholeVO;
import com.vanko.commodity.domain.vo.SkuVO;
import com.vanko.commodity.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    @Override
    public Long addGoods(GoodsVO goodsVO) {
        Long goodsId = null;
        Long skuId = null;
        //新增Item信息
        if(goodsVO.getItemWhole() != null){
            goodsId = 0L;//TODO 调用远程itemBusinessService.saveItemWhole(goodsVO.getItemWhole());
            //新增sku信息【sku属性都在这里for循环加入】
            if(goodsVO.getSku() != null){
                List<SkuVO> sku = goodsVO.getSku();
                for (SkuVO skuDTO : sku) {
                    skuDTO.setItemId(goodsId);
                }
                //批量保存报错StackOver
                //批量新增调用远程SkuApi.saveBatch(sku)
                //TODO skuService.saveBatch(sku);
            }

        }
        return goodsId;
    }

    @Override
    public Boolean checkCode(GoodsVO dto) {
        ItemWholeVO itemWhole = dto.getItemWhole();
        if (null != itemWhole){
            Object itemVO =itemWhole;
            log.info("校验item:{}",itemVO);
            //TODO 调用middle的ItemBusinessApi.checkItemCode(itemDTO);
        }
        List<SkuVO> sku = dto.getSku();
        if ((sku != null) && (sku.size() > 0)){
            log.info("校验sku:{}",sku);
            //TODO 调用middle的SkuApi.checkSkuCode(sku)
        }
        return true;
    }
}
