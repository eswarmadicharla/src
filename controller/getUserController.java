package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.userDAO;
import com.ty.dto.userDTO;

public class getUserController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		userDTO dto = new userDTO();
		userDAO dao = new userDAO();
	System.out.println("Enter email");
	String email =s.next();
	System.out.println("Enter password");
	String password = s.next();
	//dto.setEmail(email);
	
	userDTO user=dao.getDetailsByValidation(email,password);
	
	if(user!=null) {
		System.out.println(user);
		System.out.println("welcome ");
	}
	else
	{
		System.out.println("invalid mail or password");
	}
	s.close();
	}
}
