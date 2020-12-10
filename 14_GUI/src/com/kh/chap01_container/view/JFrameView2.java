package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// �������� �����ϴ� ��� 2
// javax.swing.JFrame Ŭ������ ��ü�� ���� ��
// �ش� ������ ��ü�� ���� ���� �����ϴ� ���

public class JFrameView2 {
	
	public JFrameView2() {}
	
	public void showJFrame() {
		JFrame mainFrame = new JFrame(); // JFrame ��ü ����
		
		mainFrame.setTitle("MyFrame2");
		
		// Rectangle ��ü�� Ȯ���� ������ ����
		Rectangle r = new Rectangle(300, 200, 800, 500); // ���簢�� ��ü
		mainFrame.setBounds(r);
		
		mainFrame.setResizable(false);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("image/icon.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
