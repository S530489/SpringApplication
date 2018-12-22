package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String studentForm(Model themodel) {
		
		student theStudent = new student();
		
		themodel.addAttribute("student" , theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") student theStudent) {
		
		System.out.println("firstName : "+ theStudent.getFirstName());
		System.out.println("lastName : "+ theStudent.getLastName());
		
		
		theStudent.setFirstName(theStudent.getFirstName().toUpperCase());
		theStudent.setLastName(theStudent.getLastName().toUpperCase());
		
		return "student-confirmation";
	}
}
