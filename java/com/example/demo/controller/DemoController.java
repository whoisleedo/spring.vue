package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.UserEntity;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/userList")
	public List<UserEntity>  test(){
		List<UserEntity> userList = new ArrayList<UserEntity>();
		userList.add(new UserEntity(1,"Jack","jack@gmail.com"));
		userList.add(new UserEntity(2,"May","may@gmail.com"));
		userList.add(new UserEntity(3,"Wislon","wilson@gmail.com"));
		userList.add(new UserEntity(4,"Mike","mike@gmail.com"));
		
		return userList;
	
		
	}
	
	

}
