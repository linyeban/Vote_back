package com.lin.dao;

import com.lin.entity.VoteRecord;

public interface IRecordDao {
	
	
    int deleteByPrimaryKey(Integer record);

    int insert(VoteRecord record);

    int insertSelective(VoteRecord record);

    VoteRecord selectByPrimaryKey(Integer record);

    int updateByPrimaryKeySelective(VoteRecord record);

    int updateByPrimaryKey(VoteRecord record);
}