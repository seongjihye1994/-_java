package com.kh.hw2.model.vo;

public class Employee {
	
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salay;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}

	public Employee(String empName, String dept, String job, int age, char gender, int salay, double bonusPoint,
			String phone, String address) {
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salay = salay;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String info() {
		return String.format("사원명 : %s, 부서명 : %s, 직급 : %s, 나이 : %d, 성별 : %c, 급여 : %d, 보너스포인트 : %f, 전화번호 : %s, 주소 : %s\n"
				, this.empName, this.dept, this.job, this.age, this.gender, this.salay, this.bonusPoint, this.phone, this.address);
	}

	
	

}
