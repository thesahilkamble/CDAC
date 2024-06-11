package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //to tell SC, following is Spring bean
//containing request handling logic - mandatory
//singleton and eager -- deployment time 
public class HelloController {

	public HelloController() {
		System.out.println("In Ctor" + getClass());
	}
	
	//add request handling method to test the MVC flow
	/*
	 SC adds the entry in the HandlerMapping bean
	 Key - /hello
	 Value - F.Q controller class name + method name
	 ex - com.blogs.controller.HelloController.sayHello*/
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("In Say Hello");
		return "/welcome";
	}
	

}
