
public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		/* 
		 1. 14부터 137까지의 랜덤 정수를 발생시키세요. 
		 2. 랜덤값이 짝수라면 "짝수입니다.", 홀수라면 "홀수입니다."를
		         출력하는 3항 연산식을 세워보세요.
		 */

		int rn = (int)((Math.random() * 124) + 14);
		System.out.println("발생한 난수 : " + rn);
		String result = rn % 2 == 0? "짝수입니다.": "홀수입니다.";
		System.out.println("3항 연산의 결과 : " + result);
		//System.out.println("3항 연산의 결과 : " + (rn % 2 == 0 ? "짝수입니다.": "홀수입니다."));
	}

}
