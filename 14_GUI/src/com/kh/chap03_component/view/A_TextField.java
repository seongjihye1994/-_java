package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_TextField {
	
	// ���� �Է� �޾Ƽ� �Է� ���� ���ڸ� ������ ��� �����ϱ�
	public void textFieldTest() {
		
		// 1. Frame ����
		JFrame frame = new JFrame("���� ����ϱ�"); // title
		frame.setSize(300, 130);
		
		// 2. Panel ����
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է� : ")); // �гο� �� ���� (JLabel : ���� �Է�)
		// ���۷��� ���� �ٷ� �����ϸ� ���Ŀ� ���ٸ� ������ ���� �ʰڴٴ� �ǹ� (���۷��� ������ ���� ������)
		
		// 3. �ؽ�Ʈ ���� ����
		JTextField text = new JTextField(15); // �÷� ������ 15
		panel.add(text);
		
		// ����� ����
		panel.add(new JLabel("������ �� : "));
		
		// ������ ��� ���� ��� textfield �̹Ƿ� ���� �Ұ��ϰ� ����
		JTextField result = new JTextField(15); // �÷� ������ 15
		result.setEditable(false); // ���� ���� �����̹Ƿ� ���� �� �� ���� ����
		panel.add(result);
		
		// 4. ��ư ����
		JButton btn = new JButton("ok");
		panel.add(btn);
		
		// ***************** �����Ӱ� ��� ���� *********************
		// btn�� Ŭ������ ��
		// text�� �ִ� ���� �о�ͼ� ���� ����� �� �� result�� �־��ִ� �̺�Ʈ ����
		// �͸� Ŭ������ ���� ActionListener�� ���� �� �޼ҵ带 �������̵��ؼ� �̺�Ʈ �߰�
		// ActionListener�� �������̽��̱� ������ ���� �޼ҵ带 ��������� ��
		btn.addActionListener(new ActionListener() {
			/* ActionEvent : ����ڰ� � ������ �� ��� �߻�, ��� ������Ʈ���� �߻������� ����.
			 * 1. ��ư�� �������� ��
			 * 2. ��Ʃ�� Ŭ������ ��
			 * 3. �ؽ�Ʈ �ʵ忡�� ����Ű�� ������ ��
			 */			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText()); // �ش� ������Ʈ�� �ؽ�Ʈ�� ���ڷ� �Ľ��ؼ� �о�� (Integer.parseInt(String))
				result.setText(value * value + ""); // ������ ������� result�� set �ɾ��� (�ڿ� + ""�� �ٿ��� ��Ʈ��Ÿ������ �ٲ��ָ� ��)
				
				// �ؽ�Ʈ ���ڷ� �ٽ� ��Ŀ��(Ŀ��) ��������
				text.requestFocus(); // ���� �ϰ� ������ �ؽ�Ʈ ���ھȿ� ��� Ŀ���� �����Ÿ��� ��
			}
		});
		
		
		// ������ ���� �г� ����
		frame.add(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
