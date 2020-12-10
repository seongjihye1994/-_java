package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports {
	
	// 어떤 스포츠던 사람이 참여하므로 참여하는 사람의 명수
	private int people;
	
	public Sports() {}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	// 어떤 스포츠던 지켜야하는 룰은 있지만 스포츠마다 룰은 다름
	// -> 각 스포츠마다 그에 따른 룰을 반드시 정의해야 함( = 반드시 오버라이딩 해야 함)
	// -> rule() 메소드 추상 메소드로 생성
	public abstract void rule();
	// -> 클래스에 abstract 예약어를 붙여주지 않으면 abstract 메소드를 정의할 수 없으므로 붙여주자.
	
	

}
