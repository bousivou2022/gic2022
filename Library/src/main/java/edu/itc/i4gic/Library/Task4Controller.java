package edu.itc.i4gic.Library;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
public class Task4Controller{
	@RequestMapping("/tp14/task4")
	
	 String home() {
			return "task4";
	}

}

