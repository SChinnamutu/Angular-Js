package com.perf.bean;

public class Users {

	private long id;
	private String username;
	private String address;
	private String email;
	
	public Users(long id,String uname,String address,String email) {
		this.id =  id;
		this.username = uname;
		this.address = address;
		this.email = email;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
