package com.source.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *可以使用@RequestParam从请求中提取查询参数，表单参数甚至文件
     * 例如 /test/params 与 /test/params?num=1的请求都可以被该controller处理
     *
     * @param num
     * @return
     */
    @GetMapping("/params")
    public String test(@RequestParam(name = "num",required = false)Integer num){
        System.out.println(111);
        return "测试完成";
    }
}
