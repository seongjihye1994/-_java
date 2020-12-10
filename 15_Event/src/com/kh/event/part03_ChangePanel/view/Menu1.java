package com.kh.event.part03_ChangePanel.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.event.part03_ChangePanel.controller.MemberController;
import com.kh.event.part03_ChangePanel.model.vo.Member;

public class Menu1 extends JPanel {
	
	private MemberController mc = new MemberController();
	
	public Menu1(JFrame mf) {
		this.setLayout(new BorderLayout()); // ���巹�̾ƿ� ��Ÿ�Ϸ� ����
		
		JLabel title = new JLabel("MENU1");
		title.setHorizontalAlignment(JLabel.CENTER); // ���� ���Ľ� �����
		this.add(title, "North");
		
		
		// ���� ������ �ִ� MemberList�� �����ֱ�
		JPanel memberPanel = new JPanel();
		memberPanel.setLayout(new GridLayout(5, 1));
		ArrayList<Member> list = mc.getMemberList();
		
		for (Member m : list) {			
			JPanel mem = new JPanel(); // ��� 1���� ������ �ö� �г��� �Ź� ����
			mem.add(new JLabel(m.getName()));
			mem.add(new JLabel(m.getAge() + "")); // "" �� String���� �ٲٱ� ����
			Image icon = new ImageIcon(m.getImagePath()).getImage().getScaledInstance(150,  150,  0); // �ش� ��θ� �������� �� user�� ���� �̹��� ������
			mem.add(new JLabel(new ImageIcon(icon))); // �� ���� �� �̹����� �ø��� �߰�
			memberPanel.add(mem);
		}
		
		this.add(memberPanel, "Center");
		
	}
	
	
	

}
