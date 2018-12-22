package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processForm2(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		model.addAttribute("message", "Yo! yey " + theName.toUpperCase());
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processForm3(@RequestParam("studentName") String theName, Model model) { // binding req param to the variables
		model.addAttribute("message", "Yo! from v3 " + theName.toUpperCase());
		
		return "helloworld";
	}
	
	
	
}
