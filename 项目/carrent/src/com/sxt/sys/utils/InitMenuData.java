package com.sxt.sys.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxt.sys.domain.Menu;
import com.sxt.sys.mapper.MenuMapper;

/**
 * 初始化菜单数据
 * @author LJH
 *
 */
public class InitMenuData {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		MenuMapper menuMapper = context.getBean(MenuMapper.class);
//		menuMapper.insert(new Menu(1, 0, "汽车出租系统", null, 1, null, "&#xe68e;", null, null, 1));
//		menuMapper.insert(new Menu(2, 1, "基础管理", null, 1, null, "&#xe653;", null, null, 1));
//		menuMapper.insert(new Menu(3, 1, "业务管理", null, 0, null, "&#xe663;", null, null, 1));
//		menuMapper.insert(new Menu(4, 1, "系统管理", null, 0, null, "&#xe716;", null, null, 1));
//		menuMapper.insert(new Menu(5, 1, "统计分析", null, 0, null, "&#xe629;", null, null, 1));
//		
//		
//		menuMapper.insert(new Menu(6, 2, "客户管理", null, 0, null, "&#xe770;", null, null, 1));
//		menuMapper.insert(new Menu(7, 2, "车辆管理", null, 0, null, "&#xe657;", null, null, 1));
//		
//		
//		menuMapper.insert(new Menu(8, 3, "汽车出租", null, 0, null, "&#xe65b;", null, null, 1));
//		menuMapper.insert(new Menu(9, 3, "出租单管理", null, 0, null, "&#xe6b2;", null, null, 1));
//		menuMapper.insert(new Menu(10, 3, "汽车入库", null, 0, null, "&#xe65a;", null, null, 1));
//		menuMapper.insert(new Menu(11, 3, "检查单管理", null, 0, null, "&#xe705;", null, null, 1));
//		
//		
//		menuMapper.insert(new Menu(12, 4, "菜单管理", null, 0, null, "&#xe60f;", null, null, 1));
//		menuMapper.insert(new Menu(13, 4, "角色管理", null, 0, null, "&#xe66f;", null, null, 1));
//		menuMapper.insert(new Menu(14, 4, "用户管理", null, 0, null, "&#xe770;", null, null, 1));
//		menuMapper.insert(new Menu(15, 4, "日志管理", null, 0, null, "&#xe655;", null, null, 1));
//		menuMapper.insert(new Menu(16, 4, "公告管理", null, 0, null, "&#xe645;", null, null, 1));
//		menuMapper.insert(new Menu(17, 4, "数据源监控", null, 0, null, "&#xe857;", null, null, 1));
//		
//		
//		menuMapper.insert(new Menu(18, 5, "客户地区统计", null, 0, null, "&#xe63c;", null, null, 1));
//		menuMapper.insert(new Menu(19, 5, "公司年度月份销售额", null, 0, null, "&#xe62c;", null, null, 1));
//		menuMapper.insert(new Menu(20, 5, "业务员年度销售额", null, 0, null, "&#xe62d;", null, null, 1));
		
		System.out.println("初始化完成");
		
	}
}
