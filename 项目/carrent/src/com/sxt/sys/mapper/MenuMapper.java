package com.sxt.sys.mapper;

import java.util.List;

import com.sxt.sys.domain.Menu;
import com.sxt.sys.vo.MenuVo;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    /**
     * 查询所有菜单
     */
    List<Menu> queryAllMenu(Menu menu);

	void addMenu(MenuVo menuVo);

	List<Menu> queryMenuByRoleId(Integer availableTrue, Integer roleid);

	Integer queryMenuByPid(Integer pid);

	void deleteRoleMenuByMid(Integer id);
}