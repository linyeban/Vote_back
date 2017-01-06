package com.lin.dao;

import java.util.List;

import com.lin.entity.VoteContent;
import com.lin.entity.VoteTheme;


public interface IContentDao {
	/**
	 * 添加投票选项信息
	 * @param voteContent 投票选项信息
	 */
	public void addVoteContent(VoteContent voteContent);
	/**
	 * 通过投票编号查找投票选项
	 * @param vote 投票信息
	 * @return voteContent（List类型）
	 */
	public List<VoteContent> findVoteContextByVoteId(VoteTheme voteTheme);
	/**
	 * 删除指定的一条投票选项信息
	 * @param voteContext 投票选项信息
	 */
	public void delVoteContent(VoteContent voteContent);
	/**
	 * 增加一条投票选项信息
	 * @param voteContent 投票选项信息
	 */
	public void addOneVoteContent(VoteContent voteContent);
	/**
	 * 更新投票选项信息
	 * @param voteContent 投票选项信息
	 */
	public void updateVoteContent(VoteContent voteContent);
	/**
	 * 通过投票选项编号查找投票选项信息
	 * @param voteContent 投票选项信息
	 * @return voteContent（voteContent类型）
	 */
	public VoteContent findVCCountByVCId(VoteContent voteContent);
	/**
	 * 通过投票编号查找对应该编号所有投票数
	 * @param voteId 投票编号
	 * @return 投票数
	 */
	public Long findTotalCountByVoteId(Integer voteId);
	/**
	 * 通过投票主题编号查找对应的内容
	 * @param voteId 投票编号
	 * @return 投票数
	 */
	public VoteContent findContentByContentId(Integer contentId);

}