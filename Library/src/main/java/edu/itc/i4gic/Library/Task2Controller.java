package edu.itc.i4gic.Library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Task2Controller{
	@RequestMapping("/tp14/task2")
	
	 public String index(Model model,
			 @RequestParam(
					 name = "msg",
					 defaultValue = "")
	 String msg ){
		model.addAttribute("msg",msg);
		
			return "task2";
	}

}

