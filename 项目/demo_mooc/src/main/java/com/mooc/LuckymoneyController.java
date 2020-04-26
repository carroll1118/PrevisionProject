package com.mooc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


public class LuckymoneyController {
    
	@Autowired
	private LunckymoneyRepository repository;
	
	@GetMapping("/Luckymoneys")
	public List<Luckymoney> list() {
		return repository.findAll();
		
	}

}
