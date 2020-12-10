import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		// 요소값 7을 삭제하는 로직
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr [4];
//		arr[4] = arr [5];
//		arr[5] = arr [6];
		
		for (int i = 3; i < arr.length-1; i++) { // 인덱스 3번부터 돌고 배열을 하나 지울거니까 -1개까지 돈다.
			arr[i] = arr[i+1]; // 인덱스 3번자리에 인덱스4번 요소값이 온다.
		}
		System.out.println(Arrays.toString(arr)); // [1, 3, 5, 9, 11, 13, 13]
		
		int[] temp = new int[arr.length-1]; // 배열의 크기를 하나 줄일거니까 기존 배열 길이보다 -1크기 선언
		
//		temp[0] = arr[0];
//		temp[1] = arr[1];
//		temp[2] = arr[2];
//		.
//		.
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i]; // 원본 배열 값을 임시 배열 값에 대입
		}
		System.out.println(Arrays.toString(temp)); // [1, 3, 5, 9, 11, 13]
						
		System.out.println(arr); // [I@15db9742
		System.out.println(temp); // [I@6d06d69c
		// 서로의 주소값이 다르니 원본 배열에 임시 배열의 주소값을 넘기고, 임시 배열은 null로 처리하고 버린다.	
		arr = temp;
		temp = null;
		
		System.out.println(Arrays.toString(arr)); // [1, 3, 5, 9, 11, 13]
		System.out.println(arr); // [I@6d06d69c
		
		
		
		
	}

}
