package com.it666.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.it666.domain.Admin;
import com.it666.utils.JdbcUtil;

public class AdminDao {

	public Admin checkAdmin(String name, String pwd) throws SQLException {
		
		//1.链接数据库
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//2.查询
		String sql = "select * from admin where username=? and password=?";
		//3.执行查询
		Admin admin = null;
		admin = qr.query(sql, new BeanHandler<Admin>(Admin.class),name,pwd);
		//返回结果
		return admin;
		
		
	}

	
}
