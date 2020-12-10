package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// �ڱ� �ڽ��� ���������� �����ϴ� 1�� ���
public class A_BorderLayout extends JFrame {
	
	public A_BorderLayout() {
		
		// �θ� ������ �� ������ �̸� ������ ���� ����
		super("BorderLayout");
		
		// ������ ��ġ �� ũ�� ����
		this.setBounds(300, 200, 800, 500);
		
		// ���̾ƿ� ���� -> layout ������ ������ �⺻ ���� borderlayout
		this.setLayout(new BorderLayout());
		
		JButton north = new JButton("��");
		JButton south = new JButton("��");
		JButton east = new JButton("��");
		JButton west = new JButton("��");
		JButton center = new JButton("���");
		
		// JButton ��ü�� ��������� �� ȭ�鿡 ������ ���� -> ���̱� ���ؼ�  �����̳�(JFram)�� �÷��� ��
		// add() �޼ҵ� �̿�, �� �� ��ġ�� ����
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
