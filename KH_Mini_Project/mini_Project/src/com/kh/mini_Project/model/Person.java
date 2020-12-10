package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private int age;
	private String id;
	private String pw;
	private ArrayList<Facility> favoriteList; // ��ã
	
	public Person() {}
	
	public Person(String name, int age, String id, String pw) {
		super();
		this.age = age; 
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.favoriteList = new ArrayList<>();
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public ArrayList<Facility> getFavoriteList() {
		return favoriteList;
	}

	public void setFavoriteList(ArrayList<Facility> favoriteList) {
		this.favoriteList = favoriteList;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}
	
	public boolean keepMyFavoriteThings(Facility favorite) { 
		
		boolean flag = false;
		// 1. ���� �ü� ����Ʈ ��������
		ArrayList<Facility> originalList = Facility.list;
				
		// 2. ����Ʈ���� �̸��� ���� ���ǽü��� ã�´�
		if (originalList.contains(favorite)) {
			favoriteList.add(favorite);	
			flag = true;
			// 3. ã���� ���ã�⿡ �߰��Ѵ�.
		} 
		return flag;
	}
	


}
