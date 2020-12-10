package com.kh.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	public B_FlowLayout () {
		super("FlowLayout"); // 부모 생성자로 타이틀 지정
		
		// 컴포넌트를 가로나 세로 방향의 줄 단위로 배치하는 레이아웃
		this.setLayout(new FlowLayout()); // 기본은 "CENTER"
		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		this.setLayout(new FlowLayout(FlowLayout.LEADING));
//		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		this.add(new JButton("5번"));
		this.add(new JButton("6번"));
		this.add(new JButton("7번"));
		this.add(new JButton("8번"));
		this.add(new JButton("9번"));
		this.add(new JButton("10번"));
		this.add(new JButton("11번"));
		this.add(new JButton("12번"));
		this.add(new JButton("13번"));
		this.add(new JButton("14번"));
		this.add(new JButton("15번"));
		
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

}
