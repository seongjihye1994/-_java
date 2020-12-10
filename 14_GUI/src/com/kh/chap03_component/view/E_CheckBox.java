package com.kh.chap03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBox {
	public void CheckBoxTest() {
		JFrame frame = new JFrame();
		
		// 배열 선언하여 여러 개의 체크 박스를 생성함
		String[] fruits = {"apple", "orange", "banana"};
		JCheckBox[] buttons = new JCheckBox[3];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		// 여러 개의 체크박스를 반복문으로 사용하여 부착
		JPanel checkPanel = new JPanel();
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}

		// 결과 영역
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("선택한 과일이 없습니다.");
		resultPanel.add(text);
		
		// 여러 개의 이벤트도 동시에 반복문을 통해 연결 가능
		for (int i = 0; i < buttons.length; i++) {
			// 항목이 선택 또는 해제 되었음을 나타내는 ItemEvent의 감지기
			buttons[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int cnt = 0;
					// 체크가 되어있는 체크 박스를 모두 확인하여
					// 문자열을 새로 생성하고 라벨에 결과를 부착함
					for (int i = 0; i < buttons.length; i++) {
						// 체크 된 상태이면 true
						if (buttons[i].isSelected()) {
							result += buttons[i].getText() + " ";
							cnt++;
						}
					} if (cnt == 0) {
						text.setText("선택한 과일이 없습니다.");
					} else {
						text.setText(result);
					}
					
				}
			}); {
				
			}
		}
		
		
		// 프레임에 패널 부착
		frame.add(checkPanel, "North");
		frame.add(resultPanel, "Center");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
