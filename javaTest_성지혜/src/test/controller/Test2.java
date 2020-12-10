package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		for (int dan = 2; dan < 6; dan++) {
			for (int gugu = 1; gugu < 10; gugu++) {
				if (dan % 2 != 0) {
					if (gugu % 2 != 0) {
						System.out.printf("%d x %d = %d\n", dan, gugu, dan * gugu);
					}
				}
			}
		}

	}

}
