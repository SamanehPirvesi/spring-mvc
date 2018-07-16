package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandlers{
	
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointer(Exception ex) {		
		return "null_pointer";
		
	}
	

	@ExceptionHandler(value=MyException.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleMyException(Exception ex) {	
		ModelAndView model=new ModelAndView("null_pointer");
		model.addObject("msg",ex.getMessage());
		return model;
		
	}
}