package com.kh.chap04_field.model.vo;

public class FieldTest1 {
	// 클래스에서 사용 가능한 접근 제한자는 public, default 뿐
	// 필드에서 사용 가능한 접근 제한자는 4가지
	
	// 1. public -> 어디서든(같은 패키지, 다른 패키지 모두) 접근 가능
	// 2. protected -> 같은 패키지 접근 가능 + 만약 다른 패키지라면 상속 구조에서 접근 가능
	// 3. default -> 같은 패키지 접근 가능
	// 4. private -> 오직 자기 자신 클래스에서만 접근 가능
	
	// 1. 필드
	public String pub = "public";
	protected String pro = "protected";
	String def = "default"; // 디폴트는 생략
	private String pri = "private";
	
	// 2. 생성자
	public FieldTest1() {}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getPri() {
		return pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}
	
	// 3. 메소드 (getter/setter)
	// public -> 직접 접근 가능하니 게터 세터 필요 x
	// 나머지는 접근 제한될 수 있으니 게터 세터 필요 o
	
	
	
	
	
}
