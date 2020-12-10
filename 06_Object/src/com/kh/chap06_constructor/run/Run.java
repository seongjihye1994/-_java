package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// 1. �⺻ �����ڷ� ��ü ����(�ʵ尪 x)
		User user = new User();
		System.out.println(user.info());
		
		// JVM�� �⺻ �� ���
		// ���� ������ �ʱ�ȭ �ϰ� ������ ������ setter �޼ҵ带 �̿��� ���� �Է��ؾ� ����
		
		// 2. �Ű����� �����ڷ� ��ü ����
		// -> ��ü ������ ���ÿ� �ʱ�ȭ�ϴ� ���
		User user2 = new User("user2", "pass02", "ȫ�浿");
		System.out.println(user2.info());
		
		// �����ڴ� �⺻ ������ ���� �پ��� �Ű����� �����ڸ� ���� �� ����
		User user3 = new User("user03", "pass03", "�캰��", 20, 'F');
		System.out.println(user3.info());
		

	}

}
