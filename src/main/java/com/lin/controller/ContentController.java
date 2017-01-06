package com.lin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lin.entity.VoteContent;
import com.lin.service.IContentService;
@Controller
@RequestMapping("/content")
public class ContentController {
	private static Logger log = LoggerFactory.getLogger(ContentController.class);
	@Resource
	private IContentService contentService;
	
	@RequestMapping("/showContent")
	public String toIndex(HttpServletRequest request,Model model){
		int contentId = Integer.parseInt(request.getParameter("id"));
		VoteContent voteContent = this.contentService.findContentByContentId(contentId);
		model.addAttribute("voteContent",voteContent);
		return "showContent";
	}
}
