package com.xiaofei.controller;

import com.xiaofei.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 用户控制类
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * testString对字符串的返回值进行测试
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString方法执行了");
        //模拟从数据
        User user = new User();
        user.setUsername("闫儿子");
        user.setPassword("123456");
        user.setAge(12);
        model.addAttribute("user",user);
        return "success";
    }
    /**
     * 测试返回值为Void
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid方法执行了");
        //编写请求转发程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath() + "/index.jsp");
        //设置中文乱码
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //直接进行响应
        response.getWriter().print("你好");
        return;
    }
    /**
     * 测试ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        System.out.println("testModelAnView方法执行了");
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        //模拟从数据库中查询user对象
        User user = new User();
        user.setUsername("闫儿子");
        user.setPassword("123456");
        user.setAge(12);
        //把user对象存储到MV对象中，也会把user对象存入到request对象
        mv.addObject("user",user);
        //跳转到页面
        mv.setViewName("success");
        return mv;
    }
    /**
     * 测试Forward和Redirect关键字
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String tsetForwardOrRedirect() {
        System.out.println("testForwardOrRedirect执行了");
        //请求转发
        //return "forward:/WEB-INF/pages/success.jsp";
        //重定向
        return "redirect:/index.jsp";
    }

    /**
     * json格式的接收和响应
     * @param user
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User tsetAjax(@RequestBody User user) {
        System.out.println("testAjax执行了");
        //客户端发送的Ajax的请求，传的是json的字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        //做相应，模拟查询数据库
        user.setUsername("hehehehe");
        user.setAge(23);
        //做响应
        return user;
    }

}
