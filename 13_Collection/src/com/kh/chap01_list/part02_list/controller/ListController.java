package com.kh.chap01_list.part02_list.controller;


import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class ListController {

	// List �迭 Ʋ¡ : ���� ����, �ߺ� ���� ����
	// List �迭 ���� : ArrayList(����ȭ x), Vector(����ȭ O), LinkedList
	// LinkedList -> ��ü ����, ������ ����� ���� ArrayList���� ȿ���� ����
	// vector�� ArrayList�� �������̸� ����Ʈ �迭�� ��� �޼ҵ�� �����ϹǷ� ArrayList�� ��ǥ�� �׽�Ʈ
	
	public void doList() {
		// List�� �������̽��̹Ƿ� ��ü ���� �Ұ�
//		List list = new List(); // ��ü ���� x
		
		// List�� �ļ� Ŭ������ ArrayList�� ��ü ����(������ : �θ� ���۷����� �ڽ� ��ü�� �ٷ�)
//		List list = new ArrayList();
		
		// ����� (��� �޼���)�� �ߴ� ����?
		// � Ÿ���� �����ϴ��� �������� �ʾƼ� �������� ������ �ִٰ� �˷��ִ� �޼���
		// ���׸��� <Music>���� �������ָ� ��� ������� String ���� ���� �Ұ��� �ϰ� ��
		// ���׸��� ���� ����
		// 1. ������ (�ٸ� Ÿ���� �� �� ������ ���� �߻�)
		// 2. ��ȯ�� �ٿ� ĳ���� �ʿ� ����
		
		ArrayList<Music> list = new ArrayList<Music>(3);
		// �⺻ ������ -> ũ�� ���� x -> �⺻ 10
		// �Ű����� ������ -> ũ�� ���� o
		System.out.println(list);
		
		// 1. add(E e) : ����Ʈ�� �� ���� �ν��Ͻ� ������ �߰�
		list.add(new Music("����", "��������"));
		list.add(new Music("ȭ��", "Maria"));
		list.add(new Music("�����̰�", "��¦ ������"));
//		list.add("��"); // *** Music���� ���׸��� �����ϸ� String Ÿ���� add �Ұ����ϹǷ� ���� �߻� ***
		
		// 3���� ũ�⸦ �����ߴµ� "��"�� �߰��ص� ���� x
		// -> 1) ũ���� ������ ����
		// Music ��ü�� �ƴ� String ��ü�� �־ ��� x
		// -> 2) ���� Ÿ���� ��ü�� ������ �� ����
				
		System.out.println(list);
		
		// 2. add(int index, E e) : �ε��� �����Ͽ� �ش� �ε����� E �߰�
		list.add(1, new Music("Anne-Marie", "2002")); // 1�� �ε����� �߰�
		System.out.println(list);
		
		// 3. set(int index, E e) : ������ �ε����� ���� E�� ����
		list.set(1, new Music("�����", "��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�")); // 1�� �ε����� ����
		System.out.println(list);
		
		// 4. size() : ����Ʈ �ȿ� �� ���� �����Ͱ� ��� �ִ��� ����
		System.out.println(list.size());
		
		// 5. remove(int index) : �ش� �ε����� �ν��Ͻ� ����
		list.remove(0);
		System.out.println(list.size());
		// -> 3) �߰�, ���� �� �ڵ� ó��(������ �˰��� �ۼ��� �ʿ� ����) �Ǿ� ������
		
		// 6. get(int index) : �ش� �ε����� �ν��Ͻ� ��ȸ
		Music m = /*(Music)*/ list.get(0); 
		// ���׸��� ���� �� : get �޼ҵ尡 Object Ÿ������ ���ϵǾ� Music���� �ٿ� ĳ����
		// *** ���׸��� ���� �� : get �޼ҵ��� ���� Ÿ���� Music���� ���� �ǹǷ� ĳ���� ���ʿ� 
		System.out.println(m);
		
		// 7. contains(Object o) : �ش� ��ü�� �����ϰ� �ִ��� �� ���� ����
		System.out.println(list.contains(new Music("�����", "��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�")));
		// ���� �� false�� ����, why??
		// ���⼭ contains�� ��ü�� �ʵ尪�� ���ϴ°� �ƴ϶� �ּҰ��� ���ϰ� ����
		// ���� �ʵ尪�� ���ϰ� �Ϸ��� -> Music Ŭ������ �ʵ尪�� ���ϴ� equals() �������̵��Ǿ�� ��
		// MusicŬ������ equals()�� �������̵� �� �� �ٽ� �����ϸ� true�� ����
		
		// 8. indexOf(object o) : �ش� ���� ���� �ε����� ���� -> �ش��ϴ� ���� ������ -1 ����
		// contains() ���ο��� ȣ�� �Ǿ��� �޼ҵ�� ���� equals() �������̵��� �Ǿ�� �� ������
		System.out.println(list.indexOf(new Music("�����", "��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�")));

		// 9. subList(int index1, int index2) : index1���� index2 -1 ���� List�� �����Ͽ� ����
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : ����Ʈ�� ���� �÷��� �߰�
		list.addAll(sub);
		System.out.println(list);
		
		// 11. isEmpty() : ����Ʈ ���� ���� ������� �� ���� ����
		System.out.println(list.isEmpty());
		
		// 12. clear() : ��ü ����
		// list.clear();
		// System.out.println(list.isEmpty());
		
		// �ݺ����� ���� ��� ��ü �ϳ��� �����Ͽ� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} System.out.println(); // ����
		
		// ��� �� for�� (for Each��)
		for (Music music : list) {
			System.out.println(music);
		}
		
	}

}
