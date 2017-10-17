package com.perf.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.perf.bean.Users;

public class UserServiceImpl {

	
private static List<Users> usersList = new ArrayList<Users>();
	
	static void createUsers(){
		Users users = new Users(10, "Messi", "Barcelona", "messi@gmail.com");
		Users users2 = new Users(9, "Sauraz", "Barcelona", "sauraz@gmail.com");
		Users users3 = new Users(21, "Pique", "Barcelona", "gerard@gmail.com");
		Users users4 = new Users(11, "Dembele", "Barcelona", "dembele@gmail.com");
		Users users5 = new Users(14, "Iniesta", "Barcelona", "andres@gmail.com");
		Users users6 = new Users(23, "Semendo", "Barcelona", "semendo@gmail.com");
		usersList.add(users);
		usersList.add(users2);
		usersList.add(users3);
		usersList.add(users4);
		usersList.add(users5);
		usersList.add(users6);
	}
	
	
	public List<Users> getUsersList(){
		return usersList;
	}
	
}
