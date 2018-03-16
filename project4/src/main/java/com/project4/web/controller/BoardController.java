package com.project4.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project4.web.domain.BoardDTO;
import com.project4.web.service.BoardService;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired BoardDTO board;
	@Autowired BoardService bService;
	
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
	
	@RequestMapping(value="/list/{title}/{content}", method=RequestMethod.GET)
	public String list (Model model,
			@PathVariable("title")String title,
			@PathVariable("content")String content
			) {
		board.setTitle(title);
		board.setContent(content);
		bService.addBoard(board);
		return "board/list";
	}
	
}
