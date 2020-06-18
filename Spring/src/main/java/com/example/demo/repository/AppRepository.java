package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppModel;

@Repository
public interface AppRepository extends CrudRepository<AppModel, Long>{
	public List<AppModel> getAllUsers();
}