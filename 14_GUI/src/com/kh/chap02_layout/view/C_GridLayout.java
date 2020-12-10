package com.kh.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	
	public C_GridLayout() {
		
		super("GridLayout");
		
		// ������Ʈ�� ����, ���� ���� ����ŭ ��ġ�ϰ��� �� �� ���
		this.setLayout(new GridLayout(5, 5, 10, 20));
		//							   ���� ĭ, ���� ĭ, ���� ��, ���� ��
		
		for (int i = 1; i < 26; i++) {
			String str = new Integer(i).toString(); // ��ư �ȿ� �� ���� 1~25 // JButton �����ڰ� String���� �Ǿ� �ֱ� ������ Intege�� ���ڷ� ��ȯ�� �� ����
			this.add(new JButton(str));
		}
		
		
		
		
		
		
		
		
	
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
