package com.sxt.mapper;

import com.sxt.domain.BillType;

public interface BillTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BillType record);

    int insertSelective(BillType record);

    BillType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillType record);

    int updateByPrimaryKey(BillType record);
}