package com.kh.event.part03_ChangePanel.model.vo;

import java.io.Serializable;

public class Member implements Serializable { // 객체 입출력을 위한 직렬화 처리 (ObjectInputStream, ObjectOutputStream 사용을 위해)
	
	private String name;
	private int age;
	private String imagePath;
	
	public Member() {}

	public Member(String name, int age, String imagePath) {
		super();
		this.name = name;
		this.age = age;
		this.imagePath = imagePath;
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", imagePath=" + imagePath + "]";
	}


}
