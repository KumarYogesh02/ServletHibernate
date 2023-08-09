package com.digit.hibernateServlet.bean;

public class AadharDetail {
	int adh_no;
	String Address;
	String city;
	String state;
	String name;
	String father_name;
	String Dob;
	
	public int getAdh_no() {
		return adh_no;
	}
	public int setAdh_no(int adh_no) {
		return this.adh_no = adh_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	
}
