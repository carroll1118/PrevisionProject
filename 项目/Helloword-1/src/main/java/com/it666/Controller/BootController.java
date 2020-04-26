package com.it666.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
	
	@ResponseBody
	@RequestMapping("/request")
	public String request() {
		return "hello word";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> map) {
		
		map.put("welcome", "welcomethymeleaf");
		
		return "result";
	}

}
