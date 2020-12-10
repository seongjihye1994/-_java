package com.kh.chap02_layout.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame {
	
	public F_PanelLayout() {
		super("PanelLayout");
		
		JLabel lb = new JLabel("�� �� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		// �Է¹޴� ĭ
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		// �г� �� �� ����
		JPanel pane1 = new JPanel();
		pane1.setSize(800, 500);
		
		// �г��� ���̾ƿ� �⺻ ���� flowlayout
		// �г��� ���̾ƿ��� �������� ������ �⺻ flowlayout�� center ���� ����
		// �г� ���� ������� ��ġ�ϱ� ���ؼ��� �гο��� ���̾ƿ��� �������־�� ��
		pane1.setLayout(null);
		
		// �г� ���� �ΰ��� ������Ʈ �ø�
		pane1.add(lb);
		pane1.add(tf);
		
		// ȭ�鿡 ���̱� ���ؼ��� ������ ���� �г��� �ø�
		this.add(pane1);
		
		this.setBounds(300, 200, 800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	// �����ϸ�
	// 1. JFrame frame = new JFrame(); �̶�� ��ȭ��? �ȿ�
	// frame.selLayout(); => ������ ������ �� �� ����
	// 2. JPanel panel = new JPanel(); �г��� ���
	// panel.setLayout(); => �г� ������ �� �� ����
	// 3. JButton button = new JButton(); �� ���� ��ư�� ���
	
	// ȭ�鿡 �߰����� ����� ���� ����
	// panel.add(button)
	// frame.add(panel)

}
