package com.lin.dao;

import com.lin.entity.Voter;

public interface IVoterDao {
	/**
	 * 增加投票人信息
	 * @param voter 投票人信息
	 */
	public void addVoter(Voter voter);
	/**
	 * 通过IP，投票编号查找投票人
	 * @param ip IP
	 * @param voteId 投票编号
	 * @return Voter（Voter类型）
	 */
	public Voter findVoterByIp(String ip,Integer voteId);
	
	public Voter findVoterById(Integer voteId);
    int deleteByPrimaryKey(Integer voterId);

    int insert(Voter record);

    int insertSelective(Voter record);

    Voter selectByPrimaryKey(Integer voterId);

    int updateByPrimaryKeySelective(Voter record);

    int updateByPrimaryKey(Voter record);
}