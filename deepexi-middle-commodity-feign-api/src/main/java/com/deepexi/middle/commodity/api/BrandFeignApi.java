package com.deepexi.middle.commodity.api;

import com.deepexi.middle.commodity.config.CommodityFeignConfig;
import com.deepexi.middle.commodity.domain.BrandVO;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangyy
 * @date 2020/2/27
 */
@FeignClient(name = "deepexi-middle-commodity",configuration = CommodityFeignConfig.class)
@RequestMapping("/commodity/brands")
public interface BrandFeignApi {

    @GetMapping("/{id}")
    BrandVO getBrand(@PathVariable(value = "id") Long id);
}
