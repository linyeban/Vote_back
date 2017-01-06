package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.lin.Util.MyBatisUtil;
import com.lin.dao.IRecordDao;
import com.lin.entity.VoteRecord;


//测试Mybatis
public class TestRecord {
	@Test
	public void testAddRecord() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IRecordDao recordDao = sqlSession.getMapper(IRecordDao.class);
		VoteRecord record=new VoteRecord();
		record.setThemeId(1);
		record.setVoterId(1);
		recordDao.addRecord(record);
		sqlSession.commit();
	}
	
}
