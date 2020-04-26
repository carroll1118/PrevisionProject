package com.sxt.sys.service;

import java.util.List;

import com.sxt.sys.domain.Menu;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.MenuVo;


public interface MenuService {
    //查询所有菜单，返回List<Menu>
	public List<Menu> queryAllMenuForList(MenuVo menuVo);
	
	//根据用户Id查询可用菜单
	public List<Menu> queryMenuByUserIdForList(MenuVo menuVo,Integer userId);

	public DataGridView queryAllMenu(MenuVo menuVo);

	public void addMenu(MenuVo menuVo);

	void updateMenu(MenuVo menuVo);

	Integer queryMenuByPid(Integer pid);

	void deleteMenu(MenuVo menuVo);
}
