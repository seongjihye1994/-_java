package com.kh.part01.object_vs_objectArray.model.vo;

public class Person {
	
	private String name;
	private int age;
	private int wealth;
	
	// 생성자 : Alt + Shift + s + o
	public Person() {}

	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}

	// 게터세터 : Alt + Shift + s + r
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

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	public String infor() {
		return "name=" + name + "age=" + age + "wealth=" + wealth;
	}
	
	

}
