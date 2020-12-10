package com.kh.mini_Project.view;

import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.kh.mini_Project.model.Person;

public class culturePage extends Panel {
	
	private Person loginUser;
	
	
	public culturePage(JFrame mf, Person loginUser) {
		JButton culture = new JButton("여가시설");
		add(culture);
		
		JButton returnBtn = new JButton("돌아가기");
		returnBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}

		});

		this.add(returnBtn);

	}
}
