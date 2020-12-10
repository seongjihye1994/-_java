package com.kh.event.part03_ChangePanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		this.setTitle("프로젝트 명");
		this.setBounds(50, 50, 1200, 800);
		
		// 프레임이 가진 컨테이너 호출해서 이동하고자 하는 패널 추가
		// frame 매개변수 전달하면서
		this.getContentPane().add(new StartPage(this)); // 컴포넌트가 올라가는 곳에 startPage 올름
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	

}
