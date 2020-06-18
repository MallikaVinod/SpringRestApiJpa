package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppModel;
import com.example.demo.service.AppService;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	AppService appService;
	@GetMapping("/show")
public List<AppModel> getAllUsers()
{
		return appService.getAllUsers();	
}
}
