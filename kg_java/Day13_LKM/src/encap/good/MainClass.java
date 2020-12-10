package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
//		my.year = 1992; (x)
		my.setDay(26);
		my.setMonth(3);
		my.setYear(1992);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다."
				,my.getYear(), my.getMonth(), my.getDay("abc1234"));
		
		
		
		
		
		
		
		

	}

}
