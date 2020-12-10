package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Handling) 방법 2
// 별도의 외부 클래스로 작성하고 참조해서 사용
public class B_OtherClassTest extends JFrame {
	
	// 전역변수로 선언
	private JButton btn;
	private JLabel label;
	
	public B_OtherClassTest() {
		
		this.setTitle("외부 객체 참조 클래스 예제");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		btn.addActionListener(new MyEvent(btn, label)); // 아래 따로 구현한 클래스를 참조로 넣음
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel); // 프레임(JFrame을 상속받은 자기자신)에 패널 부착
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new B_OtherClassTest();
	}

}


class MyEvent implements ActionListener {
	
	private JButton btn;
	private JLabel label;
	
	// 생성자
	public MyEvent(JButton btn, JLabel label) {
		this.btn = btn;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) { // 발생지가 버튼인지 확인
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
		// --- 발생지 확인을 위한 출력 ---
		System.out.println(btn);
		System.out.println(e);
		System.out.println(e.getSource());
	}
	
}
