package com.myxq.service;

import java.sql.SQLException;
import java.util.List;

import com.myxq.dao.GoodsDao;
import com.myxq.domain.Goods;

public class GoodsService {
	private  GoodsDao goodsDao = new GoodsDao();
	public List<Goods> getAllGoods() throws SQLException {
		//从数据库当中获取所有的数据
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
	}

	public void deleteGoods(String id) throws Exception {
		//调用dao让其删除商品
		goodsDao.delGoods(Integer.parseInt(id)); 
	}

	public void addGoods(Goods goods) throws Exception {
		//调用dao 插入操作
		goodsDao.addGoods(goods);
		
	}

	public Goods getGoodsWithId(String id) throws Exception {
		//调用dao 查询一个商品根据id操作
	 	Goods goods = goodsDao.getGoodsWithId(id);
	 	return goods;
	}

	public void updateGoods(Goods goods) throws Exception {
		//调用dao 更新商品
		goodsDao.updateGoods(goods);
	}


}
