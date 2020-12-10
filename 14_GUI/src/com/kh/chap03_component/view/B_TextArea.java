package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {
	
	public void textAreaTest() {
		
		JFrame frame = new JFrame();
		
		// ������Ʈ
		JTextField tf = new JTextField(30); // �Է¿� �ؽ�Ʈ �ʵ�
		JTextArea ta = new JTextArea(10, 30); // ��¿� �ؽ�Ʈ ����
		
		// �̺�Ʈ ��� tf
		// tf -> �ؽ�Ʈ �ʵ忡�� �ۼ� �� ���͸� ������ �� �̺�Ʈ ó��
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				// ���� �ʱ�ȭ�Ǿ� �������� �ʰ� �߰��ϴ� ���� -> append()
				ta.append(text + "\n");
				
				// �ؽ�Ʈ �ʵ��� ���� �����ֱ�
				tf.setText("");
				tf.requestFocus();
				
			}
		});
		
		
		
		
		frame.add(tf, "North");
		frame.add(ta, "Center");
		
		// ������ ũ�⸦ �������� ������ �������� �۰� ����
		frame.pack(); // -> ������ ũ�⸦ ������Ʈ ��ġ�� �ڵ����� ���߾ �������� ���� ��

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
