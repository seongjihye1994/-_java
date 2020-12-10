package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		// Random 클래스는 난수를 얻어내기 위한 다양한 메서드를 제공하며,
		// Math클래스의 Random() 베서드보다 다양하고 쉽게 난수값을 얻어오도록 해 줍니다.
		
		Random r = new Random();
		
		// 실수 난수값 발생 : 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println("실수 랜덤값 : " + d);
		
		// Math.random과의 차이점은?
		// ramdon은 정수 난수값을 제공하는 메서드를 자체적으로 가지고있음
		int i = r.nextInt(); // 괄호 안에 범위를 지정하지 않으면, int의 저네 범위로 난수를 리턴합니다.
		System.out.println(i);
		
		// 0이상 6미만의 난수를 발생 (0 ~ 5)
		int j = r.nextInt(6); // 시작범위는 기본으로 0으로 지정되고, 끝범위를 괄호안에 기재한다. (6미만)
		System.out.println(j);
		
		// 10이상 101미만의 난수를 발생 (10 ~ 100)
		int k = r.nextInt(91) + 10; // 끝범위에 1 더하고 시작범위를 빼준다.
		
		
		
		

	}

}
