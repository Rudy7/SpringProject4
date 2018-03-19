package com.project4.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.project4.web.domain.Path;

@Component
public class ContextFactory {
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Autowired Path path;

	public String path() {
		return ((ServletRequestAttributes)
                RequestContextHolder
                .currentRequestAttributes())
                .getRequest()
                .getContextPath().toString()
                ;
	}
	
	public Path ptx() {
		logger.info("contextFactory ptx() is {}", "Entered");
		path.setContext(path());
		path.setCss(path()+"/resources/css");
		path.setImage(path() +"/resources/img");
		path.setJs(path() +"/resources/js");
		return path;
	}
}
