package com.qd.demo.Service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public List<Map> getAnswerQuestionNumUser();

	public List<Map> getUserJobLocation();


	public List<Map> getDiePowderUser();


}
