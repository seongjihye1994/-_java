package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.HotelController;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.hotelDetail.DetailList;

public class HotelPage extends JPanel {
	private HotelController hc = new HotelController();
	private Person loginUser;
	private ArrayList<Hotel> list = hc.selectList();
	

	public HotelPage(JFrame mf, Person loginUser) {
		this.loginUser = loginUser;
		this.setSize(1000, 600);
		this.setLayout(null);

		// 기본 좌측 패널에 검색 기능,버튼 올리기
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 340, 600);
		leftPanel.setBackground(Color.orange);
		add(leftPanel);
		leftPanel.setLayout(null);

		JLabel label2 = new JLabel("HOTEL");
		label2.setBounds(0, 10, 340, 84);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("나눔바른펜", Font.BOLD, 34));
		leftPanel.add(label2);

		JLabel label = new JLabel("키워드 검색");
		label.setBounds(111, 117, 100, 50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		leftPanel.add(label);

		JTextField textField = new JTextField(15);
		textField.setBounds(20, 177, 220, 43);
		leftPanel.add(textField);

		JButton btn = new JButton("확인");
		btn.setBounds(252, 177, 63, 43);
		btn.setFont(new Font("나눔바른펜", Font.BOLD, 15));
		leftPanel.add(btn);

		JButton res = new JButton("맛집");
		res.setBounds(27, 280, 282, 50);
		res.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		leftPanel.add(res);

		JButton fin = new JButton("금융");
		fin.setBounds(27, 380, 282, 50);
		fin.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		leftPanel.add(fin);

		JButton cur = new JButton("여가");
		cur.setBounds(27, 480, 282, 50);
		cur.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		leftPanel.add(cur);

		res.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new RestaurantPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);

			}

		});

		fin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new financePage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);

			}

		});

		cur.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);

			}

		});

		// 오른쪽 패널
		JPanel listPanel = new JPanel();
		listPanel.setBounds(340, 50, 660, 600);

		JPanel hotel = new JPanel();
		hotel.setLayout(new GridLayout(17, 1));
		JButton[] detail = new JButton[list.size()];

		for (int i = 0; i < list.size(); i++) {
			// 호텔 출력
			hotel.add(new JLabel(list.get(i).displayOnList()));

			// 호텔 리스트 옆 상세정보 버튼
			detail[i] = new JButton("상세정보");
			detail[i].setSize(30, 50);
			hotel.add(detail[i]);
			listPanel.add(hotel);

			// 첫번째 호텔 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			detail[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					mf.getContentPane().removeAll();
					mf.getContentPane().add(new DetailList(mf, index, loginUser));
					mf.repaint();
					mf.setVisible(true);

				}
			});
		}

			add(listPanel);

			// 오른쪽 패널 위에 패널 따로 만들고 아이콘 추가
			JPanel btnPanel = new JPanel();
			btnPanel.setLayout(null);
			btnPanel.setBounds(340, 0, 660, 50);
			add(btnPanel);

			Icon backBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
			JButton backBtn = new JButton(backBtnIcon);
			backBtn.setBounds(12, 4, 42, 42);
			btnPanel.add(backBtn);

			Icon homeBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
			JButton homeBtn = new JButton(homeBtnIcon);
			homeBtn.setBounds(584, 4, 40, 40);
			btnPanel.add(homeBtn);

			backBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new MainPage(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);

				}
			});
		
			homeBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new MainPage(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);

				}
			});
		

			// 검색 후 확인 버튼 -> 검색한 호텔 출력(change panel)
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String text = textField.getText();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getName().contains(text)) {
							mf.getContentPane().removeAll();
							mf.getContentPane().add(new DetailList(mf, i, loginUser));
							mf.repaint();
							mf.setVisible(true);
							return;
						} 
					}
					
					for(int i = 0; i < list.size(); i++) {
						if(!list.get(i).getName().contains(text)) {
							JOptionPane.showMessageDialog(null, "검색하신 호텔이 없습니다.");
							textField.setText("");
							return;
						}
					}
				}
			});
		}
	}