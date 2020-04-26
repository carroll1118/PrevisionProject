package com.qd.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
@Service
public interface UserQuestionService {

	List<Map> getUserQuestion();

	List<Map> getUserInterest();

}
