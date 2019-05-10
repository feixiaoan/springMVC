package com.xiaofei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Demo class
 * 
 * @author 小飞
 * @date 2019/5/10
 */

@Controller
@RequestMapping(value="/index")
public class IndexController {
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/register")
	public String register() {
		return "register";
	}
}
