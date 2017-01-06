package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.Util.MyBatisUtil;
import com.lin.dao.IAdminDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.dao.IVoterDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteTheme;
import com.lin.entity.Voter;

//测试Mybatis
public class TestVoter {
	@Test
	public void testAddVoter() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IVoterDao voterDao = sqlSession.getMapper(IVoterDao.class);
		Voter voter=new Voter();
		voter.setThemeId(1);
		voter.setPosition("lin");
		voterDao.addVoter(voter);
		sqlSession.commit();
	}
	
}
