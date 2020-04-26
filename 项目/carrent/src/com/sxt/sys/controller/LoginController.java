package com.sxt.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.sys.constast.SysConstast;
import com.sxt.sys.domain.User;
import com.sxt.sys.service.UserService;
import com.sxt.sys.utils.WebUtils;
import com.sxt.sys.vo.UserVo;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	//跳转到登录页面
	@RequestMapping("toLogin")
	public String toLogin() {
		return "system/main/login";
	}
	
	//登录方法
	@RequestMapping("login")
	public String login(UserVo userVo,Model model) {
		User user = this.userService.login(userVo);
		if(null!=user) {
			WebUtils.getHttpSession().setAttribute("user", user);
			
			return "system/main/index";
		}else {
			model.addAttribute("error",SysConstast.USER_LOGIN_ERROR_MSG);
			return "system/main/login";
		}
	}

}
