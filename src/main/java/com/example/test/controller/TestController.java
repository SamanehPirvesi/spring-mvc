package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.model.User;

@Controller
public class TestController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ModelAndView getTestPage() {
		ModelAndView model=new ModelAndView("bb/test");
		model.addObject("message","my message is peace");
		User user=new User("samane","12345");
		model.addObject("u",user);
		return model;
	}
	
}
