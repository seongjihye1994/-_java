import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		// 배열의 각 요소들은 변수처럼 작용한다.
		// 그렇기 때문에 각각의 요소들을 수정할 수 있다.
		
		foods[2] = "짜장면";
		foods[0] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		// 배열의 인덱스 번호 탐색하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요. : ");
		String name = sc.next(); // 공백이 없는 문자열을 입력받음
		
		boolean flag = false;
		int idx;
		for (idx = 0; idx < foods.length; idx++) {
			if (name.equals(foods[idx])) {
				System.out.println("탐색 완료!");
				System.out.println(name + "의 인덱스 번호 : " + idx + "번");
				flag = true;
				break;
			} 
		} //if (idx == foods.length) {	// idx가 foods 배열의 길이와 같아지는 순간은 상기 if문이 한 번도 참이지 않았다는 의미 == 찾는 음식이 없는 음식
			//System.out.println("없는 음식입니다.");
		  //}
		if(!flag) { // not true == 없는 음식, true == 있는 음식
			System.out.println("없는 음식입니다.");
		}
		// 기준인 flag는 처음에는 거짓이고, 만약 음식을 찾았다면 true로 바뀐다. 그리고 반복문을 탈출해 아래 if문을 만나면 true인 상태에서 부정이 붙어 not true(false)가 되고 아래 종속문을 수행한다.
		// 하지만 음식을 찾지 못했다면 if문은 실행되지 않으니 여전히 false이고, 아래 if문으로 바로 내려와 false의 부정은 true가 되므로 아래 종속문을 수행하지 않는다.
	}
		

}


