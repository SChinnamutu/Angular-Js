package com.perf.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.perf.bean.Users;
import com.perf.service.impl.UserServiceImpl;



@Path("/users")
public class UserController {

	
	private UserServiceImpl service = new UserServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Users> getUserList(){
		return service.getUsersList();
	}
	
	
}
