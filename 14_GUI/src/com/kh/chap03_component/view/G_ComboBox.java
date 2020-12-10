package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G_ComboBox {
	public void comboBoxTest() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		
		// 동물 이름과 이미지 파일명을 같게 만들어 둠
		String[] animals = {"dog", "cat", "tiger"};
		
		// 콤보 박스(드롭 다운이 되는 선택 상자) 생성 시 문자열 배열을 넣어 생성
		JComboBox animalList = new JComboBox(animals);
		
		// 처음에 선택 되어 있는 값을 지정 -> 기본 선택은 인덱스 0
		animalList.setSelectedIndex(1);
		
		// 이미지를 표현할 라벨 생성
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				// 콤보 박스 리스트 중 어떤 것이 클릭 되었는지 이벤트 객체 안에 정보가 있음
				// e.getSource() -> 이벤트가 일어난 대상에 대해 get
				JComboBox cb = (JComboBox) e.getSource();
				// 선택 된 메뉴의 텍스트를 가지고 옴
				String name = (String) cb.getSelectedItem();
				
				// 선택 된 이름에 해당하는 사진을 사이즈 조정하여 라벨에 올림
				Image img = new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150,  150,  0);
				label.setIcon(new ImageIcon(img));
			}
		});
		
		// 가운데 기준으로 수평 정렬
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
