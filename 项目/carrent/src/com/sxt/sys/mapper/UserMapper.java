package com.sxt.sys.mapper;

import com.sxt.sys.domain.User;
import com.sxt.sys.vo.UserVo;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 登陆
     */
    User login(User user);

	void addUser(UserVo userVo);

	void updateUser(UserVo userVo);
}