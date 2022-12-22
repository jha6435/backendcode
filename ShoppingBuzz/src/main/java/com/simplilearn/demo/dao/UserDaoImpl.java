package com.simplilearn.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.simplilearn.demo.dto.User;
import com.simplilearn.demo.util.ConnectionManagerImpl;

public class UserDaoImpl implements UserDao{
	
	private Connection connection;
	
	public UserDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}

			@Override
	public boolean validateUser(User user) {
		
		boolean isUserValid =false;

		
		String query = "select* from userdetails where user_name = ? password = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()== true)
		
				isUserValid = true;
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return isUserValid;
		
			}

	@Override
	public boolean registerUser(User user) {
		boolean isUserRegistered = false;
		
		String query ="insert into userdetails values(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getAddress());
			preparedStatement.setString(4, user.getUserName());
			preparedStatement.setString(5, user.getPassword());
			
			int data = preparedStatement.executeUpdate();
			if(data > 0)
				
				isUserRegistered = true;
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
						
		return isUserRegistered;			
		
	}

}
