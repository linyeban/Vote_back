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
import com.lin.entity.VoteTheme;
import com.lin.service.IAdminService;
import com.lin.service.IThemeService;
import com.lin.service.IUserService;

@Controller
@RequestMapping("/theme")
public class ThemeController {
	private static Logger log = LoggerFactory.getLogger(ThemeController.class);
	@Resource
	private IThemeService themeService;
	
	@RequestMapping("/showTheme")
	public String toIndex(HttpServletRequest request,Model model){
		int themeId = Integer.parseInt(request.getParameter("id"));
		VoteTheme voteTheme = this.themeService.findThemeById(themeId);
		model.addAttribute("voteTheme",voteTheme);
		return "showTheme";
	}
}
