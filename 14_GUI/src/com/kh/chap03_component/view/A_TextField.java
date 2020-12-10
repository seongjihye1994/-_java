package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_TextField {
	
	// 숫자 입력 받아서 입력 받은 숫자를 제곱한 결과 리턴하기
	public void textFieldTest() {
		
		// 1. Frame 생성
		JFrame frame = new JFrame("제곱 계산하기"); // title
		frame.setSize(300, 130);
		
		// 2. Panel 생성
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : ")); // 패널에 라벨 부착 (JLabel : 글자 입력)
		// 레퍼런스 없이 바로 생성하면 추후에 별다른 수정을 하지 않겠다는 의미 (레퍼런스 변수가 없기 때문에)
		
		// 3. 텍스트 상자 생성
		JTextField text = new JTextField(15); // 컬럼 사이즈 15
		panel.add(text);
		
		// 결과물 영역
		panel.add(new JLabel("제곱한 값 : "));
		
		// 제곱한 결과 값이 담길 textfield 이므로 수정 불가하게 설정
		JTextField result = new JTextField(15); // 컬럼 사이즈 15
		result.setEditable(false); // 값이 담기는 영역이므로 수정 할 수 없게 고정
		panel.add(result);
		
		// 4. 버튼 생성
		JButton btn = new JButton("ok");
		panel.add(btn);
		
		// ***************** 프레임과 기능 연결 *********************
		// btn을 클릭했을 때
		// text에 있는 값을 읽어와서 제곱 계산을 한 뒤 result에 넣어주는 이벤트 생성
		// 익명 클래스를 통해 ActionListener에 정의 된 메소드를 오버라이딩해서 이벤트 추가
		// ActionListener는 인터페이스이기 때문에 내부 메소드를 구현해줘야 함
		btn.addActionListener(new ActionListener() {
			/* ActionEvent : 사용자가 어떤 동작을 할 경우 발생, 모든 컴포넌트에서 발생하지는 않음.
			 * 1. 버튼이 눌러졌을 때
			 * 2. 메튜를 클릭했을 때
			 * 3. 텍스트 필드에서 엔터키를 눌렀을 때
			 */			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText()); // 해당 컴포넌트의 텍스트를 숫자로 파싱해서 읽어옴 (Integer.parseInt(String))
				result.setText(value * value + ""); // 제곱한 결과값을 result에 set 심어줌 (뒤에 + ""을 붙여서 스트링타입으로 바꿔주면 됨)
				
				// 텍스트 상자로 다시 포커스(커서) 가져가기
				text.requestFocus(); // 실행 하고 나서도 텍스트 상자안에 계속 커서가 깜빡거리게 함
			}
		});
		
		
		// 프레임 위에 패널 부착
		frame.add(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
