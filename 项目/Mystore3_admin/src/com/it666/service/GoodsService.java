package com.it666.service;

import java.sql.SQLException;
import java.util.List;

import com.it666.dao.GoodsDao;
import com.it666.domain.Goods;

public class GoodsService {
	private GoodsDao goodsDao = new GoodsDao();

	public List<Goods> getAllGoods() throws SQLException {
		
		//1.�����ݿ��л�ȡ��������
//		GoodsDao goodsDao = new GoodsDao();
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
	}

	public void deleteGoods(String id) throws Exception {
		
		//����dao������ɾ��
		goodsDao.delGoods(Integer.parseInt(id));
		
	}

	public void addGoods(Goods goods) throws Exception {
		// ����dao��   �������
		goodsDao.addGoods(goods);
		
	}

	public Goods getGoodsWithId(String id) throws Exception {
		
		Goods goods = goodsDao.getGoodsWithId(id);
		return goods;
	}

	public void updateGoods(Goods goods) throws Exception {
		
		goodsDao.updateGoods(goods);
	}

	
}
