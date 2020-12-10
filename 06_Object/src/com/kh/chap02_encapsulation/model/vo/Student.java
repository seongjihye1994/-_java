package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. 필드
	// 접근제한자 [예약어] 자료형 변수명;
	
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. 생성자 : 객체를 생성하기 위한 일종의 메소드
	// 		접근제한자 클래스명([매개변수]) {
	//
	// }
	public Student() { // 디폴트 생성~
		
	}
	
	// 3. 메소드 : 기능을 구현하는 부분
	// 접근제한자 타입 메소드명([매개변수]) {
	//
	// }
	
	
	public void setName(String name) { // 필드의 값을 받아서 변경해주는 메소드
		// name = name;
		// 매개변수의 name = 매개변수의 name;
		// {} 구역에서는 해당 지역에서 만들어진 변수가 우선순위가 높기 때문
		
		// 우리가 원하는 코드는
		// 필드의 name = 매개변수의 name;
		this.name = name;
		// this에는 해당 객체의 주소값이 담겨 있음	
	}
	
	// 3_1. setter
	// 데이터(필드)들을 기록 및 수정하는 기능을 하는 메소드
	// 이 때 메소드는 외부 접근 가능하도록 해야 하기 때문에 public 접근 제한자 사용
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 3_2. getter
	// 값을 반환해주는 기능을 하는 메소드
	// getter 메소드명은 카멜 표기법을 이용하여 getXXX로 통상 지어줌
	// 접근제한자는 외부에서 접근할 수 있어야 하므로 public
	// 필드값을 반환해줘야 하므로 반환하고자 하는 자료형을 반환형에 기재
	// getter 메소드는 단지 해당 필드 값을 반환해주는 메소드로 해당 메소드로 전될되는 값이 없으므로
	// 파라미터는 작성할 필요가 없음
	public String getName() { // 게터는 반환을 해줘야 하니 리턴타입이 있어야 합니다.
		return name; // this를 안붙이는 이유는? getter 메소드 안에서 지역변수 name이 없으므로,
					// 헷갈리지 않기 때문에 this를 붙이지 않아도 필드  name을 인식함
	}
	public int getKor() {
		return kor;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
	
	// 모든 필드 값을 다 합친 문자열을 반환하는 메소드
	public String info() {
		return "이름 : " + name + " 국어점수 : " + kor + 
				" 수학점수 : " + math + " 영어점수 : " + eng;
	}
	

}
