package com.kh.chap02_override.model.vo;

// 모든 클래스는 Object 클래스의 후손, 즉, 최상위 클래스는 항상 Objcet
// --> Object에 있는 메소드를 오버라이딩 할 수 있음
public class Book extends Object{
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String info() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
//	@Override
//	public String toString() {
//		return "title : " + title + ", author : " + author + ", price : " + price;
//	}


	/*
	// 간단하게 구현
	@Override
	public boolean equals(Object obj) {
		// this (현 객체) vs obj (비교할 대상 객체)
		// Book			   Object
		Book other = (Book)obj; // 파라미터의 obj 타입을 Book으로 형변환 해줌, 그래야 비교 가능~!
		
		// this vs other
		if (title.equals(other.getTitle()) && 
				author.equals(other.getAuthor()) &&
				price == other.getPrice()) {
			return true; // 필드값이 동일하면 t
		}
		return false; // 다르면 f
	}

	@Override
	public int hashCode() { // 10진수 반환값이니까 int
		// 멤버 값들의 합의 해쉬코드를 리턴하기
		// title + author + price -> 문자열
		// String 클래스의 hashCode()를 통해 그 값을 리턴
		
		return (title + author + price).hashCode();
		// --> 문자 + 문자 + 숫자 >> 하나의 문자열로 합쳐짐
		// --> 같은 문자열으 ㅣ경우 해당 문자열의 hashCode는 같도록
		// 이미 String 클래스에서 재정의 되어 있음
		
	} */
	
	// 이클립스에서 제공하는 자동 완성 ver
	// 보다 효율적이지는 코드는 복잡함
	
	@Override
	public int hashCode() {
		// 해쉬코드 값이 충돌(중첩)현상이 생기지 않도록 소수로 계산하는 방법 (즉, 충돌을 줄이는 방법)
		final int prime = 31;
		// 31이라는 숫자가 소수이면서 홀수여서 Hash했을 경우 충돌을 줄일 수 있음
		int result = 1;
		
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : author.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교 - 주소가 같으면 당연히 같은 곳을 참조하므로 같은 객체로 t 반환
		if (this == obj)
		return true;
		// 2. 주소값이 null인지 비교 - null 이라는게 참조하는게 없다는 의미이므로 비교할 가치도 없으니 false 리턴
		if (obj == null)
			return false;
		// 3. 클래스명 비교 - 참조자료형이 같지 않으면 다른 자료형이라는 소리 -> 비교할 가치가 없으니 false 반환
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		// title 필드 값이 둘다 null 이거나 같을 때  false 리턴 안받음
		if (title == null) { // this.title가 null이고
			if (other.title != null) // other.title가 null이 아닌 경우
				return false; // 당연히 같지 않으므로 false 리턴
		} else if (!title.equals(other.title)) // this.title이 null 이 아닌 경우 other.title과 동일한 문자열이 아니면
			return false;
		
		if (author == null) {
			if (other.author != null) {
				return false;
			} else if (!author.equals(other.author))
				return false;
		}
		
		if (price != other.price)
			return false;
		
		// 위의 조건들이 다 아니라면 true 반환
		return true; 
	}
	
	
	
	
	
	

}
