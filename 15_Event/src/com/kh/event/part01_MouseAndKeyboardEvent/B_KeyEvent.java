package com.kh.event.part01_MouseAndKeyboardEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

// KeyEvent : 키를 누르면 키보드 포커스를 가지고 있는 객체에서 발생
public class B_KeyEvent extends JFrame implements KeyListener {
	
	public B_KeyEvent() {
		
		this.setTitle("키보드 이벤 트");
		this.setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		
		this.add(tf);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new B_KeyEvent();
	}

	// ------------------------------------------------------------
	
	// KeyListener 인터페이스에 대한 메소드 오버라이딩
	@Override
	public void keyTyped(KeyEvent e) {
		this.display("Key Typed : ", e);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.display("Key Pressed : ", e);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.display("Key Released : ", e);
		
		
	}
	
	// -------------------------------------------------------------

	private void display(String string, KeyEvent e) {
		// 눌러진 키에 해당하는 문자값
		char c = e.getKeyChar();
		// 눌러진 키에 대한 정수형인 키 코드 값
		int keyCode = e.getKeyCode();
		
		// Alt, Ctrl, Shift 판별
		String modifies = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		
		System.out.println(string + " " + c + " " + keyCode + " " + modifies);
		
	}

}
