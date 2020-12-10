package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class I_Spinner {
	
	public void spinnerTest() {
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		
		JPanel panel = new JPanel();
		
		// 1. SpinnerListModel : ���ڿ�
		String[] items = {"�Ҽ�", "����", "��������", "���"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		
		panel.add(spinner1);
		
		// 2. SpinnerNumberModel : ����
		// ������, �ּҰ�, �ִ밪, ������
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
		JSpinner spinner2 = new JSpinner(numberModel);
		
		panel.add(spinner2);
		
		// 2. SpinnerDateModel : ��¥
		Calendar calendar = Calendar.getInstance(); // ���� ��¥
		Date today = calendar.getTime(); // ���� ���� Date Ÿ�� // ���� ��¥
		
		calendar.add(Calendar.YEAR, -50); // ���� ������ 50�� ������ ��¥�� ���� ��¥��
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100); // �̹� Ķ������ 50�� ������ �� �ֱ� ������ 50�� �ķ� �����Ϸ��� 100���� ����
		Date end = calendar.getTime();
		
		// ���� ��¥, ���� ��¥, �� ��¥, Ķ������ �����ϴ� ��� �� �ϳ� ����
		// ����� ���� ���� -> getPreviousValue(), getNextValue() ���� ȣ�� ���� �� �������� ���
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner spinner3 = new JSpinner(dateModel);    // ���ó�¥�� ��������, ����, ��, �⸸ŭ ����
		
		// ���ǳ��� ���� ����
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		
		panel.add(spinner3);
		
		// ��ư ���� �� �гο� �ø���
		JButton button = new JButton("����"); 
		panel.add(button);
		
		// ��� ���� ǥ���� �гΰ� �� �����
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		// ��ư Ŭ���� �̺�Ʈ
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ǳʰ� ���� ������ �ִ� ���� �ƴ� ���
				// spinner.getValue();
				String result = "";
				result = spinner1.getValue() + " ," +  spinner2.getValue() + " ," + spinner3.getValue();
				text.setText(result);
			}
		});	
		
		frame.add(panel, "North");
		frame.add(resultPanel, "Center");
		// ��ư�� �̹� ���� ������� panel �� �߰��߱� ������ frame�� �� �߰��� �ʿ䰡 ����
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
