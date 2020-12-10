package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		// ��Ģ : '=' ��� ���� ������ �� �� �ڷ���(Ÿ��)�� ���ƾ� ��
		
		System.out.println("1. �θ� Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		// p ���۷����� Parent���� ���� ����
		
		System.out.println("2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		// c1 ���۷����� Parent, Child1 �� �� ���� ����
		
		// ******** ���ݺ��� �ٿ����� ����Ǵ� ���� **********
		System.out.println("3. �θ� Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Parent p2 = /*(Parent)*/ new Child1();
		// ���� �����ڸ� �������� ���ʰ� ������ Ÿ���� �ٸ����� ���� ���� -> �ڵ� ����ȯ, ������ ����ȯ
		p2.printParent();
		// p2��� ���۷����� Parent �� ���� ���� -> ���� Parent Ÿ���̹Ƿ�
		// p2.printChild1(); -> Child1���� �ٷ� ���� �Ұ���
		// Child1�� �����ϰ� ������ ����ȯ�� �ʿ��� -> ���� ����ȯ, ����� ����ȯ
		((Child1)p2).printChild1(); // ��ȣ�� . �߿��� .�� ���� ����Ǳ� ������ ĳ������ ���� ���ֱ� ���� �ٱ� ��ȣ�� ������
		
		// ��� ������ Ŭ������ ������ ����ȯ ����
		// 1. UpCasting
		// --> �ڽ� Ÿ�Կ��� �θ� Ÿ������ ��ȯ
		// Parent p = new Child1();
		// ����ȯ ���� ���� -> �ڵ� ����ȯ, ������ ����ȯ
		
		// 2. DownCasting
		// --> �θ� Ÿ�Կ��� �ڽ� Ÿ������ ��ȯ
		// ((Child1)p2).printChild1();
		// ����ȯ ���� �Ұ� -> ���� ����ȯ, ����� ����ȯ
		
		System.out.println("4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		// Child1 c2 = new Parent();	
		// ������ ���� : �ҽ� �ڵ� ���� ���� ���� => Type mismatch
		// Child1 c2 = (Child1)new Parent(); 
		// ��Ÿ�� ���� : ���α׷� ���� �� �߻��ϴ� ���� => ClassCastException : Cast ������ ��� �� Ÿ�� ����
		
		// �������� ����
		// : �θ� Ÿ�����κ��� �Ļ� �� �������� Ÿ���� �ڽ� ��ü�� �θ� Ŭ���� Ÿ�� �ϳ��� �ٷ� �� �ִ� ���
		// �������� ���� ����?
		// : �θ� Ÿ�� ���۷����� �پ��� �ڽ� Ÿ�Ե��� �� �޾��� �� ����
		
		// ������ ���� ��
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		System.out.println("=== ������ ���� �� ��ü �迭�� ===");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// �ϳ��� �θ� Ÿ������ �پ��� �ڽĵ��� ���� �� ����
		// -> �ڽĿ��� ������ �� �ϳ��� �θ� Ÿ������ ���� �� �� ����
		// -> ��, �ڵ� ���� ����, ������ �ڵ� ����
		
		// ������ �޼ҵ� ȣ���غ��� (printChild1, printChild2)
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		// �ڽİ�ü�� �θ�ü�� �ؼ����� ��
		// �ڵ� ����ȯ�� �Ͼ��.
		// ������ �θ� Ÿ������ �ؼ� �� �ڽİ�ü���� �����
		// ����Ϸ��� �θ�Ÿ���� �ٿ�ĳ���� ����� �Ѵ�.
		
		System.out.println("=== �ݺ��� �̿��ؼ� ��� ===");
		for (int i = 0; i < arr.length; i++) {
			// �� �ε������� � �ڽ� ��ü�� �����ϰ� �ִ��� ��� �Ǻ�����?
			// <instanceof ������>
			// ���� ���۷����� � Ŭ�������� �ּҸ� �����ϰ� �ִ��� Ȯ���� �� ���
			// Ŭ���� Ÿ���� ��ġ�ϸ� true, �ƴϸ� false�� ����
			if (arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else if(arr[i] instanceof Child2) {
				((Child2)arr[i]).printChild2();
			}
		}
		
		System.out.println("=== for-each�� �̿��ؼ� ��� ===");
		for (Parent p : arr) {
			if (p instanceof Child1) {
				((Child1)p).printChild1();				
			} else {
				((Child2)p).printChild2();		
			}
		}
		
		System.out.println("=== �������̵� �����ؼ� ��� ===");
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
			// -> �ڵ����� ���� �����ϰ� �ִ� ��ü�� �޼ҵ带 ã�ư��� ����
			// ���α׷��� ���� �Ǳ� ���� �������� �Ǹ鼭 ��� �޼ҵ�� "���� ���ε�" ��
			// �׷��� �޼ҵ� ���� ȣ�� �� �ش� ��ü Ÿ���� �������� �ٽ� ���ε� �Ǵ� ����"���� ���ε�"
			// �̶�� ��. ��� ����� �̷���� �������� ���� �� ��� �޼ҵ� �������̵��� �Ǿ� ������
			// ���� ���ε� �� �޼ҵ� �ڵ庸�� �������̵� �� �޼ҵ带 �켱������ ������
			
		}
	}

}
