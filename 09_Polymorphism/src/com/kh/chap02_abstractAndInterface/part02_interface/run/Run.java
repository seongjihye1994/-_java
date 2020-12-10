package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.GalaxyS10;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Phone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.SmartPhone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.V50;

public class Run {

	// SmartPhone���� ��ȭ, ī�޶�, ��ġ ����� ����
	// �ش� ����� ���� interface�� �����Ͽ� SmartPhone Ŭ�������� ���� ��� ���� ��
	// �߻� Ŭ������ SmartPhone�� ��� �޾� GalaxyS10�� V50�� ����
	
	// 1. Phone(interface) -> ��ȭ���
	// 2. Camera(interface) -> ī�޶� ���
	// 3. CellPhone(interface) -> �޴� ��ȭ(Phone, Camera ���)
	// 4. TouchDisplay(interface) -> ��ġ ���
	// 5. SmartPhone(abstract class) -> ����Ʈ��(CellPhone, TouchDisplay ���)
	// 6. GalaxyS10 -> SmartPhone�� ��� ���� Ŭ����
	// 7. V50 -> SmartPhone�� ��� ���� Ŭ����
	public static void main(String[] args) {
		
		// Phone �������̽��� ��� �ʵ忡 ����
		System.out.println(Phone.NUM);
		// Phone.NUM = 20; -> final ���� �Ұ�
		
		// Phone p = new Phone();
		// -> �������̽��� ��ü ���� �Ұ�
		
		// ��ü �迭�� ����� ������ �ε����� GalaxyS10, V50 ��ü ����
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyS10();
		phone[1] = new V50();
		
		// �ݺ��� ���� �޼ҵ� ȣ��
		for (int i = 0; i < phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
		} // ���� ���ε�(Ŭ���ϰ� ����)�� �θ�Ŭ������ ���ǵ� �޼ҵ�������,
		// ����ÿ��� ���� ���ε�(�������̵� ��) �޼ҵ�� ����ȴ�.
		

	}
	// �������̽��� ����ϴ� ����?
	
	// ��ȭ, ī�޶�, ��ġ ���� ���߾�� �� ����� �̆����̽��� �޼ҵ�� �ۼ��� �θ�
	// �� �������̽��� ��� ���� ��� Ŭ�������� �ݵ�� �� �޼ҵ带 �����ؾ� �Ѵ�.
	// -> ���� ��ɻ��� �ϰ��� ����(ǥ��ȭ)
	
	// ��ȭ, ī�޶�, ��ġ �� ���� �������̽��� �����Ͽ� ����� ���� �� ����
	// -> ���� ��ӿ� ���� ������ �غ�
	
	// ���� Ÿ�� ���ҷ� �������� �����Ͽ� ����
	// -> �θ� Ÿ�� ���۷����� ���� Ÿ�� ��� ��� �� �ڵ� ���� �� ����(�޼ҵ��� �Ű�����/����Ÿ������ Ȱ��)
	
	// �޼ҵ� ȣ�� �� ����θ� �˸� �ǹǷ� �ٸ� ������ �޼ҵ尡 �ϼ����� �ʴ���
	// ������ ���� ���� ����
	// -> ���� �۾��� ���� �������̽� ����
	

}
