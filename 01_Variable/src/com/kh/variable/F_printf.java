package com.kh.variable;

public class F_printf {
	
	public void printfMethod() {
		
		System.out.println('a');
		System.out.printf("문자 a : %c\n", 'a');
		
		System.out.printf("%c %c\n", 'a', 'b');
		System.out.printf("%-3c %5c", 'a', 'b'); // - : 왼쪽정렬, 양수 : 오른쪽정렬
		System.out.println(); // 단순 줄개행
		
		System.out.printf("%5d%-5d%5d\n", 100, 200, 300);
		System.out.printf("%s\t%f\t%10.2f\n", "ABC", 10.95, 75.957);
		// 10칸 오른쪽 정렬 후 소수점 2째자리까지
		
		
		
	}

}
