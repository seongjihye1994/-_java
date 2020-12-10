package test.controller;

public class Test9 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56},
						{82, 10, 12, 61}, 
						{14, 16, 18, 78},
						{45, 26, 72, 23}}; 
		
		int max = array[0][0]; // Integer.MAX_VALUE
		int min = array[0][0]; // Integer.MIN_VALUE
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				} else if (array[i][j] < min) {
					min = array[i][j];
				}
			}
		} System.out.printf("가장 큰 값 : %d\n", max);
		System.out.printf("가장 작은 값 : %d\n", min);
		
	}

}
