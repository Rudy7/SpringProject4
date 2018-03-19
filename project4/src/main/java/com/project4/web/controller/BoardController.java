package com.project4.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project4.web.domain.BoardDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.domain.Path;
import com.project4.web.service.BoardService;
@SessionAttributes("loginUser")
@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired BoardService bService;
	@Autowired BoardDTO board;
	@Autowired Path path;
	@Autowired MemberDTO member;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model
			) {
		logger.info("멤버컨트롤러 list 도착 ");
		return "board/list";
	} 
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(Model model) {
		logger.info("멤버컨트롤러 write 도착");
		return "board/write";
	}
	
	@RequestMapping(value="/write/{title}/{content}", method=RequestMethod.GET)
	public String write (Model model,
			@PathVariable("title")String title,
			@PathVariable("content")String content,
			@ModelAttribute("loginUser")MemberDTO user
			) {
		logger.info("보더컨트롤로  write 도착 ");
		board.setTitle(title);
		board.setContent(content);
		board.setUserid(user.getUserid());
		logger.info("제목{}", board.getTitle());
		logger.info("내용{}", board.getContent());
		bService.addBoard(board);;
		return "board/secList";
	}
	
}
