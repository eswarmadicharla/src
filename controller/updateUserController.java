package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.userDAO;
import com.ty.dto.userDTO;

public class updateUserController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		userDTO dto = new userDTO();
		userDAO dao = new userDAO();
		System.out.println("Enter email");
		String email = s.next();
		dto.setEmail(email);
		System.out.println("Enter phone");
		Long phone = s.nextLong();
		dto.setPhone(phone);
		
		dao.update(email, phone);
		System.out.println("updated");
		s.close();
	}
}
