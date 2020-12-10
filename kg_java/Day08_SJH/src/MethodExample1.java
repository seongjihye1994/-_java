
      // # 메서드 (method)

      // - 메서드란?
      // 반복되는 코드에 이름을 붙여놓은 것입니다.
      
      // 메서드는 반복되는 코드를 줄여주고,
      // 좀 더 구조화시켜서 우리가 코드를 알아보기 쉽게 합니다. (코드의 모듈화)
      
      // 메서드는 1)선언하는 과정(만들기)과 2)호출하는 과정(사용하기)으로 나누어집니다.

      // 메서드의 선언(만들기)은 메서드 내부에서는 불가능합니다. 
      // 새로운 메서드의 선언은 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.
   
      // 메서드 호출(사용하기)은 메서드나 생성자 블록 내부에서만 가능합니다.
   
      // 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며, 메서드가 필요로 하는 데이터(매개값)를 호출할 때 전달하면,
      // 그 값을 받아서 메서드 내부 로직이 실행되고, 그 실행 결과값을 호출부로 다시 반환합니다.


public class MethodExample1 {
   
   

   // 메서드의 선언. (메서드 외부, 클래스 내부에서 선언 가능)
   static int calcTotal(int x) { // static + 리턴타입형 + 메소드이름(리턴타입형 + 매개변수) {}
      int total = 0;
      for (int i = 1; i <= x; i++) {
         total += i;
      }
      return total; // total 값을 아래의 calcTotal(여기로)반환하고, int형 result 변수에 저장한다.
   }
   
   
   
   public static void main(String[] args) {

      
      // 메서드의 호출. (메서드나 생성자 내부에서 사용 가능)
      int result = calcTotal(10); // 여기서 호출하면 위의 int x에 대입되고, 메서드가 끝난 후 리턴을 만나면 메서드 내부의 반복문의 로직 값이 전달된다.
      System.out.println(result); // 55
      
      // 아래 정수를 위 메서드의 매개변수에 던져넣고, 리턴을 만나면 반복문의 로직 값이 다시 바로 위의 calcTotal(여기로) 전달된다.
      System.out.println("1~100까지의 누적합 : " + calcTotal(100)); 
      System.out.println("1~200까지의 누적합 : " + calcTotal(200)); 
      System.out.println("1~300까지의 누적합 : " + calcTotal(300)); 
      System.out.println("1~400까지의 누적합 : " + calcTotal(400)); 
      System.out.println("1~500까지의 누적합 : " + calcTotal(500)); 
      System.out.println("1~600까지의 누적합 : " + calcTotal(600)); 
      System.out.println("1~700까지의 누적합 : " + calcTotal(700)); 
      
      
      
      
   }

}