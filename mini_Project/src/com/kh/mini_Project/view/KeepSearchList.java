package com.kh.mini_Project.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Hotel;

public class KeepSearchList extends JPanel {
	
	public KeepSearchList(JFrame mf,ArrayList<Facility> list) {
		this.setLayout(new BorderLayout());
		
		JPanel listPanel = new JPanel();
		listPanel.setSize(300,400);
		
		for (int i = 0; i < list.size(); i++) {
			Facility f = list.get(i);
			JTextField result = new JTextField(30);
			result.setEditable(false);
			result.setText(f.toString());
			listPanel.add(result);
			System.out.println(f.toString());
		}
		this.add(listPanel,"Center");
		
		
	}


}
