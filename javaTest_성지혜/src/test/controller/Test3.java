package test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		double avg = 0.0;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.printf("�հ� : %d\n", sum);
		avg = sum / 100;
		System.out.printf("��� : %.1f\n", avg);
		

	}

}


