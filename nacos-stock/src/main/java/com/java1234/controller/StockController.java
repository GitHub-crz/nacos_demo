package com.java1234.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2021-03-26 11:04
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/test")
    public String test(String info){
        return "库存模块接收到的信息："+info;
    }
}
