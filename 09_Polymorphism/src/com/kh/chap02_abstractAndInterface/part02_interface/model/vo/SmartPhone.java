package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	public SmartPhone() {} // 기본 생성자
	
	public abstract void printMaker(); // 메이커 출력
	
	

}
