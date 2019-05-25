package com.xiaofei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  控制器类
 * @author 小飞
 */
@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("你好，世界");
        return "success";
    }
    @RequestMapping(value = "/testRequestMapping",params = {"username"} )
    public String testRequestMapping() {
        System.out.println("测试RequestMapping");
        return "success";
    }
}
