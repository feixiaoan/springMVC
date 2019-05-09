package com.xiaofei.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * Ìø×ªµ½×¢²á
 * 
 * @author Ð¡·É
 * @date 2019/5/9
 */
public class RegisterController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("/WEB-INF/jsp/register.jsp");
	}

}
