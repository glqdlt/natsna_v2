package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	
	  @RequestMapping(value="/1", method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "UserManagement";
	    }
	  
	  @RequestMapping(value="/2", method = RequestMethod.GET)
	  public String getIndexPage2() {
		  return "UserManagement2";
	  }

}