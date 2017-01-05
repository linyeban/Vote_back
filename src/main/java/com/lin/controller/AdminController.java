package com.lin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lin.entity.Admin;
import com.lin.entity.User;
import com.lin.service.IAdminService;
import com.lin.service.IUserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource
	private IAdminService adminService;
	
	@RequestMapping("/showAdmin")
	public String toIndex(HttpServletRequest request,Model model){
		int adminId = Integer.parseInt(request.getParameter("id"));
		Admin admin = this.adminService.findNameById(adminId);
		model.addAttribute("admin", admin);
		return "admin/showAdmin";
	}
}
