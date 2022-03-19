package com.example.demo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
	
	
	 @GetMapping("/hello")
	    public String hello() {
		 
	        return "hello"; 
	    } 

}
