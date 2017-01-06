package com.lin.dao;

import com.lin.entity.VoteRecord;

public interface IRecordDao {
	
    int addRecord(VoteRecord record);
    VoteRecord findRecordById(Integer recordId);

    
}