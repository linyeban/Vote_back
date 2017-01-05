package com.lin.dao;

import java.util.List;

import com.lin.entity.VoteTheme;

public interface IThemeDao {
	
	/**
	 * 增加投票主题
	 * 
	 * @param voteTheme
	 *            投票信息
	 */
	public void addVoteTheme(VoteTheme voteTheme);
	
 	public VoteTheme findThemeById(Integer themeId);
 
}