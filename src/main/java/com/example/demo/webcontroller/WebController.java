package com.example.demo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
public class WebController {
	
	
	 @GetMapping("/hello")
	    public String hello() {
		 
	        return "hello"; 
	    } 
	 
	 @GetMapping("/index")
	 public String userIndex() {
	     
	     return "index";
	 }

}
