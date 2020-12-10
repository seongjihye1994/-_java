package com.kh.chap02_layout.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {
	

	public E_NullLayout() {
		
		super("NullLayout");
		
		// Layout 지정 없이 위치를 지정하면서 배치하는 방법
		this.setLayout(null);
		
		JLabel lb = new JLabel("이 름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		// 입력받는 칸
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		this.add(lb);
		this.add(tf);
		
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
