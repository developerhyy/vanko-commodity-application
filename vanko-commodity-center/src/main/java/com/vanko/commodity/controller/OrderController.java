package com.vanko.commodity.controller;

import com.deepexi.middle.commodity.domain.OrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@RestController
@RequestMapping("/order")
@Slf4j
@Api(value = "订单管理接口", description = "订单接口服务")
public class OrderController {

    @GetMapping(value = "/queryOrdersByUserId/{userId}")
    @ResponseBody
    @ApiOperation(value = "根据用户ID查询订单信息", notes = "根据url的用户ID来获取订单详细信息")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    public List<OrderVO> queryOrdersByUserId(@PathVariable("userId") Integer userId) throws InterruptedException {
        log.info("。。。。。。。");


        List<OrderVO> list = new ArrayList<>();
        OrderVO orderVo = new OrderVO();
        orderVo.setChineseName("商品");
        orderVo.setPrice(new BigDecimal(200));
        orderVo.setProductCode("XXXX");
        list.add(orderVo);
        //sku，，
        return list;
    }



}
