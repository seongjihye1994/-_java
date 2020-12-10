package com.kh.chap05_iniBlock.model.vo;

public class Product {
	
	// 멤버 변수 == 인스턴스 변수
	private String pName = "은하수";
	private int price = 900000;
	
	// 클래스 변수
	private static String brand = "샘성";
	
	// 인스턴스 블록(인스턴스 변수를 초기화시키는 블록)
	// 인스턴스 객체 생성시마다 초기화 됨
	{
		pName = "cyon";
		price = 2000000;
		
		brand = "옐지";
		// 인스턴스 블록에서는 static 변수를 초기화 할 수 있다.
		// static 필드는 이미 프로그램 시작 시 만들어져 있는 공간이므로,
		// 객체 생성 이후 값을 초기화하는 인스턴스 최화 블럭의 값으로
		// 덮어쓰게 됨
	}
	
	// static 블록(static 변수를 초기화시키는 블록)
	// 프로그램 시작 시 단 한번만 초기화
	static {
		brand = "사과";
		
//		pName = "아이뽄"; // static블록에서 인스턴스변수를 초기화할 수 x
//		price = 2000000; // 인스턴스변수는 new 객체가 생성된 후에 존재하기 때문
		// static 변수는 프로그램 시작 부터 단 헌번 초기화되는 변수인데,
		// 인스턴스 변수가 생겨나기도 전에 static 영역에서 인스턴스 변수를
		// 초기화하려고 하기 때문에 에러가 나는 것!
		// 즉, 생성되는 순서는 static >> instance 순으로 static가 먼저
		// 생성되기 때문에 아직 생성되지 않은 인스턴스 변수는 static에서 초기화할 수 없다!
	}
	
	public Product() {}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand;
		// 객체의 필드에 접근하는 것이 아닌 정적 메모리의 brand에 접근해야 하므로
		// this 사용 x
	}
	
	public String information() {
		return "Product [pName=" + pName + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	

}
