package com.blogs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {
	public IndexPageController() {
		System.out.println("In Ctor" + getClass());
	}
	
	@GetMapping("/")
	public String testIndex(Model map) {
		System.out.println("In Test Index Page");
		return "/index";
	}
	
}
