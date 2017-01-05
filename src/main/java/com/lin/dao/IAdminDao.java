package com.lin.dao;

import java.util.List;

import com.lin.entity.Admin;


public interface IAdminDao {
	/**
	 * 增加管理员
	 * 
	 * @param Admin
	 *            管理员信息
	 */
	public void addAdmin(Admin admin);
	
	/**
	 * 通过Id查找管理员
	 * 
	 * @param AdminId
	 *            管理员Id
	 * @return Admin（Admin类型）
	 */
	public Admin findNameById(Integer AdminId);
}