package com.qd.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qd.demo.Service.FansNumUserService;


@Controller
@RequestMapping("fans")
public class FansNumUserController {

	@Autowired
	private FansNumUserService fansNumUserService;
	
	
          
	//getMostFansNumUser
	@RequestMapping("/getMostFansNumUser")
	@ResponseBody
	public List<Map > chart_0_data(){
		
		List<Map> list = fansNumUserService.getMostFansNumUser();
		System.out.println(list);
	
		return list;
	}

}
