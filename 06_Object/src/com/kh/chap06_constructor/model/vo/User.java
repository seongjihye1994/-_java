package com.kh.chap06_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// ������ ��� ����
	// 1. ��ü�� �������ֱ� ���� ����
	// 2. �Ű������� ���� ���� ���� �ʵ忡 �ʱ�ȭ �� ����
	
	// ������ ��� �� ���ǻ���
	// 1. �ݵ�� Ŭ���� ��� �����ؾ� ��(��ҹ��� ����)
	// 2. ���ϰ��� ����� �Ѵ�.
	// 3. �Ű����� ������ �ۼ� �� �⺻ �����ڴ� �ݵ�� �����ؾ� ��
	
	public User() {} // ����Ʈ ������
	// ���� ��ü�� ������ �� �� ��� (�� �ʱ�ȭ x)
	// �⺻ �����ڸ� �����ϴ� ��� -> JVM�� �ڵ����� �������� ������ ��ü ���� ��������


	// �Ű����� ������ (<-> ����Ʈ ������)
	// ��ü�� �����԰� ���ÿ� �ʵ� �� �ʱ�ȭ�ϱ� ����
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// �Ű����� ������2
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName); 
		// ���� ���� �ߺ��Ǵ� ������ �ʱ�ȣ ������ �����ڰ� �����ϴ� ��� this() �����ڸ� ��밡��
		// ���� Ŭ���� �������� �����ڿ��� �ٸ� ������ ȣ�� ����
		// *** ��, �� �� �ݵ�� ù �ٿ� �ۼ��ؾ� �� ***
		this.age = age;
		this.gender = gender;
	}
	


	// Getter - Setter
	public String getUserId() {
		return userId;
	}


	
	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String info() {
		return String.format("userId : %s, userPwd : %s, userName : %s, userAge = %d, userGender : %c\n", userId, userPwd, userName, age, gender);
		
	}
	

}
