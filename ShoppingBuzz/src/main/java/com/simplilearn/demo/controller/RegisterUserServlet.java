package com.simplilearn.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.demo.dto.User;
import com.simplilearn.demo.service.UserServiceImpl;


public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("you are at right path");
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String address = request.getParameter("address");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pword");
		
		User user = new User(firstName, lastName, address, userName, password);
		
		boolean isUserRegistered = new UserServiceImpl().registerUser(user);
		
		if(isUserRegistered == true) {
			
			PrintWriter writer= response.getWriter();
			writer.println("you are a registered user");
			response.sendRedirect("home.html");
		}
		
	else {
		
		response.sendRedirect("registeruser.html");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
