package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
		// my.year = 12345;
		// year 멤버변수에 private를 붙여서 은닉했기 때문에 사용 불가.
		
		// 하지만 이렇게 하면, 제대로 된 값을 넣을 때도 막혀버린다.
		
		// my.setDay(9999999); // 제대로 된 값이 아니니까 '잘못된 일자 입력입니다.'가 반환됨
		my.setDay(28); // 제대로 된 값이니까 값을 넣어준다.
		
		System.out.printf("내 생일은 %d일 입니다.\n", my.getDay("abc1234")); // getter 메소드를 호출함과 동시에 매개변수로 값을 넘김 + 리턴값이 여기로 돌아옴.
		
		my.setYear(1994);
		my.setMonth(9);
		
		System.out.printf("내 생일은 %d년 %d울 %d일 입니다.\n", my.getYear(), my.getMonth(), my.getDay("abc1234")); // getter 메소드를 호출함과 동시에 매개변수로 값을 넘김 + 리턴값이 여기로 돌아옴.
		
		

	}

}
