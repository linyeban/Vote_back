package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IAdminDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteTheme;
import com.lin.service.IAdminService;
import com.lin.service.IThemeService;
import com.lin.service.IUserService;

@Service("themeService")
public class ThemeServiceImpl implements IThemeService {
	
	@Resource
	private IThemeDao ThemeDao;

	@Override
	public VoteTheme findThemeById(Integer themeId) {
		// TODO Auto-generated method stub
		return this.ThemeDao.findThemeById(themeId);
	}

}
