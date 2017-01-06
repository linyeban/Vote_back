package com.lin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lin.Util.MyBatisUtil;
import com.lin.dao.IAdminDao;
import com.lin.dao.IContentDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteContent;
import com.lin.entity.VoteTheme;

//测试Mybatis
public class TestContent {
	@Test
	public void testAddVoteContent() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		IContentDao contentDao = sqlSession.getMapper(IContentDao.class);
		VoteContent voteContent=new VoteContent();
		voteContent.setContent("内容一");
		voteContent.setContentId(1);
		voteContent.setThemeId(2);
		voteContent.setCount(5);
		contentDao.addVoteContent(voteContent);
		sqlSession.commit();
	}
	
}
