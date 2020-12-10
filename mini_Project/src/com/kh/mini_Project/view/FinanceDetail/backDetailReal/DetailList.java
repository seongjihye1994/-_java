package com.kh.mini_Project.view.FinanceDetail.backDetailReal;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.FinancialController;
import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.MainPage;
import com.kh.mini_Project.view.financePage;

public class DetailList extends JPanel {
	private FinancialController fc = new FinancialController();
	private JFrame mainFrame;
	private ArrayList<Bank> list = fc.BankListReader();

	public DetailList(JFrame mf, int index, Person loginUser) {
		mainFrame = mf;
		this.setSize(1000, 600);
		this.setLayout(null);

		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 340, 600);
		leftPanel.setBackground(Color.orange);
		add(leftPanel);
		
		JButton favorite = new JButton("즐겨찾기 추가");
		favorite.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		favorite.setBounds(20,200,300,50);
		leftPanel.add(favorite);
		
		favorite.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Bank즐겨찾기 -> Person 객체에 추가
				loginUser.getFavoriteBank().add(list.get(index));
				System.out.println(loginUser.getFavoriteBank());
				
				mf.setVisible(true);
			}
		});

		JLabel label = new JLabel(list.get(index).displayOnList());
		label.setFont(new Font("나눔바른펜", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 84, 340, 16);
		leftPanel.add(label);

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setBounds(340, 0, 660, 50);
		add(btnPanel);

		Icon backBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		btnPanel.add(backBtn);

		Icon homeBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(604, 6, 40, 40);
		btnPanel.add(homeBtn);

		backBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new financePage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		homeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 600);
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.setLayout(null);
		
		JPanel detailPanel = new JPanel();
		detailPanel.setBounds(340, 50, 660, 191);
		panel.add(detailPanel);
		detailPanel.setLayout(null);
		
		JLabel nameL = new JLabel(list.get(index).getName());
		nameL.setHorizontalAlignment(SwingConstants.LEFT);
		nameL.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		nameL.setBounds(50, 21, 248, 16);
		detailPanel.add(nameL);
		
		JLabel phoneL = new JLabel(list.get(index).getPhone());
		phoneL.setHorizontalAlignment(SwingConstants.LEFT);
		phoneL.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		phoneL.setBounds(50, 47, 616, 16);
		detailPanel.add(phoneL);
		
		JLabel addressL = new JLabel(list.get(index).getAddress());
		addressL.setBounds(50, 73, 428, 16);
		addressL.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		detailPanel.add(addressL);
		
		JPanel mapPanel = new JPanel();
		mapPanel.setBounds(340, 241, 660, 359);
		panel.add(mapPanel);
		mapPanel.setLayout(null);
		
		JLabel map = new JLabel("오시는 길");
		map.setBounds(50, 0, 61, 16);
		map.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
		mapPanel.add(map);
		
		JLabel map2 = new JLabel();
	      if(list.get(index)==list.get(0)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/1.png")));
	      } else if (list.get(index)==list.get(1)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/2.png")));
	      } else if (list.get(index)==list.get(2)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/3.png")));
	      } else if (list.get(index)==list.get(3)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/4.png")));
	      } else if (list.get(index)==list.get(4)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/5.png")));
	      } else if (list.get(index)==list.get(5)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/6.png")));
	      } else if (list.get(index)==list.get(6)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/7.png")));
	      } else if (list.get(index)==list.get(7)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/8.png")));
	      } else if (list.get(index)==list.get(8)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/9.png")));
	      } else if (list.get(index)==list.get(9)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/91.png")));
	      } else if (list.get(index)==list.get(10)) {
	         map2.setIcon(new ImageIcon(DetailList.class.getResource("/image/bankMap/92.png")));
	      }
	      map2.setBounds(50, 30, 400, 300);
	      mapPanel.add(map2);
	}
}

