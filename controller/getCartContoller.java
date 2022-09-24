package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDAO;
import com.ty.dto.CartDTO;

public class getCartContoller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CartDTO dto = new CartDTO();
		CartDAO dao = new CartDAO();
	System.out.println("Enter cart id");
	int id =s.nextInt();
	dto.setId(id);
	
	CartDTO c =dao.getDetails(id);
	System.out.println(c);
	s.close();
	}
}
