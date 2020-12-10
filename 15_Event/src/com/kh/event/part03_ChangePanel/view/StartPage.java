package com.kh.event.part03_ChangePanel.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartPage extends JPanel {
	
	public StartPage(JFrame mf) { // ���� �������� �̵��ϰ� �ϴ� �ڵ带 ���⿡ �ۼ�
		this.setSize(1200, 800);
		this.setLayout(null); // Panel�� �⺻ ���̾ƿ��� FlowLayout, ��ǥ�� ��Ȯ�ϰ� �� ����ϰ� �������� null���� ����
		
		JButton btn = new JButton("���⸦ Ŭ���ϸ� ���� �������� �̵��մϴ�.");
		btn.setBounds(450, 300, 300, 30); 
		this.add(btn);
		
		// ������ �̵� �̺�Ʈ - ��ư�� Ŭ�� �Ǿ��� ��
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 1. ���� �������� �����̳ʸ� ���� ��� ���� �����.
				mf.getContentPane().removeAll();
				// 2. ���� �������� �����̳ʿ� �̵��ϰ��� �ϴ� �г��� �߰��Ѵ�.
				mf.getContentPane().add(new Home(mf));
				// 3. �ٽ� �׸���.
				mf.repaint();
				mf.setVisible(true);
			}
			
		});
		
		
		
	}

}
