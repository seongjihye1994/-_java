package com.kh.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// 프레임을 생성하는 방법 1
// javax.swing.JFrame 클래스를 상속 받아 생성자에서 프레임에 대한 설정 후
// 다른 클래스에서 호출하는 방식

public class JFrameView1 extends JFrame {
	
	// 기본 생성자 안에 프레임 기본 세팅 잡아주기
	public JFrameView1() {
		this.setLocation(300, 200); // 프레임 위치 설정 (가로, 세로)
		this.setSize(800, 500); // 프레임 픽셀 크기 (가로, 세로)
		
		// 프레임 위치와 크기를 한번에 설정
		this.setBounds(300, 200, 800, 500); // 위치 가로, 세로, 크기 가로, 세로
		
		// 프레임 상단에 이름 설정
		this.setTitle("MyFrame");
		
		// 프레임 상단에 로고 이미지 변경
		try {
			this.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프레임 사이즈 조정 : 기본 값으로 프레임 사이즈 조정이 활성화 되어 있음
		this.setResizable(false); // true는 기본값으로 사이즈 조정이 가능함
		
		// -------------- 아래 두가지는 꼭 마지막에 구현해야 함 -------------------
		// 실행 후 x를 눌러서 창을 닫더라도 프로세스는 여전히 실행 중임
		// 창을 닫았을 때 프로세스를 정상 종료 시키기 위해서는
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setVisible 메소드를 마지막에 처리하여 보여지게끔 함
		this.setVisible(true);
	}
	
	

}
