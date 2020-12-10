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
		
		JButton editUserInfobtn = new JButton("1. 회원 정보 수정");
		JButton showKeepListbtn = new JButton("2. 즐겨찾기");
		JButton LogOutbtn = new JButton("3. 로그아웃 하기");
		
		
		editUserInfobtn.addActionListener(new ActionListener() {
			
			JTextField checkPw = null;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 정보 수정을 위해 pw먼저 확인하고 일치하면 수정화면으로
				checkPw = new JTextField("비밀번호를 입력하세요.");
				
				person.getPw();
				panel.add(checkPw);
			}
		});
		
		
		showKeepListbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 클릭시 즐겨찾기 리스트 출력
				for(Facility f : person.getFavoriteList()) {
					System.out.println(f.toString());
				}
				
			}
		});
		
		LogOutbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그아웃 후 로그인 페이지로 이동
				
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
