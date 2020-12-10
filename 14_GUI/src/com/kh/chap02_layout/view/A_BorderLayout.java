package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 자기 자신을 프레임으로 설정하는 1번 방식
public class A_BorderLayout extends JFrame {
	
	public A_BorderLayout() {
		
		// 부모 생성자 쪽 프레임 이름 전달할 수도 있음
		super("BorderLayout");
		
		// 프레임 위치 및 크기 설정
		this.setBounds(300, 200, 800, 500);
		
		// 레이아웃 설정 -> layout 설정이 없으면 기본 값이 borderlayout
		this.setLayout(new BorderLayout());
		
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		// JButton 객체가 만들어졌을 뿐 화면에 보이지 않음 -> 보이기 위해선  컨테이너(JFram)에 올려야 함
		// add() 메소드 이용, 이 때 위치를 지정
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
