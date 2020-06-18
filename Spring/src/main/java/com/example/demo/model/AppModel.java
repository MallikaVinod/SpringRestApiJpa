package com.example.demo.model;

import javax.persistence.Id;

public class AppModel {
	@Id
public Long id;
public String name;
public String email;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "AppModel [id=" + id + ", name=" + name + ", email=" + email + "]";
}
public AppModel(Long id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public AppModel()
{}
}
