package com.kh.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	
	public D_CardLayout() {
		
		super("CardLayout");
		
		// Panel�� �̿��ؼ� ī�� ���� ����� ���� ���� �̺�Ʈ�� �̿��ؼ� �ٸ� ���� ���̰� ����
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		// �г� �����
		// �г��� ������Ʈ������ �ٸ� ������Ʈ�� ������ �� �ִ� �����̳��� ������ ���ϱ⵵ ��
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// �� �гο� ���� ����
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(new Color(50, 100, 100)); // RGB ����
		
		// �� �гο� �� �߰�
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		// ���� �����ӿ� �г� �߰�
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		// �гο� �̺�Ʈ �߰� -> card1�̶�� �гο� click �̺�Ʈ�� �߻��Ѵٸ� ������ �ڵ� �ۼ�
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1)  { // MouseEvent.BUTTON1 : ���� Ŭ���� �Ͼ�ٴ� �ǹ�
					card.next(card1.getParent()); // ���콺�� �����Ǹ� ī�带 �ٲ��ּ���. : �θ�Ŭ������ ��û
				} if (e.getButton() == MouseEvent.BUTTON3) { // MouseEvent.BUTTON3 : ������ Ŭ���� �Ͼ�ٴ� �ǹ�
					card.previous(card1.getParent()); // ī�带 ���� ī��� �ٲ��ּ���. : �θ�Ŭ������ ��û
				} // card1�� �������� ��������, ���������� ȭ�� �ٲ���
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1)  { 
					card.next(card2.getParent()); 
				} if (e.getButton() == MouseEvent.BUTTON3) {
					card.previous(card2.getParent()); 
				} 
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1)  { 
					card.next(card3.getParent()); 
				} if (e.getButton() == MouseEvent.BUTTON3) {
					card.previous(card3.getParent()); 
				} 
			}
		});
		
		
		
		
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
