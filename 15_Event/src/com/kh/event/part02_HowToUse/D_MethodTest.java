package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Handling) 방법 4
// 해당 프레임 클래스에서 리스너 상속 받아 메소드 오버라이딩
public class D_MethodTest extends JFrame implements ActionListener {
	
	// 전역변수로 선언
		private JButton btn;
		private JLabel label;
			
		public D_MethodTest() {
			
			this.setTitle("내부 객체 참조 클래스 예제");
			this.setSize(300, 200);
			
			JPanel panel = new JPanel();
			btn = new JButton("버튼을 눌러보세요");
			label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
			
			btn.addActionListener(this); // 아래 따로 구현한 클래스를 참조로 넣음
			
			panel.add(btn);
			panel.add(label);
			
			this.add(panel); // 프레임(JFrame을 상속받은 자기자신)에 패널 부착
			
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn) {
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
			
			// --- 발생지 확인을 위한 출력 ---
			System.out.println(btn);
			System.out.println(e);
			System.out.println(e.getSource());
		}
		
		public static void main(String[] args) {
			new D_MethodTest();
		}

}
