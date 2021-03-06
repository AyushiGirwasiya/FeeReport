package com.javatpoint.feereport.domains;

public class Accountant {

	private int id;
	private String name;
	private String password;
	private String email;
	private String contactno;

	public Accountant() {}    //default constructor helpful to create object
	public Accountant(String name, String password, String email, String contactno) {   //second constructor
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contactno = contactno;
	}

	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

}
