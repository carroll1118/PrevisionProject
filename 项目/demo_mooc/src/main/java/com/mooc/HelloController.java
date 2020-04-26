package com.mooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  @Controller  +   @ResponseBody  ==  @RestController
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private LimitConfig limitConfig;
	
	 @GetMapping("/say")
	// @PostMapping("/say")
	// @RequestMapping("/say")
	public String say() {
		return  limitConfig.getDescription();
	}

}
