package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.Util.MyBatisUtil;
import com.lin.dao.IUserDao;
import com.lin.entity.User;

//测试Mybatis
public class MyTest1 {
	@Test
	public void testaddmin() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IUserDao userD = sqlSession.getMapper(IUserDao.class);
		User User1=new User();
		User1.setUserName("lin");
		User1.setPassword("1234");
		User1.setAge(11);
		userD.insert(User1);
		sqlSession.commit();
	}
		
}
