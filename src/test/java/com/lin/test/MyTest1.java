package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.Util.MyBatisUtil;
import com.lin.dao.IAdminDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;

//测试Mybatis
public class MyTest1 {
	@Test
	public void testuser() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IUserDao userD = sqlSession.getMapper(IUserDao.class);
		User User1=new User();
		User1.setUserName("lin");
		User1.setPassword("1234");
		User1.setAge(11);
		userD.insert(User1);
		sqlSession.commit();
	}
	@Test
	public void testadmin() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IAdminDao adminD = sqlSession.getMapper(IAdminDao.class);
		Admin admin1=new Admin();
		admin1.setName("我是管理员1");
		admin1.setPassword("1234");
		admin1.setLogintime("22222222");
		adminD.addAdmin(admin1);
		sqlSession.commit();
	}
	
	@Test
	public void testquerryadmin() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IAdminDao adminD = sqlSession.getMapper(IAdminDao.class);
		Admin admin=new Admin();
		admin=adminD.findNameById(5);
		System.out.print(admin.getName());
		sqlSession.commit();
	}
		
}
