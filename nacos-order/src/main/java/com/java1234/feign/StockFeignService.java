package com.java1234.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2021-03-26 11:06
 */
@FeignClient("nacos-stock")
public interface StockFeignService {

    @RequestMapping("/stock/test")
    public String test(@RequestParam("info") String info);
}
