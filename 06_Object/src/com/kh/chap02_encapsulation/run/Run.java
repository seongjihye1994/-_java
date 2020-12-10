package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	// 캠슐화 (접근제한자와 게터세터~)
	// 정의 : 추상화를 통해 정의 된 속성들과 기능을 하나로 묶어 관리하는 기법으로
	// 		클래스의 가장 중요한 목적인 데이터 접근 제한을 원칙적으로 하여 외부에서
	//		데이터 직접 접근을 막고 대신에 데이터를 처리하는 메소드들을 클래스 내부에 작성하여
	//		데이터에 간접적으로 접근하는 방식을 말함
	
	// 1) 정보 은닉 (private)
	//		- 추상화를 통해 선정 된 속성들(필드의 멤버변수)에 외부로부터
	//		   직접 접근을 막기 위해 private를 붙여 접근을 제한하다.
	//
	// 2) 게터 세터 메소드 정의
	//		- 간접적으로 속성에 접근하여 값을 기록하고 조회해오는 메소드
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		// s1.name = "성지혜"; // 멤버변수를 호출해 직접 값을 변경하는것이 불가능합니다.
							// 접근제한자 private로 은닉을 했기 때문
		
		// 직접 접근을 막았다면 간접적으로 접근할 수 있게 class 내부에 기능을 정의해야 함
		// (getter / setter) 메소드
		
		// 객체의 값 설정 -> setter
		s1.setName("우별림"); // 접근제한자지만, 게터와 세터를 메소드부에 기재하였기 떄문에 값 변경 가능
		s1.setKor(100);
		s1.setMath(90);
		s1.setEng(100);
		
		// 객체의 값 얻어오기 -> getter
		System.out.println("이름 : " + s1.getName());
		System.out.println("국어 점수 : " + s1.getKor());
		System.out.println("수학 점수 : " + s1.getMath());
		System.out.println("영어 점수 : " + s1.getEng());
		
		// Student 클래스 내의 info() 메소드 호출
		System.out.println(s1.info());
		

	}

}
