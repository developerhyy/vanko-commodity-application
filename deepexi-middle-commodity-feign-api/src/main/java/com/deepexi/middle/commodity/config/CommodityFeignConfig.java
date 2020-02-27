package com.deepexi.middle.commodity.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author huangyy
 * @date 2020/2/27
 */
public class CommodityFeignConfig {
    @Bean
    public Logger.Level level() {
        //return Logger.Level.FULL;
        //return Logger.Level.HEADERS;
        return Logger.Level.BASIC;
        //return Logger.Level.NONE;
    }
}
