package com.project4.web.controller;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.project4.web.domain.Path;
import com.project4.web.factory.ContextFactory;

@SessionAttributes("path")
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired Path path;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! 홈컨트롤러 도착 The client locale is {}.", locale);
		/*path = contextFactory.ptx();
		model.addAttribute("path", path); 지우지마세요*/
		model.addAttribute("path", contextFactory.ptx());
		return "home";
	}
	
}
