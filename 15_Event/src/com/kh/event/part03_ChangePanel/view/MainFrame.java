package com.kh.event.part03_ChangePanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		this.setTitle("������Ʈ ��");
		this.setBounds(50, 50, 1200, 800);
		
		// �������� ���� �����̳� ȣ���ؼ� �̵��ϰ��� �ϴ� �г� �߰�
		// frame �Ű����� �����ϸ鼭
		this.getContentPane().add(new StartPage(this)); // ������Ʈ�� �ö󰡴� ���� startPage �ø�
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	

}
