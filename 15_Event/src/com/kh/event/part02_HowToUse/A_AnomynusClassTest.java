package com.kh.event.part02_HowToUse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리 (Event Handling) 방법 1
// 해당 컴포넌트에 리스너 추가하면서 무명(익명) 클래스 구현
public class A_AnomynusClassTest {
	
	private static int count = 0; // 마우스 클릭 횟수
	
	public static void main(String[] args) {
		JFrame mf = new JFrame("익명클래스 예제");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn) { // 이벤트가 발생한 발생지거 버튼이냐?
					label.setText("드디어 버튼이 눌러졌습니다.");
				}
				// --- 발생지 확인을 위한 출력 ---
				System.out.println(btn);
				System.out.println(e);
				System.out.println(e.getSource());
			}
		});
		
		// 마우스 이벤트
		/* 이벤트 발생 주체.addXXXListener(XXXListener / XXXAdapter 생성);
		 * 
		 * XXXLister -> 인터페이스 -> 추상 메소드만을 가지고 있음
		 * XXXAdapter -> 추상클래스 -> Listener를 구현한 추상 클래스로 일반 메소드와 추상 메소드가 둘 다 존재할 수 있음
		 * 
		 * Listener 인터페이스를 아무 내용 없이 구현해 놓은 클래스 -> Adapter 클래스
		 * 
		 * 인터페이스와 추상클래스의 차이?
		 * 인터페이스는 메소드를 무조건 강제로 다 오버라이딩 해야함
		 * 추상클래스는 일반 메소드와 추상 메소드가 둘 다 있는데, 이 떄 추상 메소드는 오버라이딩 해야함
		*/		
		btn.addMouseListener(new MouseAdapter() {
			// Listener가 아닌 Adapter를 사용하면 오버라이딩 하고 싶은 메소드만 골라서 작성(강제 오버라이딩 x)
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int num = count % 7;
				switch (num) {
				case 0 :
					btn.setBackground(Color.red); break;
				case 1 :
					btn.setBackground(Color.orange); break;
				case 2 :
					btn.setBackground(Color.yellow); break;
				case 3 :
					btn.setBackground(Color.green); break;
				case 4 :
					btn.setBackground(Color.blue); break;
				case 5 :
					btn.setBackground(new Color (0, 0, 165)); break; // rgb 색상
				case 6 :
					btn.setBackground(new Color(149, 54, 255)); break; // rgb 색상
				} 
				count++; // 클릭 할 때마다 카운트
			}
		
		});

		panel.add(btn);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
