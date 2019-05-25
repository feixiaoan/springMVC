package com.xiaofei.controller;

import com.xiaofei.domain.Account;
import com.xiaofei.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * 参数控制器
 */
@Controller
@RequestMapping("/paramController")
public class ParamController {
    /**
     * 请求参数绑定
     * @return param.jsp
     */
    @RequestMapping("/sayParam")
    public String sayParam(String username, String password) {
        System.out.println("参数绑定成功");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        return "param";
    }

    /**
     * 接受用户提交的参数并把参数封装到javaBean中
     * @param account
     * @return 返回success页面
     */
    @RequestMapping("sayAccount")
    public String sayAccount(Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器进行日期转换
     * @param user
     * @return
     */
    @RequestMapping("/sayUser")
    public String sayUser(User user) {
        System.out.println(user);
        return "param";
    }

    /**
     * 进行参数的接收
     * @param uname
     * @param age
     * @return
     */

    /*@RequestMapping("/sayRequestParam")
    public String sayRequestParam(@RequestParam("name") String uname,
                                  @RequestParam("age") Integer age) {
        System.out.println("用户名：" + uname + "年龄：" + age);
        return "param";
    }*/

    /**
     * 进行@ModelAttribute的测试
     * @param user
     * @return
     */
    @RequestMapping("/sayModelAttribute")
    public String sayModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("ModelAttribute执行了");
        System.out.println(user);
        return "param";
    }

    /**
     * 无返回值，用Map存
     * @param uname
     * @param age
     * @return
     */
    @ModelAttribute
    public void showUser(String uname, Integer age, Map<String,User> map) {
        System.out.println("ModelAttribute");
        User user = new User();
        user.setUname(uname);
        user .setAge(age);
        user.setDate(new Date());
        map.put("abc",user);
    }
   /* *//**
     *ModeAttribute 先执行
     * 有返回值
     *//*
    @ModelAttribute
    public User showUser(String uname,Integer age) {
        System.out.println("ModelAttribute");
        User user = new User();
        user.setUname(uname);
        user .setAge(age);
        user.setDate(new Date());
        return user;
    }*/

    /**
     * 测试@PathVariable注解
     * @param sid
     * @return
     */
    @RequestMapping("/sayPathVariable/{id}")
    public String sayPathVariable(@PathVariable(name="id") String sid) {
        System.out.println(sid);
        return "param";
    }

    /**
     * 测试@RequestBody
     * @param body
     * @return
     */
    @RequestMapping("/sayRequestBody")
    public String sayRequestBody(@RequestBody String body){
        System.out.println(body);
        return "param";
    }




}
