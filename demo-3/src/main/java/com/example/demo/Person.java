package com.example.demo;

public class Person {

	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String city;
	private String tel;

	public Person() {
	}

	public Person(Integer id, String fname, String lname, String email, String city, String tel) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.city = city;
		this.tel = tel;
	}

	public void setId(Integer newValue) {
		id = newValue;
	}

	public Integer getId() {
		return id;
	}

	public void setFname(String newValue) {
		fname = newValue;
	}

	public String getFname() {
		return fname;
	}

	public void setLname(String newValue) {
		lname = newValue;
	}

	public String getLname() {
		return lname;
	}

	public void setEmail(String newValue) {
		email = newValue;
	}

	public String getEmail() {
		return email;
	}

	public void setCity(String newValue) {
		city = newValue;
	}

	public String getCity() {
		return city;
	}

	public void setTel(String newValue) {
		tel = newValue;
	}

	public String getTel() {
		return tel;
	}
}