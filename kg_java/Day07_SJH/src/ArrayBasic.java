import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// 1. 배열 변수의 선언
		// 데이터 타입 옆에 []를 붙이고 변수명을 작성
		
		int[] arr; // 자바 배열 스타일
		int arr2[]; // clang 배열 스타일 (문법은 맞지만 자바에서 지향하지 않는다.)
		
		// 2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
		arr = new int[5]; // 배열 5개 (배열 크기를 꼭 기재해야 한다.)
		
		// 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
		// 배열의 초기화는 인덱스를 통해 수행합니다.
		// 인덱스란?
		// - 배열 내부의 위치를 지정할 수 있는 값입니다.
		
		// arr = 65; (x) -> arr의 타입은 int[]이기 때문에 인덱스를 지정해야 합니다.
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int)3.14; // 배열은 동족모음 >> 같은 종류끼리만 초기화할 수 있음
		//arr[4] = "못들어간다고??"; // 배열은 동족모음 >> 같은 종류끼리만 초기화할 수 있음		
		arr[4] = 100;
		//arr[5] = 77; index 범위 초과
		
		// 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
		System.out.println("arr 배열의 길이  : " + arr.length); // arr 배열의 길이  : 5
		
		// 5. 배열에 저장된 값을 참조(사용)하는 법
		System.out.println("배열의 1번째 데이터 : " + arr[0]); // 배열의 1번째 데이터 : 65
		System.out.println("배열의 2번째 데이터 : " + arr[1]); // 배열의 1번째 데이터 : 88
		System.out.println("배열의 3번째 데이터 : " + arr[2]); // 배열의 1번째 데이터 : 65
		System.out.println("배열의 4번째 데이터 : " + arr[3]); // 배열의 1번째 데이터 : 3
		System.out.println("배열의 5번째 데이터 : " + arr[4]); // 배열의 1번째 데이터 : 100
		
		// 6. 배열의 반복문 처리
		// 배열은 인덱스 번호를 제어변수로 활용하여 반복문을 쉽게 처리할 수 있습니다.
		System.out.println("---------------------------------------");
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.printf("배열의 %d번째 데이터 : %d\n", idx + 1, arr[idx]); // %d번째 : 1번째부터 시작하니까 idx + 1	
		}
				
		// 7. 배열 내부의 요소값을 문자열 형태로 한눈에(한방에) 출력하기
		// Arrays api를 사용하면 배열 내부의 요소값을 문자열 형태로 한번에 확인할 수 있음
		System.out.println(Arrays.toString(arr)); // [65, 88, 65, 3, 100]
		System.out.println(arr); // [I@4aa298b7 -> 배열의 주소값
		// 변수를 선언하고 값을 초기화하면 일반적으로 메모리 내부의 stack이라는 영역에 들어가는데,
		// 배열은 요소값의 길이가 길기때문에 일반적인 stack 영억에 들어갈 수 없다.
		// 그래서 배열은 stack보다 큰 heap이라는 영역에 저장이 되는데,
		// 이 때 변수명이 같이 저장되는 것이 아닌, 요소값만 저장된다.
		// 그렇기 때문에 그냥 배열 변수를 출력해보면 그 요소값을 가리키는 주소값을 출력한다.
		
		// 8. 배열의 선언과 생성을 동시에 하기.
		
		double[] dArr = new double[3]; // 더블형 요소값이 3개 들어갈 수 있는 배열을 선언한다.
		String[] sArr = new String[4]; // 문자열 요소값이 4개 들어갈 수 있는 배열을 선언한다.
		byte[] bArr = new byte[11]; // 정수 1바이트 요소값이 11개 들어갈 수 있는 배열을 선언한다.
		
		System.out.println("-------------------------------------------");
		System.out.println(Arrays.toString(dArr)); // double의 기본값 : [0.0, 0.0, 0.0]
		System.out.println(Arrays.toString(sArr)); // String의 기본값 : [null, null, null, null]
		System.out.println(Arrays.toString(bArr)); // byte(정수)의 기본값 : [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		// 9. 배열의 생성과 동시에 초기화도 진행하는 방법
		// 배열 크기를 비워두고 옆에 중괄호{}를 적고 그 안에 초기화값을 적어준다.
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		// 선언과 동시에 초기화를 할 때
		// 딱 1번만 가능한 문법!
		
		String[] names = {"홍길동", "고길동", "박길동"}; // new String[] 처음에는 생략 가능
		names = new String[] {"홍길동", "고길동", "박길동", "이길동"}; // 추가하거나 줄이기 위해서는 객체를 생성해야 한다!
		// 배열의 크기는 임의로 늘리거나 줄일 수 없습니다.
		//names = {"홍길동", "고길동", "박길동", "이길동"}; -> (x)
		
		System.out.println(Arrays.toString(names));
		
		
		
		
	}

}
