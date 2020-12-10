package com.kh.event.part01_MouseAndKeyboardEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. MouseEvent : 마우스가 클릭 될 때, 눌릴 떄, 뗄 때, 해당 주체가 들어 갈 때, 마우스가 빠져 나올 때의 상황에서 동작
// 2. MouseMotionEvent : 마우스가 동작할 때 마다 발생

// 해당 프레임 클레스에서 리스너 상속 받아 메소드 오버라이딩
public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener { // 인터페이스는 다중상속 가능
	
	public A_MouseEvent() {
		
		this.setTitle("Mouse Event");
		this.setSize(300, 200); // 가로, 세로
			
		JPanel panel = new JPanel();
		
		// 패널에 마우스 이벤트 감지기 부착
		panel.addMouseListener(this); // -> A_MouseEvent에서 MouseListener를 상속 받아 구현하였으므로 this 전달		
		panel.addMouseMotionListener(this);
		
		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	// 이 프로그램을 실행하기 위한 실행 메소드 정의
	public static void main(String[] args) {
		new A_MouseEvent();
	}
	
	// ------------------------------------------------
	
	// 1. MouseListener 인터페이스 메소드 오버라이딩
	@Override
	public void mouseClicked(MouseEvent e) {
		this.display("Mouse Clicked : ", e);
		
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		this.display("Mouse Pressed : ", e);
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.display("Mouse Released : ", e);
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.display("Mouse Entered : ", e);
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	
	// ---------------------------------------------------

	// 2. MouseMotionListener 인터페이스의 메소드 오버라이딩
	@Override
	public void mouseDragged(MouseEvent e) {
		this.display("Mouse Dragged : ", e);
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.display("Mouse Moved : ", e);
		
		
	}
	
	// ---------------------------------------------------
	
	
	private void display(String string, MouseEvent e) {
		System.out.println(string + "X = " + e.getX() + " Y = " + e.getY());
		
	}
	

}
