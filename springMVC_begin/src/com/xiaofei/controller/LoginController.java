package com.xiaofei.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * ��ת����¼ҳ��
 * 
 * @author С��
 *@date 2019/5/9
 */
public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("/WEB-INF/jsp/login.jsp");
	}

}
