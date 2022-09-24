package com.ty.dto;

public class CartDTO {
	private int id;
	private String email;
	private String pwd;
	private String userName;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CartDTO() {

	}

	public CartDTO(int id, String email, String pwd, String userName, String address) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.userName = userName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CartDTO [id=" + id + ", email=" + email + ", pwd=" + pwd + ", userName=" + userName + ", address="
				+ address + "]";
	}
	
}
