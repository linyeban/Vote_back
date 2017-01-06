package com.lin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.IAdminDao;
import com.lin.dao.IContentDao;
import com.lin.dao.IRecordDao;
import com.lin.dao.IThemeDao;
import com.lin.dao.IUserDao;
import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.entity.VoteContent;
import com.lin.entity.VoteRecord;
import com.lin.entity.VoteTheme;
import com.lin.service.IAdminService;
import com.lin.service.IContentService;
import com.lin.service.IRecordService;
import com.lin.service.IThemeService;
import com.lin.service.IUserService;

@Service("recordService")
public class RecordServiceImpl implements IRecordService {
	
	@Resource
	private IRecordDao RecordDao;

	@Override
	public VoteRecord findRecordById(Integer recordId) {
		// TODO Auto-generated method stub
		return this.RecordDao.findRecordById(recordId);
	}

}
