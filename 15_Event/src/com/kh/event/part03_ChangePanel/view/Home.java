package com.kh.event.part03_ChangePanel.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �ڹ� GUI �̺�Ʈ ó��(Event Handling) ��� 4
//�ش� ������ Ŭ�������� ������ ��� �޾� �޼ҵ� �������̵�
public class Home extends JPanel implements ActionListener {
	
	private JFrame mainFrame; // ��𼭵� ����ϱ� ���� �������� �ʵ�� ����
	private JButton[] btn = new JButton[5]; // ��ư ������ �������� �迭����
	
	public Home(JFrame mf) {
		
		mainFrame = mf;
		
		JLabel main = new JLabel("HOME");
		main.setBounds(575, 0, 100, 30);
		this.add(main);
		
		JPanel menuPalen = new JPanel();
		menuPalen.setBounds(350, 50, 500, 50);
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("MENU" + (i + 1)); // MENU 1, MENU 2, .....
			// �� ��ȣ�� Ŭ�� �� �׿� �´� ȭ������ �̵��ϴ� �̺�Ʈ �ۼ�
			btn[i].addActionListener(this);
			menuPalen.add(btn[i]);
		}
		
		this.add(menuPalen); // �ڱ��ڽ� (== �г�)���ٰ� �޴��г� �ø�
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel changePanel = null;
		if (e.getSource() instanceof JButton) { // JButton ��ü���� �ٸ� ��ü���� Ȯ���ϰ�
			JButton btn = (JButton) e.getSource(); // JButton ��ü�� ������ JButton���� �ٿ�ĳ����
			
			switch (btn.getText()) { // �� �޴� ��ư�� ���� �ٸ� �������� ȣ����
			case "MENU1" : changePanel = new Menu1(mainFrame); break;
			/*case "MENU2" : changePanel = new Menu2(); break;
			case "MENU3" : changePanel = new Menu3(); break;
			case "MENU4" : changePanel = new Menu4(); break;
			case "MENU5" : changePanel = new Menu5(); break;*/
			}
			
			mainFrame.getContentPane().removeAll();
			mainFrame.getContentPane().add(changePanel);
			mainFrame.repaint();
			mainFrame.setVisible(true);
			
		}
		
	}

}
