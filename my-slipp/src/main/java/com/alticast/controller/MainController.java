package com.alticast.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/")
	public String home(){
		
		logger.info("welcome Home");
		
		return "helloman";
	}

}
