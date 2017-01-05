package com.lin.service;

import com.lin.entity.Admin;

/*
 * 业务接口：站在“使用者”角度设计接口
 * 三个方法：方法定义粒度，参数，返回类型（return 类型/异常）
 * */
public interface IAdminService {
	public Admin findNameById(Integer AdminId);
}
