package com.myxq.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.myxq.dao.GoodsDao;
import com.myxq.domain.Goods;

public class GoodsDaoTest {
	private  GoodsDao goodsDao = new GoodsDao();
	@Test
	public void testGetAllGoods() throws SQLException {
		
		List<Goods> allGoods = goodsDao.getAllGoods();
		System.out.println(allGoods);
	}
	
	@Test
	public void testAddGoods() throws SQLException {
		Goods goods = new Goods();
		goods.setName("myxq1111");
		goods.setPrice(35.5);
		goods.setImage("goods_10.png");
		goodsDao.addGoods(goods);
	}
	
	@Test
	public void testDelGoods() throws SQLException {
		
		goodsDao.delGoods(16);
	}
	
	
	@Test
	public void testupdateGoods() throws SQLException {
		Goods goods = new Goods();
		goods.setId(18);
		goods.setName("myxq222");
		goods.setPrice(40.0);
		goods.setImage("goods_11.png");
		goodsDao.updateGoods(goods);
	}
}
