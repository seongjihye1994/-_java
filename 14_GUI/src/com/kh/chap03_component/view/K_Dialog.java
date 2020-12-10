package com.kh.chap03_component.view;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class K_Dialog {
	
	public void dialogTest() {
		// ������ ����
		JFrame frame = new JFrame("dialogTest");
		
		// �г� �����Ͽ� ��ư �ø���
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Dialog");
		panel.add(button1);
		
		// ���̾�α� ���� �� �־� ����
		Dialog dialog = new Dialog(frame, "���ο� â �̸�"); 
		dialog.setBounds(200, 300, 300, 300);
		
		// ��ư�� Ŭ������ �� ���ô��̾�α� ���̰� �ϱ�
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
			
		});
		
		// dialog�� �ݱ� ��ư �����Ͽ� �ø�
		JButton button2 = new JButton("close");
		dialog.add(button2);
		
		//�ݱ� ��ư ������ ���̾�α� ������
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
				
			}
			
		});
		
		// �гο� ��ư �ϳ� �� �����Ͽ� �ø�
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		
		// �Է� ��ȭ���� ����
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. �Է� ���̾�α�
				// String result = JOptionPane.showInputDialog("������ �Է��ϼ���");
				// System.out.println(result);
				// ��� ��ư�̳� �Է� ���� ������ null ����
				
				// 2. Ȯ�� ���̾�α�
				//											���̾�α� �޼��� Ÿ��Ʋ  �ɼ� ����     
				// JOptionPane.showConfirmDialog(parentComponent, message, title, optionType)
				//							���̾�αװ� ��µǴ� ������ ���� ����(ex frame), null�̸� ȭ�� �߾ӿ�
				// int result = JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â", JOptionPane.YES_NO_OPTION);
				// int result = JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â", JOptionPane.YES_NO_CANCEL_OPTION);
				// System.out.println(result);
				
				// 3. �޼��� ���̾�α�
				JOptionPane.showMessageDialog(button3, "�����մϴ�.", "danger", JOptionPane.ERROR_MESSAGE);
//				JOptionPane.showMessageDialog(null, "�����մϴ�.", "danger", JOptionPane.INFORMATION_MESSAGE);
//				JOptionPane.showMessageDialog(null, "�����մϴ�.", "danger", JOptionPane.PLAIN_MESSAGE);
//				JOptionPane.showMessageDialog(null, "�����մϴ�.", "danger", JOptionPane.QUESTION_MESSAGE);
//				JOptionPane.showMessageDialog(null, "�����մϴ�.", "danger", JOptionPane.WARNING_MESSAGE);
			}
			
		});
		
		// �г��� �����ӿ� �ø��� ������Ʈ ���� ũ�⿡ ���߾� pack
		frame.add(panel);
		frame.pack();
		
		// �׻� �ʿ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
