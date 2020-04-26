package com.it666.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.it666.domain.Admin;
import com.it666.utils.JdbcUtil;

public class AdminDao {

	public Admin checkAdmin(String name, String pwd) throws SQLException {
		
		//1.�������ݿ�
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//2.��ѯ
		String sql = "select * from admin where username=? and password=?";
		//3.ִ�в�ѯ
		Admin admin = null;
		admin = qr.query(sql, new BeanHandler<Admin>(Admin.class),name,pwd);
		//���ؽ��
		return admin;
		
		
	}

	
}
