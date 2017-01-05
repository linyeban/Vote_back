package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.Util.MyBatisUtil;
import com.lin.dao.IAdminDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteTheme;

//测试Mybatis
public class TestTheme {
	@Test
	public void testAddVoteTheme() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IThemeDao themeDao = sqlSession.getMapper(IThemeDao.class);
		VoteTheme voteTheme=new VoteTheme();
		voteTheme.setAdminId(5);
		voteTheme.setClassY(2);
		voteTheme.setPositionY("aaa");
		themeDao.addVoteTheme(voteTheme);
		sqlSession.commit();
	}
	
}
