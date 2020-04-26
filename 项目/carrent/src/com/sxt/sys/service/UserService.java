package com.sxt.sys.service;

import com.sxt.sys.domain.User;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.UserVo;

public interface UserService {
	
	User login(UserVo userVo);

	DataGridView queryAllUser(UserVo userVo);

	void addUser(UserVo userVo);

	void updateUser(UserVo userVo);

	void deleteUser(Integer userid);

	void resetUserPwd(Integer userid);

	void deleteBatchUser(Integer[] ids);

}
