package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IAdminDao;
import com.lin.dao.IContentDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteContent;
import com.lin.entity.VoteTheme;
import com.lin.service.IAdminService;
import com.lin.service.IContentService;
import com.lin.service.IThemeService;
import com.lin.service.IUserService;

@Service("contentService")
public class ContentServiceImpl implements IContentService {
	
	@Resource
	private IContentDao ContentDao;

	@Override
	public VoteContent findContentByContentId(Integer contentId) {
		// TODO Auto-generated method stub
		return this.ContentDao.findContentByContentId(contentId);
	}

}
