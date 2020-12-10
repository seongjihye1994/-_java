package com.kh.practice2.run;

import com.kh.practice2.model.vo.Circle;

public class Run {

	public static void main(String[] args) {

		Circle ci = new Circle();
		
		ci.getAreaOfCircle();
		ci.getSizeOfCircle();
		
		ci.incrementRadius(); // 반지름 1 증가
		
		ci.getAreaOfCircle();
		ci.getSizeOfCircle();
		
		
		

	}

}
