package test.controller;

public class Test8 {
	public static void main(String[] args) {
		
		int [][] array = {{12, 41, 36, 56},
				{82, 10, 12, 61},
				{14, 16, 18, 78},
				{45, 26, 72, 23}};
		
		double sum = 0.0;
		double avg = 0.0;
		
		int i;
		int j = 0;
		
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		} 
		avg = sum / (i * j);
		
		System.out.printf("ÇÕ°è : %.1f\n", sum);
		System.out.printf("Æò±Õ : %.3f\n", avg);
	}
	
}
	

