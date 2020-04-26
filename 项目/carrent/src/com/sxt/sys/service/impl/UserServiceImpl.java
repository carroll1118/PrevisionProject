package com.sxt.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.sxt.sys.domain.User;
import com.sxt.sys.mapper.UserMapper;
import com.sxt.sys.service.UserService;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(UserVo userVo) {
		//明文123456
		//生成密文

		String pwd=DigestUtils.md5DigestAsHex(userVo.getPwd().getBytes());
		userVo.setPwd(pwd);
		
		return userMapper.login(userVo);
	}

	@Override
	public DataGridView queryAllUser(UserVo userVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(UserVo userVo) {
		// TODO Auto-generated method stub
		userMapper.addUser(userVo);
		
	}

	@Override
	public void updateUser(UserVo userVo) {
		// TODO Auto-generated method stub
		userMapper.updateUser(userVo);
		
	}

	@Override
	public void deleteUser(Integer userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetUserPwd(Integer userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatchUser(Integer[] ids) {
		// TODO Auto-generated method stub
		
	}

}
