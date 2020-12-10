package com.kh.chap02_layout.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame {
	
	public F_PanelLayout() {
		super("PanelLayout");
		
		JLabel lb = new JLabel("이 름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		// 입력받는 칸
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		// 패널 한 개 생성
		JPanel pane1 = new JPanel();
		pane1.setSize(800, 500);
		
		// 패널의 레이아웃 기본 값은 flowlayout
		// 패널의 레이아웃을 설정하지 않으면 기본 flowlayout의 center 값을 가짐
		// 패널 위에 마음대로 배치하기 위해서는 패널에도 레이아웃을 지정해주어야 함
		pane1.setLayout(null);
		
		// 패널 위에 두개의 컴포넌트 올림
		pane1.add(lb);
		pane1.add(tf);
		
		// 화면에 보이기 위해서는 프레임 위에 패널을 올림
		this.add(pane1);
		
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	// 정리하면
	// 1. JFrame frame = new JFrame(); 이라는 도화지? 안에
	// frame.selLayout(); => 프레임 설정을 할 수 있음
	// 2. JPanel panel = new JPanel(); 패널을 깔고
	// panel.setLayout(); => 패널 설정을 할 수 있음
	// 3. JButton button = new JButton(); 그 위에 버튼을 깔고
	
	// 화면에 추가까지 해줘야 눈에 보임
	// panel.add(button)
	// frame.add(panel)

}
