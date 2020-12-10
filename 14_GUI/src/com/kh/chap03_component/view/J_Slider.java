package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class J_Slider {
	
	public void sliderTest() {
		// ������ ���� �� ũ�� ����
		JFrame frame = new JFrame("�����̴� �׽�Ʈ");
		frame.setSize(300, 300);
		
		// �г� �� �� �����Ͽ� �гο� �ø�
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		panel1.add(label);
		
		// �г� ����
		JPanel panel2 = new JPanel();
		// �����̴� ����
		JSlider slider = new JSlider(0, 30, 15); //�ּҰ�, �ִ밪, �⺻��
		slider.setMajorTickSpacing(10); // ū ���� ����
		slider.setMinorTickSpacing(1); // ���� ���� ����
		slider.setPaintTicks(true);	// ���� ǥ��, �⺻ �� false
		slider.setPaintLabels(true); // ���� �󺧷� ǥ��, �⺻ �� false
		
		// �����̴� �гο� �ø�
		panel2.add(slider);
		
		// ��ư �����Ͽ� �гο� �ø�
		JButton button = new JButton("����");
		panel2.add(button);
		
		// ��� �г� �����Ͽ� �󺧵��� �гο� �ø�
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("����� : ");
		resultPanel.add(text);
		JLabel result = new JLabel();
		resultPanel.add(result);
		
		// ��ư�� Ŭ�� �Ǿ��� ����� �̺�Ʈ ����
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����̴��� ���� ���� ��� ���� ǥ���� label�� text�� ����
				result.setText(slider.getValue()+"");
			}
			
		});
		
		// �����ӿ� 3���� �г� �ø�
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(resultPanel, "South");
		
		// �׻� �ʿ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
