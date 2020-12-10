package com.kh.chap06_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// 생성자 사용 목적
	// 1. 객체를 생성해주기 위한 목적
	// 2. 매개변수로 전달 받은 값을 필드에 초기화 할 목적
	
	// 생성자 사용 시 주의사항
	// 1. 반드시 클래스 명과 동일해야 함(대소문자 구분)
	// 2. 리턴값이 없어야 한다.
	// 3. 매개변수 생성자 작성 시 기본 생성자는 반드시 생성해야 함
	
	public User() {} // 디폴트 생성자
	// 단지 객체를 생성할 때 만 사용 (값 초기화 x)
	// 기본 생성자를 생략하는 경우 -> JVM이 자동으로 만들어줬기 때문에 객체 생성 가능했음


	// 매개변수 생성자 (<-> 디폴트 생성자)
	// 객체를 생성함과 동시에 필드 값 초기화하기 위함
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 매개변수 생성자2
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName); 
		// 위와 같이 중복되는 동일한 초기호 내용의 생성자가 존재하는 경우 this() 생성자를 사용가능
		// 같은 클래스 내에서는 생성자에서 다른 생성자 호출 가능
		// *** 단, 이 떄 반드시 첫 줄에 작성해야 함 ***
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
