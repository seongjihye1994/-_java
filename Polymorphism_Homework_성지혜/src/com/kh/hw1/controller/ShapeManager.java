package com.kh.hw1.controller;

import com.kh.hw1.model.vo.Circle;
import com.kh.hw1.model.vo.IShape;
import com.kh.hw1.model.vo.Rectangle;
import com.kh.hw1.model.vo.Shape;
import com.kh.hw1.model.vo.Triangle;

public class ShapeManager {
	
	public void calcShape() {
		IShape[] s = new IShape[2];
		
		s[0] = new Rectangle(34.5, 42.7);
		s[1] = new Circle(Math.PI, 15.5);
		
		for (IShape shape : s) {
			System.out.println(shape.area());
			System.out.println(shape.perimeter());
		}
	}
	
	public void clarShapeArray() {
		
		IShape[] is = new IShape[5];
		
		is[0] = new Rectangle(34.5, 42.7);
		is[1] = new Circle(Math.PI, 15.5);
		is[2] = new Triangle(30.5, 40.5);
		is[3] = new Circle(Math.PI, 20.7);
		is[4] = new Rectangle(54.2, 37.8);
		
		for (int i = 0; i < is.length; i++) {
			if (i == 0 || i == 1 || i == 3 || i == 4) {
				System.out.println(is[i].area());
				System.out.println(is[i].perimeter());
			} 
			System.out.println(is[2].area());
			System.out.println(is[2].perimeter());
			System.out.println(((Triangle) is[2]).hypotenuse());
			
		}
		
			
	}

}
