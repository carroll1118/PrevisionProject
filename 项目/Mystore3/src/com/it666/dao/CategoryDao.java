package com.it666.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it666.domain.Category;
import com.it666.utils.JdbcUtil;

public class CategoryDao {

	public List<Category> getAllCategory() throws Exception{
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select * from category";
		List<Category>  allCategory = null;
		allCategory = qr.query(sql, new BeanListHandler<Category>(Category.class));
		return allCategory;
		
	}

}
