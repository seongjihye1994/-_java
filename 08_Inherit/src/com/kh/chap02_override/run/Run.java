package com.kh.chap02_override.run;

import com.kh.chap02_override.model.vo.Book;

public class Run {
	
	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);
		
//		System.out.println(bk1.info());
//		System.out.println(bk2.info());
		
		// 1. toString()
		// 오버라이딩 전 : Object 클래스의 toString() 실행
		// => 풀패키지명+@+객체의 해쉬코드의 16진수값
		// 오버라이딩 후 : Book 클래스의 toString() 실행
		// => 재작성 한 내용대로 해당 객체가 가지고 있는 멤버 값에 대한 정보(info을 대체)
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		
		System.out.println(bk1);
		System.out.println(bk2);
		// 출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 메소드를 호출
		// 따라서 .toString() 명시하지 않아도 알아서 호출 됨
		
		// 2. equals()
		Book bk3 = new Book("수학의 정석", "나수학", 100); // bk1의 필드 값과 모두 동일한 bk3 객체 생성
		
		System.out.println("bk1과 bk3가 같은 책입니까? " + (bk1 == bk3)); // false
		System.out.println("bk1과 bk3가 같은 책입니까? " + (bk1.equals(bk3))); // false
		
		// 아무리 모두 같은 필드값을 가지고 있어도 Object 클래스에 있는 equals 메소드를 사용하게 되면
		// 주소값 비교를 하므로 equals() 호출 시에도 false라는 결과를 얻음
		
		// 나중에 컬렉션을 배울 때 두 객체가 같은 필드 값을 가질 경우 중복이라 판단하고 중복 제거를 하는
		// 경우 등 필드 값 비교가 필요함
		// 따라서 equals 메소드를 오버라이딩 해서 실제 값이 같을 경우 true를 리턴하도록
		// 재작성
		
		// 오버라이딩 전 : Object 클래스의 equals() 메소드 실행 -> 두 주소값을 비교
		// 오버라이딩 후 : 두 객체의 주소값 비교가 아닌 실제 멤버 값이 같은 경우 true를 반환하도록
		
		// 3. hashCode()
		System.out.println("bk1의 헤쉬코드 : " + bk1.hashCode());
		System.out.println("bk2의 헤쉬코드 : " + bk2.hashCode());
		System.out.println("bk3의 헤쉬코드 : " + bk3.hashCode());
		
		// 필드 값이 같은 경우 hashCode 메소드의 결과 값도 같아야 동일 객체로
		// 판단하여 중복 제거 등의 기능을 할 수 있음
		// 오버라이딩 전 : Object 클래스의 hashCode() 실행 -> 해당 객체의 실제 주소값을 10진수로 계산한 결과 값
		// 오버라이딩 후 : 두 객체의 실제 주소 값을 가지고 작업하는 것이 아니라 두 객체의 멤버 값이 같은 경우 
		//				같은 해쉬코드를 리턴하도록 재정의
		
	}

}
