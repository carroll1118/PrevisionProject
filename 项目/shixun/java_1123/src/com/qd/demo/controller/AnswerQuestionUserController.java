package com.qd.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qd.demo.Service.UserService;
@Controller
@RequestMapping("user")
public class AnswerQuestionUserController {
	
	@Autowired
	private UserService userService;
	
	//知乎回答问题最多的100位用户数据
	@RequestMapping("/getAnswerQuestionNumUser")
	@ResponseBody
	public List<Map > chart_1_data(){
		
			return userService.getAnswerQuestionNumUser();
	}
	

	//知乎用户职业分布  
	@RequestMapping("/getUserJobLocation")
	@ResponseBody
	public List<Map > getUserJobLocation(){
		
		return userService.getUserJobLocation();
	}

	
	
	//知乎僵尸粉统计功能 数据  getDiePowderUser
	@RequestMapping("/getDiePowderUser")
	@ResponseBody
	public List<Map > getDiePowderUser(){
				
			return userService.getDiePowderUser();
	}

}
