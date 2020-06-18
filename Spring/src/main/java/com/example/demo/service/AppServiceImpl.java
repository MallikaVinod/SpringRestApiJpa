package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AppModel;
import com.example.demo.repository.AppRepository;

@Service
public class AppServiceImpl implements AppService{
	@Autowired
	AppRepository appRepo;
	public List<AppModel> getAllUsers(){
		return (List<AppModel>) appRepo.findAll();	
	}

}
