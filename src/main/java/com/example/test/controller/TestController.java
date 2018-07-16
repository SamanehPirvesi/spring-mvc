package com.example.test.controller;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.exception.MyException;
import com.example.test.model.User;
import com.example.test.service.UserService;

@Controller
public class TestController {
	 @Autowired
	 private UserService userservice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIndex() {
		return "login";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ModelAndView getTestPage() {
		ModelAndView model=new ModelAndView("bb/test");
		model.addObject("message","my message is peace");
		User user=new User("samane","12345");
		model.addObject("u",user);
		return model;
	}
	// example get  parameter from request explicitly by RequestParam
//	@RequestMapping(value="/doLogin", method=RequestMethod.POST)
//	public ModelAndView manageLogin(@RequestParam("username") String usern,@RequestParam("password") String pass) {
//		ModelAndView model=new ModelAndView("bb/test");
//		
//		
//		model.addObject("message","my message is peace");
//		User user=new User(usern,pass);
//		model.addObject("u",user);
//		return model;
//	}
	
	// example get  parameter from path in request  explicitly by RequestParam
//	@PostMapping("/doLogin")
//	//@RequestMapping(value="/doLogin", method=RequestMethod.POST)
//	public ModelAndView manageLogin(@Valid @ModelAttribute("user") User u,BindingResult resultBinding ) {
//		ModelAndView model =null;
//		if(resultBinding.hasErrors()) {			
//			 model=new ModelAndView("login");
//		}else {
//			// no error
//			model=new ModelAndView("bb/test");	
//	
//		}
//	
//		
//		return model;
//	}
	
	// example get  parameter from path in request  explicitly by RequestParam
//	@RequestMapping(value="/doLogin/{msg}", method=RequestMethod.POST)
//	public ModelAndView manageLogin(
//			@PathVariable("msg") String message,
//			@RequestParam("username") String usern,
//			@RequestParam("password") String pass) {
//		
//		
//		ModelAndView model=new ModelAndView("bb/test");		
//		model.addObject("message",message);
//		User user=new User(usern,pass);
//		model.addObject("u",user);
//		return model;
//	}
	
	@PostMapping("/doRegisterUser")
	public ModelAndView registerUser(@ModelAttribute("user") User u) {		
		 userservice.registerUser(u); 
		ModelAndView model=new ModelAndView("bb/test");
		return model;
	}
	
	@PostMapping("/doLogin")
	public ModelAndView manageLogin(@ModelAttribute("user") User u) throws MyException {		
		if(u.getUsername().equals("sara")) {
            throw new MyException("somthing bad");
		}
		ModelAndView model=new ModelAndView("bb/test");
		return model;
	}
	
//	@ExceptionHandler(value=NullPointerException.class)
//	public String handleNullPointer(Exception ex) {		
//		return "null_pointer";
//		
//	}
	
	
}
