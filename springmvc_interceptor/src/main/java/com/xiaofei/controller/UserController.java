package com.xiaofei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <Description> <br>
 *用户控制器
 * @author 小飞<br>
 * @version 1.0<br>
 * @createDate 2019/05/27<br>
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("MyInterceptor执行了");
        return "success";
    }
}
