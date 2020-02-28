package com.vanko.commodity.controller;

import com.vanko.commodity.domain.dto.GoodsDTO;
import com.vanko.commodity.domain.vo.GoodsVO;
import com.vanko.commodity.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyy
 * @date 2020/2/28
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/goods")
@Slf4j
public class GoodsController {

    @Autowired
    private ItemService itemService;

    @ApiOperation("添加商品")
    @PostMapping
    public Long addGoods(@RequestBody GoodsVO goodsVO) {

        if (null != goodsVO){
            //TODO 校验页面传入数据
            itemService.checkCode(goodsVO);
        }
        Long goodsId = itemService.addGoods(goodsVO);
        if (goodsId > 0){
            //TODO 新增商品上架信息
        }
        return goodsId;
    }
}
