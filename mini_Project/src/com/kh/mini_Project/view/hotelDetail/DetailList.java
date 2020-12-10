package com.kh.mini_Project.view.hotelDetail;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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

import com.kh.mini_Project.controller.HotelController;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.HotelPage;
import com.kh.mini_Project.view.MainPage;

public class DetailList extends JPanel {
	private HotelController hc = new HotelController();
	private JFrame mainFrame;
	private ArrayList<Hotel> list = hc.selectList();
	private Person loginUser;

	public DetailList(JFrame mf, int index, Person loginUser) {
		this.loginUser = loginUser;
		mainFrame = mf;
		this.setSize(1000, 600);
		this.setLayout(null);

		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 340, 600);
		leftPanel.setBackground(Color.orange);
		add(leftPanel);
		
		// 즐겨찾기 버튼
		JButton favorite = new JButton("즐겨찾기 추가");
		favorite.setBounds(20,200,300,50);
		leftPanel.add(favorite);
		
		favorite.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Hotel즐겨찾기 -> Person 객체에 추가
				loginUser.getFavoriteHotel().add(list.get(index));
				
				mf.setVisible(true);
			}
		});
		
		// 리뷰 버튼
		JButton review = new JButton("리뷰 보기");
		review.setBounds(20,300,300,50);
		leftPanel.add(review);
		
		review.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new ReviewPage(mf,index, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		

		JLabel label = new JLabel(list.get(index).getName() + " 상세 정보");
		label.setFont(new Font("나눔바른펜", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 84, 340, 16);
		leftPanel.add(label);

		// 오른쪽 패널 위에 패널 따로 만들고 아이콘 추가
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
				mf.getContentPane().add(new HotelPage(mf, loginUser));
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
		
		JLabel priceL = new JLabel("₩ "+list.get(index).getPrice());
		priceL.setHorizontalAlignment(SwingConstants.LEFT);
		priceL.setBounds(199, 19, 248, 16);
		detailPanel.add(priceL);
		
		JLabel addressL = new JLabel("주소 : "+list.get(index).getAddress());
		addressL.setHorizontalAlignment(SwingConstants.LEFT);
		addressL.setBounds(50, 47, 616, 16);
		detailPanel.add(addressL);
		
		JLabel gradeL = new JLabel(list.get(index).getGrade());
		gradeL.setBounds(50, 19, 137, 16);
		detailPanel.add(gradeL);
		
		JLabel roomL = new JLabel("이용가능한 객실수 : "+list.get(index).getUseableRoom());
		roomL.setHorizontalAlignment(SwingConstants.LEFT);
		roomL.setBounds(50, 75, 660, 16);
		detailPanel.add(roomL);
		
		JLabel callL = new JLabel(list.get(index).getCall());
		callL.setBounds(50, 103, 660, 16);
		detailPanel.add(callL);
		
		JLabel timeL = new JLabel(list.get(index).getCheckTime());
		timeL.setHorizontalAlignment(SwingConstants.LEFT);
		timeL.setBounds(50, 131, 660, 16);
		detailPanel.add(timeL);
		
		JLabel parkingL = new JLabel(list.get(index).getParking());
		parkingL.setBounds(50, 159, 660, 16);
		detailPanel.add(parkingL);
		
		JPanel mapPanel = new JPanel();
		mapPanel.setBounds(340, 241, 660, 359);
		panel.add(mapPanel);
		mapPanel.setLayout(null);
		
		JLabel map = new JLabel("[상세 위치]");
		map.setBounds(50, 0, 61, 16);
		mapPanel.add(map);
		
		JLabel mapLabel = new JLabel();
		ImageIcon icon = new ImageIcon(DetailList.class.getResource("/image/hotelMap/1.png"));
		Image img = icon.getImage();
		Image changeImage = img.getScaledInstance(200,  200,  Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		mapLabel.setIcon(changeIcon);
		
		mapLabel.setBounds(50, 28, 591, 300);
		mapPanel.add(mapLabel);
		
		
	
		
	}

}