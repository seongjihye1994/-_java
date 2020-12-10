package com.kh.mini_Project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;

public class View {
	
	Person person = new Person();
	
	public void ShowMyPage() {
		
		JFrame frame = new JFrame("MyPage");
		frame.setSize(500, 700);
		
		JPanel panel = new JPanel();
		
		JLabel MyPageLabel = new JLabel("**** MyPage ****");
		
		JButton editUserInfobtn = new JButton("1. ȸ�� ���� ����");
		JButton showKeepListbtn = new JButton("2. ���ã��");
		JButton LogOutbtn = new JButton("3. �α׾ƿ� �ϱ�");
		
		
		editUserInfobtn.addActionListener(new ActionListener() {
			
			JTextField checkPw = null;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ���� ������ ���� pw���� Ȯ���ϰ� ��ġ�ϸ� ����ȭ������
				checkPw = new JTextField("��й�ȣ�� �Է��ϼ���.");
				
				person.getPw();
				panel.add(checkPw);
			}
		});
		
		
		showKeepListbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Ŭ���� ���ã�� ����Ʈ ���
				for(Facility f : person.getFavoriteList()) {
					System.out.println(f.toString());
				}
				
			}
		});
		
		LogOutbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �α׾ƿ� �� �α��� �������� �̵�
				
			}
		});
	
		panel.add(MyPageLabel);
		
		panel.add(editUserInfobtn);
		panel.add(showKeepListbtn);
		
		frame.add(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
