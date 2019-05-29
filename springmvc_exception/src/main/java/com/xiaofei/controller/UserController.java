package com.xiaofei.controller;

import com.xiaofei.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <Description> <br>
 *用户的异常测试
 * @author 小飞<br>
 * @version 1.0<br>
 * @createDate 2019/05/27<br>
 * @see com.xiaofei.controller <br>
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testException")
    public String testException()throws SysException{
        System.out.println("testException执行了");
        try {
            int a = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询用户信息是出现错误！");
        }
        return "success";
    }
}
