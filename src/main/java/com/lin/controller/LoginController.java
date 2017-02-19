package com.lin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.service.IAdminService;
import com.lin.service.IUserService;

//配置登录页面

@Controller
@RequestMapping("/login")
public class LoginController {
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	@Resource
	private IAdminService adminService;
	
	@RequestMapping("/login")
	public String toIndex(HttpServletRequest request,Model model){
		//log.debug("In viewCourse, courseId = {}", request);
		int adminId = Integer.parseInt(request.getParameter("id"));
		System.out.print(adminId);
		Admin admin = this.adminService.findNameById(adminId);
		model.addAttribute("admin", admin);
		return "admin/showAdmin";
	}
}
