package com.kh.event.part03_ChangePanel.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartPage extends JPanel {
	
	public StartPage(JFrame mf) { // 다음 페이지로 이동하게 하는 코드를 여기에 작성
		this.setSize(1200, 800);
		this.setLayout(null); // Panel의 기본 레이아웃은 FlowLayout, 좌표를 정확하게 찍어서 사용하고 싶을때는 null값을 리턴
		
		JButton btn = new JButton("여기를 클릭하면 메인 페이지로 이동합니다.");
		btn.setBounds(450, 300, 300, 30); 
		this.add(btn);
		
		// 페이지 이동 이벤트 - 버튼이 클릭 되었을 때
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 1. 메인 프레임이 컨테이너를 얻어와 모든 값을 지운다.
				mf.getContentPane().removeAll();
				// 2. 메인 프레임의 컨테이너에 이동하고자 하는 패널을 추가한다.
				mf.getContentPane().add(new Home(mf));
				// 3. 다시 그린다.
				mf.repaint();
				mf.setVisible(true);
			}
			
		});
		
		
		
	}

}
