package com.kh.hw2.run;

import com.kh.hw2.model.vo.Circle;
import com.kh.hw2.model.vo.Point;
import com.kh.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1, 2, 3);
		Circle c2 = new Circle(3, 3, 4);
		Circle[] c = {c1, c2};
		
		Rectangle r1 = new Rectangle(-1, -2, 5, 2);
		Rectangle r2 = new Rectangle(-2, 5, 2, 8);
		Rectangle[] r = {r1, r2};

		for (Circle circle : c) {
			circle.draw();
		}
		
		for (Rectangle rec : r) {
			rec.draw();
		}
		

	}

}
