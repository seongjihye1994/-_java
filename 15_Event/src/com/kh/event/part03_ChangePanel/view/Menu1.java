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
		this.setLayout(new BorderLayout()); // 보드레이아웃 스타일로 지정
		
		JLabel title = new JLabel("MENU1");
		title.setHorizontalAlignment(JLabel.CENTER); // 수평 정렬시 가운데로
		this.add(title, "North");
		
		
		// 현재 가지고 있는 MemberList를 보여주기
		JPanel memberPanel = new JPanel();
		memberPanel.setLayout(new GridLayout(5, 1));
		ArrayList<Member> list = mc.getMemberList();
		
		for (Member m : list) {			
			JPanel mem = new JPanel(); // 멤버 1명의 정보가 올라갈 패널을 매번 생성
			mem.add(new JLabel(m.getName()));
			mem.add(new JLabel(m.getAge() + "")); // "" 은 String으로 바꾸기 위함
			Image icon = new ImageIcon(m.getImagePath()).getImage().getScaledInstance(150,  150,  0); // 해당 경로를 기준으로 각 user에 대한 이미지 가져옴
			mem.add(new JLabel(new ImageIcon(icon))); // 새 라벨이 새 이미지를 올리고 추가
			memberPanel.add(mem);
		}
		
		this.add(memberPanel, "Center");
		
	}
	
	
	

}
