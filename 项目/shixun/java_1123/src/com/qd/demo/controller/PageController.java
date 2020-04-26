package com.qd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller 
@RequestMapping("page")
public class PageController {
	
	//
	@RequestMapping("/chart_0")
	public ModelAndView getindex(){
		System.out.println("-----------1");
		ModelAndView mv = new ModelAndView("/chart_0.jsp");
		return mv;
		
	}
       
	
	
	//知乎回答问题最多的100位用户 
	//getAnswerQuestionNumUser
	@RequestMapping("/chart_1")
	public ModelAndView getchart_1(){
		
		ModelAndView model = new ModelAndView("/chart_1.jsp");
		return model;
		
	}
	
	
	//知乎用户就业方向
	@RequestMapping("/chart_2")
	public ModelAndView getchart_2(){
		
		ModelAndView model = new ModelAndView("/chart_2.jsp");
		return model;
		
	}
	
	
	//知乎僵尸粉统计功能
	@RequestMapping("/chart_3")
	public ModelAndView getchart_3(){
		
		ModelAndView model = new ModelAndView("/chart_3.jsp");
		return model;
		
	}
	
	
	@RequestMapping("/chart_4")
	public ModelAndView getchart_4(){
		
		ModelAndView model = new ModelAndView("/chart_4.jsp");
		return model;
		
	}
	
	//知乎的高校用户
	@RequestMapping("/chart_5")
	public ModelAndView getchart_5(){
		
		ModelAndView model = new ModelAndView("/chart_5.jsp");
		return model;
		
	}
	
	
	//知乎问题导向功能
	@RequestMapping("/chart_6")
	public ModelAndView getchart_6(){
		
		ModelAndView model = new ModelAndView("/chart_6.jsp");
		return model;
		
	}
	
	//用户兴趣画像功能
	@RequestMapping("/chart_7")
	public ModelAndView getchart_7(){
		
		ModelAndView model = new ModelAndView("/chart_7.jsp");
		return model;
		
	}
	


}
