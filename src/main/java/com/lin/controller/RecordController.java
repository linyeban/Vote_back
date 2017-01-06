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
import com.lin.entity.VoteRecord;
import com.lin.entity.Voter;
import com.lin.service.IAdminService;
import com.lin.service.IRecordService;
import com.lin.service.IUserService;
import com.lin.service.IVoterService;

@Controller
@RequestMapping("/record")
public class RecordController {
	private static Logger log = LoggerFactory.getLogger(RecordController.class);
	@Resource
	private IRecordService recordService;
	
	@RequestMapping("/showRecord")
	public String toIndex(HttpServletRequest request,Model model){
		//log.debug("In viewCourse, courseId = {}", request);
		int recordId = Integer.parseInt(request.getParameter("id"));
		VoteRecord record = this.recordService.findRecordById(recordId);
		model.addAttribute("record", record);
		return "showRecord";
	}
}
