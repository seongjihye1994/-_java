package com.kh.event.part03_ChangePanel.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Handling) 방법 4
//해당 프레임 클래스에서 리스너 상속 받아 메소드 오버라이딩
public class Home extends JPanel implements ActionListener {
	
	private JFrame mainFrame; // 어디서든 사용하기 위해 프레임을 필드로 선언
	private JButton[] btn = new JButton[5]; // 버튼 여러개 쓰기위해 배열선언
	
	public Home(JFrame mf) {
		
		mainFrame = mf;
		
		JLabel main = new JLabel("HOME");
		main.setBounds(575, 0, 100, 30);
		this.add(main);
		
		JPanel menuPalen = new JPanel();
		menuPalen.setBounds(350, 50, 500, 50);
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("MENU" + (i + 1)); // MENU 1, MENU 2, .....
			// 각 번호를 클릭 시 그에 맞는 화면으로 이동하는 이벤트 작성
			btn[i].addActionListener(this);
			menuPalen.add(btn[i]);
		}
		
		this.add(menuPalen); // 자기자신 (== 패널)에다가 메뉴패널 올림
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel changePanel = null;
		if (e.getSource() instanceof JButton) { // JButton 객체인지 다른 객체인지 확인하고
			JButton btn = (JButton) e.getSource(); // JButton 객체가 맞으면 JButton으로 다운캐스팅
			
			switch (btn.getText()) { // 각 메뉴 버튼에 따른 다른 페이지를 호출함
			case "MENU1" : changePanel = new Menu1(mainFrame); break;
			/*case "MENU2" : changePanel = new Menu2(); break;
			case "MENU3" : changePanel = new Menu3(); break;
			case "MENU4" : changePanel = new Menu4(); break;
			case "MENU5" : changePanel = new Menu5(); break;*/
			}
			
			mainFrame.getContentPane().removeAll();
			mainFrame.getContentPane().add(changePanel);
			mainFrame.repaint();
			mainFrame.setVisible(true);
			
		}
		
	}

}
