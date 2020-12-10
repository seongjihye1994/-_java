package com.kh.event.part02_HowToUse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �ڹ� GUI �̺�Ʈ ó�� (Event Handling) ��� 1
// �ش� ������Ʈ�� ������ �߰��ϸ鼭 ����(�͸�) Ŭ���� ����
public class A_AnomynusClassTest {
	
	private static int count = 0; // ���콺 Ŭ�� Ƚ��
	
	public static void main(String[] args) {
		JFrame mf = new JFrame("�͸�Ŭ���� ����");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn) { // �̺�Ʈ�� �߻��� �߻����� ��ư�̳�?
					label.setText("���� ��ư�� ���������ϴ�.");
				}
				// --- �߻��� Ȯ���� ���� ��� ---
				System.out.println(btn);
				System.out.println(e);
				System.out.println(e.getSource());
			}
		});
		
		// ���콺 �̺�Ʈ
		/* �̺�Ʈ �߻� ��ü.addXXXListener(XXXListener / XXXAdapter ����);
		 * 
		 * XXXLister -> �������̽� -> �߻� �޼ҵ常�� ������ ����
		 * XXXAdapter -> �߻�Ŭ���� -> Listener�� ������ �߻� Ŭ������ �Ϲ� �޼ҵ�� �߻� �޼ҵ尡 �� �� ������ �� ����
		 * 
		 * Listener �������̽��� �ƹ� ���� ���� ������ ���� Ŭ���� -> Adapter Ŭ����
		 * 
		 * �������̽��� �߻�Ŭ������ ����?
		 * �������̽��� �޼ҵ带 ������ ������ �� �������̵� �ؾ���
		 * �߻�Ŭ������ �Ϲ� �޼ҵ�� �߻� �޼ҵ尡 �� �� �ִµ�, �� �� �߻� �޼ҵ�� �������̵� �ؾ���
		*/		
		btn.addMouseListener(new MouseAdapter() {
			// Listener�� �ƴ� Adapter�� ����ϸ� �������̵� �ϰ� ���� �޼ҵ常 ��� �ۼ�(���� �������̵� x)
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int num = count % 7;
				switch (num) {
				case 0 :
					btn.setBackground(Color.red); break;
				case 1 :
					btn.setBackground(Color.orange); break;
				case 2 :
					btn.setBackground(Color.yellow); break;
				case 3 :
					btn.setBackground(Color.green); break;
				case 4 :
					btn.setBackground(Color.blue); break;
				case 5 :
					btn.setBackground(new Color (0, 0, 165)); break; // rgb ����
				case 6 :
					btn.setBackground(new Color(149, 54, 255)); break; // rgb ����
				} 
				count++; // Ŭ�� �� ������ ī��Ʈ
			}
		
		});

		panel.add(btn);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
