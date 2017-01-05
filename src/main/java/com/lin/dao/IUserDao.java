package com.lin.dao;

import com.lin.entity.User;

public interface IUserDao {
	public int insert(User user);

	public User selectByPrimaryKey(int userId);

}