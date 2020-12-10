package com.kh.chap03_class.model.vo;

public class Person { // public이 붙으면 다른 클래스에서도 사용할 수 있음
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gendor;
	private String phone;
	private String email;
	
	public Person() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGendor() {
		return gendor;
	}

	public void setGendor(char gendor) {
		this.gendor = gendor;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toSting() {
		return String.format("id : %s / pwd : %s / name : %s "
				+ "/ age : %d / gendor : %c /"
				+ " phone : %s / email : %s\n",
		this.id, this.pwd, this.name, this.age, 
		this.gendor, this.phone, this.email);
	}

}
