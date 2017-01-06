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
import com.lin.entity.Voter;
import com.lin.service.IAdminService;
import com.lin.service.IUserService;
import com.lin.service.IVoterService;

@Controller
@RequestMapping("/voter")
public class VoterController {
	private static Logger log = LoggerFactory.getLogger(VoterController.class);
	@Resource
	private IVoterService voterService;
	
	@RequestMapping("/showVoter")
	public String toIndex(HttpServletRequest request,Model model){
		//log.debug("In viewCourse, courseId = {}", request);
		int voteId = Integer.parseInt(request.getParameter("id"));
		Voter voter = this.voterService.findVoterById(voteId);
		model.addAttribute("voter", voter);
		return "showVoter";
	}
}
