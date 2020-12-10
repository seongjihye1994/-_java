
      // # 매개 변수 (parameter, argument)

      // 1. 매개변수는 메서드를 호출(사용하기)할 때, 메서드 실행에 필요한 값들을
      // 메서드 내부로 전달하는 매개체 역할을 합니다. 
      // 즉, 메서드를 선언(만들기)하고 호출(사용하기)사이를 이어주는 변수다.

      // 2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
      // 메서드의 실행 결과는 달라질 수 있습니다.

      // 3. 매개값을 몇 개 받아 사용할지는 메서드를 선언할 때 선언부에서 
      // () 괄호 안에 미리 갯수와 타입을 지정합니다.
      // 메서드를 호출(사용)할 때 매개값으로 전달되는 인자는 매개값으로 받는 함수의 선언(만들기)시의 매개값의 개수와
      // 일치해야 한다.

      // 4. 매개변수를 하나도 선언하지 않을 수 있습니다. 이 때는 메서드의 선언부에
      // () 괄호 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.


public class MethodExample2 {
   
   // x ~ y 까지의 누적합.
   static int calcRangeTotal(int start, int end) {
      int total = 0;      
      for (int i = start; i <= end; i++) { // 매개변수로 받은 x부터, y까지의 누적합을 구하는 반복문 로직
         total += i;
      }
      return total; // start부터 end까지의 누적합을 저장하는 total값을 돌려준다.
   }
   
   // 매개변수가 필요없는 경우.
   static String selectRandomFood() {
      
      double rn = Math.random(); // 메서드 내부에서 난수를 생성하기 때문에 매개변수를 받을 필요가 없다.
      
      if (rn > 0.66) {
         return "치킨";
      } else if (rn > 0.33) {
         return "족발";
      } else {
         return "삼겹살";
      }   
   }

   
   // 정수를 여러 개 전달하면 그 정수들의 총 합을 리턴하는 메서드.
   static int calcNumberTotal(int[] nums) { // 인자를 몇개를 받을 지 모를때는 매개변수를 배열로 선언한다.
      
      int total = 0;
      
      for (int i : nums) {
         total += i;
      }
      return total;
   }
   
   
   // 메서드 선언(만들기)
   // -------------------------------------------------------------------------------------
   // 메서드 호출(사용하기)
   
   
   public static void main(String[] args) {
      
      int result = calcRangeTotal(3, 7); // 3은 start에, 7은 end에 차례대로 전달됨
      System.out.println(result); // 25
      // 위의 calcRangeTotal함수 내부의 반복문의 로직값이 total에 저장되고,
      // return을 만나 total 값을 result에 돌려준다.
      
      
      System.out.println("오늘 저녁 뭐먹지??? : " + selectRandomFood());
      // () 괄호를 비워두고 매개변수를 넘기지 않는다.

      
      
      int[] arr = {10, 30, 50, 70, 90};
      int sum = calcNumberTotal(arr); // arr 배열을 calcNumberTotal메소드의 매개변수로 넘기면
      // calcNumberTotal에 선언된 배열 nums로 들어간다.
      // 그리고 함수 내부의 로직에 의해 누적합을 구한 후 리턴을 만나면
      // 그 값을 다시 clacNumberTotal로 돌려주고, 그 값을 sum에 대입한다.
      System.out.println("누적합 : " + sum); // 250
      
      
      
   }

}