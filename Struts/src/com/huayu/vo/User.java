package com.huayu.vo;

import java.util.List;

public class User {
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String username;
	private String password;
	private List<User> booklist;
	
	public List<User> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<User> booklist) {
		this.booklist = booklist;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
