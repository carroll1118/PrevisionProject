package com.qd.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

public List<Map> getUserList(Map map);

public List<Map> getAnswerQuestionNumUser();

public List<Map> getUserJobLocation();

public List<Map> getDiePowderUser();

}

