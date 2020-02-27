package com.vanko.commodity.controller;


import com.deepexi.middle.commodity.api.BrandFeignApi;
import com.deepexi.middle.commodity.domain.BrandVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@RestController
@RequestMapping("/brand")
@Slf4j
@Api("品牌管理")
public class BrandController {

    @Autowired
    private BrandFeignApi brandFeignApi;

    @GetMapping("/{id:[0-9,]+}")
    @ApiOperation(value = "查询单个品牌")
    public BrandVO queryUserInfoById(@PathVariable("id") Long id) {
        return brandFeignApi.getBrand(id);
    }
}
