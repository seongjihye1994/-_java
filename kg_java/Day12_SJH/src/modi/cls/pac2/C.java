package modi.cls.pac2;

import modi.cls.pac1.*;

public class C {

	// 서로 다른 패키지의 클래스의 객체를 생성하기 위해서는 import 해줘야 합니다.
	//A a = new A(); // A클래스는 public가 없기 때문에 서로 다른 클래스에서 패키지를 import해줘도 사용할 수가 없습니다. 패키지프랜들리는 같은 패키지 내에서만 접근을 허용한다.
	B b = new B(); // B클래스는 public이 붙어있습니다.
	
}
