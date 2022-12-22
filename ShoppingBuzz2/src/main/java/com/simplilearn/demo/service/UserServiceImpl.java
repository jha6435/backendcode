package com.simplilearn.demo.service;

import com.simplilearn.demo.dao.UserDao;
import com.simplilearn.demo.dao.UserDaoImpl;
import com.simplilearn.demo.dto.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	
	public UserServiceImpl() {
		dao= new UserDaoImpl();
	}

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
