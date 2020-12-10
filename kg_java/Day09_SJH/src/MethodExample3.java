

   // # 반환값, 반환 유형 (return value, return type)
   
   // 1. 반환값이란 메서드의 실행 결과값을 의미합니다.

   // 2. 매개변수는 여러개 존재할 수 있지만, 반환값은 오직 한 개만 존재해야 합니다.

   // 3. return이라는 키워드를 사용하며, return 뒤에 전달할 값을 지정합니다.

   // 4. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
   //       메서드 이름 앞에 반드시 반환 유형(타입형)을 명시해야 합니다.

   // 5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리가 될 수 있기 때문에
   //       반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도 처리될 수 있습니다.
   //     int r3 = add(add(4, 6), add(7, 8)); // int r3 = 10 + 15; 와 동일

   // 6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
   //    반환할 값이 딱히 없다면 return을 생략해도 됩니다.
   //    이 때는 반환유형을 메서드 선언시에 비워두지 마시고, 반드시
   //    void라는 키워드를 작성해 주셔야 합니다.

   // 7. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
   //    따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
   //    그래서 void 메서드에서는 return키워드를 탈출 기능으로 사용할 수 있습니다.


public class MethodExample3 {
   
   // 메서드 선언(만들기)
   static int add(int n1, int n2) { // 2개의 정수를 받아
      return n1 + n2; // 그 합을 리턴하는 함수 add
   }
   
   // 2. 매개변수는 여러개 존재할 수 있지만, 반환값은 오직 한 개만 존재해야 합니다.
   // 매개변수는 2개지만, 리턴값이 여러개 인 경우? >> 배열을 사용한다!
   static int[] operateTotal(int n1, int n2) {
//      return n1 + n2;
//      return n1 - n2;
//      return n1 * n2;
//      return n1 / n2;
// return은 하나만 선언 가능! return 을 만나는 순간 그 함수는 바로 리턴값을 던지고 종료된다.
      return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2}; // 0~3번 인덱스
      // return 값이 여러개인 경우, 배열에 싸서 던지면 된다.
      // 이 때 리턴 타입이 배열이므로, 함수 선언 타입 역시 배열로 선언해야 한다.
      // 또한, 메서드끼리 교환도 가능하다! 상기 add()함수와 operateTotal의 0번 인덱스의 로직값이 똑같기 때문에
      // {add(n1, n2), n1 - n2, n1 * n2, n1 / n2}로도 사용할 수 있다.
   }
   
   
   // 1. 메서드 이름은 calcArrayTotal로 통일하겠습니다.
   // 2. 이 메서드는 정수 배열 하나를 전달받아 해당 배열 내부에 있는
   //    모든 정수의 합계(int)와 평균(double)을 '배열'에 다시 담아서
   //    리턴하는 메서드입니다.
   // 3. 2번에 정의한 메서드를 선언하시고, 실제로 호출하셔서
   //    합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
   
   static double[] calcArrayTotal(int[] nums) { // 정수 배열 하나를 전달받는다.
      int total = 0;
      for (int i : nums) { // 합계 구하는 로직
         total += i;
      }
      double avg = (double) total / nums.length; // 평균 구하는 로직, 이 때 total과 nums배열은 int형이기 때문에 바로 double에 들어갈 수 없으므로, 둘 중 하나를 업캐스팅 한다.
      return new double[] {total, avg}; // 합계와 평균을 배열에 다시 담아서 double로 리턴한다.
   }

   
   // 메서드의 반환값이 없는 경우
   static void multi(int n1, int n2) {
      int result = n1 * n2;
      System.out.printf("%d x %d = %d\n", n1, n2, result);
   }
   
   
   static void divide(int n1, int n2) {
      if (n2 == 0) {
         System.out.println("0으로 나누지 마세요!");
         // break; break는 반복문이나 스위치케이스 안에서만 사용 가능하다!
         return; // void메서드 안에서 return을 만나면 메서드는 종료된다.
      }
      int result = n1 / n2;
      System.out.printf("%d / %d = %d\n", n1, n2, result);
   }
   
   
   // 5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리가 될 수 있기 때문에
   //       반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도 처리될 수 있습니다.
   public static void main(String[] args) {
      
      int r1 = add(3, 8); // int r1 = 11; 과 동일
      int r2 = add(10, 15); // int r2 = 25; 과 동일
      int r3 = add(add(4, 6), add(7, 8)); // int r3 = 10 + 15; 와 동일
      
      
      int[] totalResult = operateTotal(30, 6);
      System.out.println("30 + 6 = " + totalResult[0]);
      System.out.println("30 - 6 = " + totalResult[1]);
      System.out.println("30 * 6 = " + totalResult[2]);
      System.out.println("30 / 6 = " + totalResult[3]);
      

      System.out.println("--- calcArrayTotal 메서드 문제 ---");
      int[] numbers = {57, 89, 78, 91, 93, 47}; // 매개변수로 넘길 int 배열을 선언한다.
      double[] calcArrayTotalresult = calcArrayTotal(numbers); // double로 리턴받은 numbers를 double 배열 calcArrayTotalresult에 저장한다.
      System.out.printf("총합 : %d\n", (int) calcArrayTotalresult[0]); // calcArrayTotalresult변수의 0번 인덱스는 double형이기 때문에 int형으로 형변환 해줘야 %d를 사용할 수 있다.
      System.out.printf("평균 : %.2f\n", calcArrayTotalresult[1]); // calcArrayTotalresult변수의 1번 인덱스는 double형이기 때문에 %f를 바로 사용할 수 있다.
      
         
      System.out.println("-----------------------------------------");   
      // int r4 = multi(10, 7); (x)
      // add(multi(4, 4); (x)
      // void 메서드는 리턴을 하는 값이 아무것도 없기 때문에 int r4 = multi(10, 7); 이나 출력을 할 수가 없다.
      // 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에
      // 실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도 사용이 불가합니다.
      // 반드시 단독 호출하여 사용해야 합니다.
      // 즉, void 메서드는 단순히 동작을 지시하는 역할을 수행합니다.
      // void 메서드를 선언할 때, 호출부에는 그저 실행만 하는 역할을 하는 것이다.
      multi(10, 7); // (o)
      
      divide(20, 5); // void 메서드 이므로 그냥 호출한다.
      divide(20, 0); // n2에 0을 넣으면 0으로 나눌 수 없으므로 에러가 난다.

   }

}