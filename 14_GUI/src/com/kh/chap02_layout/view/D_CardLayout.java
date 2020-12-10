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
		
		// Panel을 이용해서 카드 판을 만들어 겹쳐 놓고 이벤트를 이용해서 다른 판이 보이게 설정
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		// 패널 만들기
		// 패널은 컴포넌트이지만 다른 컴포넌트를 포함할 수 있는 컨테이너의 성격을 지니기도 함
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// 각 패널에 배경색 지정
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(new Color(50, 100, 100)); // RGB 설정
		
		// 각 패널에 라벨 추가
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		// 메인 프레임에 패널 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		// 패널에 이벤트 추가 -> card1이라는 패널에 click 이벤트가 발생한다면 실행할 코드 작성
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1)  { // MouseEvent.BUTTON1 : 왼쪽 클릭이 일어났다는 의미
					card.next(card1.getParent()); // 마우스가 오버되면 카드를 바꿔주세요. : 부모클래스에 요청
				} if (e.getButton() == MouseEvent.BUTTON3) { // MouseEvent.BUTTON3 : 오른쪽 클릭이 일어났다는 의미
					card.previous(card1.getParent()); // 카드를 이전 카드로 바꿔주세요. : 부모클래스에 요청
				} // card1을 기준으로 왼쪽으로, 오른쪽으로 화면 바껴짐
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
