package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.userDAO;
import com.ty.dto.userDTO;

public class insertUserController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		userDTO dto = new userDTO();
		userDAO dao = new userDAO();
		System.out.println("Enter first name");
		String firstName = s.next();
		dto.setFirstName(firstName);
		System.out.println("Enter last name");
		String lastName = s.next();
		dto.setLastName(lastName);
		System.out.println("Enter email");
		String email = s.next();
		dto.setEmail(email);
		System.out.println("Enter password");
		String password = s.next();
		dto.setPassword(password);
		System.out.println("Enter phone");
		Long phone = s.nextLong();
		dto.setPhone(phone);
		System.out.println("Enter dob");
		String dob = s.next();
		dto.setDob(dob);
		System.out.println("Enter gender");
		String gender = s.next();
		dto.setGender(gender);
		s.close();
		dao.insert(dto);
		System.out.println("inserted successfully");
	}
}
