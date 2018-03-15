package com.project4.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		logger.info("멤버컨트롤러 list 도착 ");
		return "board/list";
	} 
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		logger.info("멤버컨트롤러 write 도착");
		return "board/write";
	}
	
}
