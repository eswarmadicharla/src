package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.userDAO;
import com.ty.dto.userDTO;

public class deleteUserController {
public static void main(String[] args) {
	Scanner  scanner = new Scanner(System.in);
	userDAO dao = new userDAO();
	userDTO dto = new userDTO();
	
	System.out.println("Enter first name");
	String firstName = scanner.next();
	dto.setFirstName(firstName);
	
	dao.delete(firstName);
	System.out.println("deleted");
	scanner.close();
}
}
