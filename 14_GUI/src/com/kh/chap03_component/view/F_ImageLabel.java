package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_ImageLabel {
	public void imageLabelTest() {
		JFrame frame = new JFrame();
		frame.setSize(250, 300);
		
		JPanel panel = new JPanel();
		
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon = new ImageIcon("image/user.PNG").getImage().getScaledInstance(150, 150, 0);
		//											�̹����� �̾ƿͼ� �̹����� ����� �����Ѵ�.
		// ������� �̹��� ��ü�� JLabel�� �ֱ�
		JLabel label = new JLabel(new ImageIcon(icon));
		JButton button = new JButton("�̹��� ����");
		
		// ��ư Ŭ�� �� �ٸ� �̹����� ���� (�̺�Ʈ ������)
		button.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count++; // Ŭ�� Ƚ��
				String image = "";
				if (count % 2 != 0) { // Ŭ�� Ƚ���� Ȧ���϶�
					// ������ �̹��� �����ֱ�
					image = "image/dog.PNG";
				} else { // Ŭ�� Ƚ���� ¦���϶�
					// user �̹���
					image = "image/user.PNG";
				}
				
				Image icon = new ImageIcon(image).getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(icon));
			}
		});
		
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
