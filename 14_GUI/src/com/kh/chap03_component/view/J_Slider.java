package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class J_Slider {
	
	public void sliderTest() {
		// 프레임 생성 및 크기 설정
		JFrame frame = new JFrame("슬라이더 테스트");
		frame.setSize(300, 300);
		
		// 패널 후 라벨 생성하여 패널에 올림
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요", JLabel.CENTER);
		panel1.add(label);
		
		// 패널 생성
		JPanel panel2 = new JPanel();
		// 슬라이더 생성
		JSlider slider = new JSlider(0, 30, 15); //최소값, 최대값, 기본값
		slider.setMajorTickSpacing(10); // 큰 눈금 간격
		slider.setMinorTickSpacing(1); // 작은 눈금 간격
		slider.setPaintTicks(true);	// 눈금 표시, 기본 값 false
		slider.setPaintLabels(true); // 값을 라벨로 표시, 기본 값 false
		
		// 슬라이더 패널에 올림
		panel2.add(slider);
		
		// 버튼 생성하여 패널에 올림
		JButton button = new JButton("전송");
		panel2.add(button);
		
		// 결과 패널 생성하여 라벨들을 패널에 올림
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("결과값 : ");
		resultPanel.add(text);
		JLabel result = new JLabel();
		resultPanel.add(result);
		
		// 버튼이 클릭 되었을 경우의 이벤트 감지
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 슬라이더가 가진 값을 결과 값을 표시할 label의 text로 설정
				result.setText(slider.getValue()+"");
			}
			
		});
		
		// 프레임에 3개의 패널 올림
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(resultPanel, "South");
		
		// 항상 필요한 구문
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
