package com.kh.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// �������� �����ϴ� ��� 1
// javax.swing.JFrame Ŭ������ ��� �޾� �����ڿ��� �����ӿ� ���� ���� ��
// �ٸ� Ŭ�������� ȣ���ϴ� ���

public class JFrameView1 extends JFrame {
	
	// �⺻ ������ �ȿ� ������ �⺻ ���� ����ֱ�
	public JFrameView1() {
		this.setLocation(300, 200); // ������ ��ġ ���� (����, ����)
		this.setSize(800, 500); // ������ �ȼ� ũ�� (����, ����)
		
		// ������ ��ġ�� ũ�⸦ �ѹ��� ����
		this.setBounds(300, 200, 800, 500); // ��ġ ����, ����, ũ�� ����, ����
		
		// ������ ��ܿ� �̸� ����
		this.setTitle("MyFrame");
		
		// ������ ��ܿ� �ΰ� �̹��� ����
		try {
			this.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ������ ������ ���� : �⺻ ������ ������ ������ ������ Ȱ��ȭ �Ǿ� ����
		this.setResizable(false); // true�� �⺻������ ������ ������ ������
		
		// -------------- �Ʒ� �ΰ����� �� �������� �����ؾ� �� -------------------
		// ���� �� x�� ������ â�� �ݴ��� ���μ����� ������ ���� ����
		// â�� �ݾ��� �� ���μ����� ���� ���� ��Ű�� ���ؼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setVisible �޼ҵ带 �������� ó���Ͽ� �������Բ� ��
		this.setVisible(true);
	}
	
	

}
