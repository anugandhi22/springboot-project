package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
			@Autowired
		HomeService ssi;
	@RequestMapping("/")
	public String preLogin() {
		
		return "login";
	}
	@RequestMapping("/reg")
	public String preRegister() {
		return "register";
	}
	@RequestMapping("/register")
	public String saveStudent(@ModelAttribute Student s) {
		ssi.saveStudent(s);
	return "login";	
	}
	@RequestMapping("/log")
	public String logincheck(@RequestParam("uname") String un,@RequestParam("password") String ps,Model m) {
		ssi.logincheck(un,ps);
		Iterable<Student> list=ssi.getAlldata();
		m.addAttribute("Student",list);
		return "success";
	}
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("rollno") int rollno,Model m) {
		ssi.deleteData(rollno);
		Iterable<Student> list=ssi.getAlldata();
		m.addAttribute("Student", list);
		return "success";
		
	}
	@RequestMapping("/edit")
	public String editData(@RequestParam("rollno") int rollno,Model m) {
		Student s=ssi.editData(rollno);
		m.addAttribute("Student", s);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m) {
		ssi.saveStudent(s);
		Iterable<Student> list=ssi.getAlldata();
		
		m.addAttribute("Student",list);
		return "success";
	}


}
