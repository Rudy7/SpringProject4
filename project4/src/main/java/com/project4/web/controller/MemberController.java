package com.project4.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.domain.Path;
import com.project4.web.service.MemberService;
@SessionAttributes("loginUser")
@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService mService;
	@Autowired CommonDTO common;
	@Autowired Path path;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		logger.info("멤버컨트롤러 로그인에 도착함====");
		return "user/login";
	}
	
	@RequestMapping(value="/login/{id}/{pass}", method=RequestMethod.GET)
	public String login(Model model,
			@PathVariable("id")String idd,
			@PathVariable("pass")String pass
			) {
		logger.info("멤버컨트롤러에 @@로그인에 도착함");
		logger.info("아이디는 {}", idd);
		logger.info("비밀번호는 {}", pass);
		member.setUserid(idd);
		member.setPassword(pass);
		String path = "user/login";
		boolean x = mService.count(member);
			if(x) {
				logger.info("x는 true 입니다.");
				model.addAttribute("loginUser", mService.findById(member));
				path = "user/mypage";
			}
			System.out.println("---------------");
		return path;	
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join(Model model) {
		logger.info("멤버컨트롤러 조인에 도착함");
		return "user/join";
	}

	@RequestMapping(value="/mypage/{id}/{pass}/{name}", method=RequestMethod.GET)
	public String mypage(Model model,
			@PathVariable("id")String id,
			@PathVariable("pass")String pass,
			@PathVariable("name")String name
			) {
		logger.info("멤버컨트롤러 마이페이지 도착함");
		member.setUserid(id);
		member.setPassword(pass);
		member.setName(name);
		logger.info("아이디는 {}", member.getUserid());
		logger.info("이름은 {}" , member.getName());
		mService.addMember(member);
		return "user/login";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Model model) {
		return "user/update";
	}

	@RequestMapping(value="/passUpdate/{befPass}/{aftPass}", method=RequestMethod.GET)
	public String passUpdate(Model model,
			@PathVariable("befPass")String befPass,
			@PathVariable("aftPass")String aftPass
			) {
		logger.info("멤버컨트롤러 이전 비번{} ", befPass);;
		logger.info("멤버컨트롤러 이전 비번{} ", aftPass);;
		common.setBefPass(befPass);
		common.setAftPass(aftPass);
		mService.modifyMember(common);
		return "user/login";
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Model model) {
		logger.info("멤버컨트롤러 delete 도착 ");	
		return "user/delete";
	}  
	@RequestMapping(value="/deleteMember/{nowPass}", method=RequestMethod.GET)
	public String deleteMember(Model model,
			@PathVariable("nowPass")String nowPass
			) {
		logger.info("멤버컨트롤 - delete 진입 nowPass는 {} ", nowPass);
		common.setNowPass(nowPass);
		mService.removeMember(common);
		return "user/login";
	}
	

	
	
}





