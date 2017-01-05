package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IUserDao;
import com.lin.entity.User;
import com.lin.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
