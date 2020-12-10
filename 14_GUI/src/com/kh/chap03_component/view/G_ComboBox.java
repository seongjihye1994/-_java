package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G_ComboBox {
	public void comboBoxTest() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		
		// ���� �̸��� �̹��� ���ϸ��� ���� ����� ��
		String[] animals = {"dog", "cat", "tiger"};
		
		// �޺� �ڽ�(��� �ٿ��� �Ǵ� ���� ����) ���� �� ���ڿ� �迭�� �־� ����
		JComboBox animalList = new JComboBox(animals);
		
		// ó���� ���� �Ǿ� �ִ� ���� ���� -> �⺻ ������ �ε��� 0
		animalList.setSelectedIndex(1);
		
		// �̹����� ǥ���� �� ����
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				// �޺� �ڽ� ����Ʈ �� � ���� Ŭ�� �Ǿ����� �̺�Ʈ ��ü �ȿ� ������ ����
				// e.getSource() -> �̺�Ʈ�� �Ͼ ��� ���� get
				JComboBox cb = (JComboBox) e.getSource();
				// ���� �� �޴��� �ؽ�Ʈ�� ������ ��
				String name = (String) cb.getSelectedItem();
				
				// ���� �� �̸��� �ش��ϴ� ������ ������ �����Ͽ� �󺧿� �ø�
				Image img = new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150,  150,  0);
				label.setIcon(new ImageIcon(img));
			}
		});
		
		// ��� �������� ���� ����
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
