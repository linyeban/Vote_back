package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IAdminDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.dao.IVoterDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteContent;
import com.lin.entity.VoteTheme;
import com.lin.entity.Voter;
import com.lin.service.IAdminService;
import com.lin.service.IThemeService;
import com.lin.service.IUserService;
import com.lin.service.IVoterService;

@Service("voterService")
public class VoterServiceImpl implements IVoterService{
	
	@Resource
	private IVoterDao voterDao;

	@Override
	public Voter findVoterById(Integer voterId) {
		// TODO Auto-generated method stub
		return this.voterDao.findVoterById(voterId);
	}


}
