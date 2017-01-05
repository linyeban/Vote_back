package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IAdminDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.service.IAdminService;
import com.lin.service.IUserService;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	@Resource
	private IAdminDao adminDao;

	@Override
	public Admin findNameById(Integer AdminId) {
		// TODO Auto-generated method stub
		return this.adminDao.findNameById(AdminId);
	}

}
