package com.ty.controller;

import java.util.Scanner;
import com.ty.dao.CartDAO;
import com.ty.dto.CartDTO;

public class CartController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CartDTO dto = new CartDTO();
		CartDAO dao = new CartDAO();
	System.out.println("Enter cart id");
	int id =s.nextInt();
	dto.setId(id);
	System.out.println("Enter cart email");
	String email =s.next();
	dto.setEmail(email);
	System.out.println("Enter cart password");
	String pwd = s.next();
	dto.setPwd(pwd);
	System.out.println("Enter cart username");
	String userName = s.next();
	dto.setUserName(userName);
	System.out.println("Enter cart address");
	String address = s.next();
	dto.setAddress(address);
	
	dao.insert(dto);
	s.close();
	
	}
}
