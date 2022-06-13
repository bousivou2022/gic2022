package edu.itc.i4gic.Library;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class Task5Controller{
	@PostMapping("/tp14/task5")
	
	 public String index(Model model, HttpServletRequest request) {
			
		String username = request.getParameter("username");
		String pwd= request.getParameter("pwd");
		model.addAttribute("username", username);
		ModelAndView mav = null;
		if("toto".equalsIgnoreCase(username)&& "123456".equals(pwd)){
			mav = new ModelAndView "task5";
		}else {
			
		return "redirect:/tp14/task2";
	}

}}

