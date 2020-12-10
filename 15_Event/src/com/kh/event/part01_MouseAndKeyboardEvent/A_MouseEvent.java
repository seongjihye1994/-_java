package com.kh.event.part01_MouseAndKeyboardEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. MouseEvent : ���콺�� Ŭ�� �� ��, ���� ��, �� ��, �ش� ��ü�� ��� �� ��, ���콺�� ���� ���� ���� ��Ȳ���� ����
// 2. MouseMotionEvent : ���콺�� ������ �� ���� �߻�

// �ش� ������ Ŭ�������� ������ ��� �޾� �޼ҵ� �������̵�
public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener { // �������̽��� ���߻�� ����
	
	public A_MouseEvent() {
		
		this.setTitle("Mouse Event");
		this.setSize(300, 200); // ����, ����
			
		JPanel panel = new JPanel();
		
		// �гο� ���콺 �̺�Ʈ ������ ����
		panel.addMouseListener(this); // -> A_MouseEvent���� MouseListener�� ��� �޾� �����Ͽ����Ƿ� this ����		
		panel.addMouseMotionListener(this);
		
		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	// �� ���α׷��� �����ϱ� ���� ���� �޼ҵ� ����
	public static void main(String[] args) {
		new A_MouseEvent();
	}
	
	// ------------------------------------------------
	
	// 1. MouseListener �������̽� �޼ҵ� �������̵�
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

	// 2. MouseMotionListener �������̽��� �޼ҵ� �������̵�
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
