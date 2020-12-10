package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.HotelController;
import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.BookAndLibrary;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.HobbyAndHealth;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Movie;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.model.Restaurant;

public class KeepListView extends JPanel { // 마이페이지에서 즐겨찾기 버튼을 누르면 오른쪽 패널에서 즐겨찾기 리스트를 출력하는 패널 // 검색 + 카테고리 버튼 4개가 필요한가?
	private HotelController hc = new HotelController();
	private Person loginUser;

	public KeepListView(JFrame mf, Person loginUser) {
		this.setSize(1000,600);
		this.setLayout(null);
		
		// 기본 좌측 패널에 검색 기능 올리기
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 419, 600);
		leftPanel.setBackground(SystemColor.activeCaption);
		add(leftPanel);
			
		JLabel label2 = new JLabel("       " + loginUser.getName() + "님 환영합니다!");
		label2.setFont(new Font("나눔바른펜", Font.BOLD, 38));
		label2.setBounds(0,22,419,112);
		leftPanel.add(label2);
		
		JLabel lblEx = new JLabel(loginUser.getName() + "님이 즐겨찾기 한 리스트입니다.");
		lblEx.setForeground(new Color(128, 0, 0));
		lblEx.setFont(new Font("나눔바른펜", Font.BOLD, 18));
		lblEx.setHorizontalAlignment(SwingConstants.CENTER);
		lblEx.setBounds(0,144,419,50);
		leftPanel.add(lblEx);
		
		// 오른쪽 패널에 즐겨찾기 리스트 출력
		JPanel listPanel = new JPanel();
		//listPanel.setLayout(null);
		listPanel.setBounds(420, 50, 580, 81);
		add(listPanel);
		
		ArrayList<Hotel> list = loginUser.getFavoriteHotel();
		JPanel hotel = new JPanel();
		hotel.setLayout(new GridLayout(20,1));
		JButton[] deleteBtn = new JButton[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			// 호텔 출력
			hotel.add(new JLabel(list.get(i).getName()));
			deleteBtn[i] = new JButton("삭제");
			hotel.add(deleteBtn[i]);
			
			// 첫번째 호텔 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					list.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		listPanel.add(hotel);
		add(listPanel);
		
		
		JPanel listPanel_1 = new JPanel();
		listPanel_1.setBounds(420, 131, 580, 81);
		
		ArrayList<Bank> bList = loginUser.getFavoriteBank();
		//System.out.println(bList.toString());
		JPanel bank = new JPanel();
		bank.setLayout(new GridLayout(20,1));
		JButton[] deleteBlistBtn = new JButton[bList.size()];
		
		for(int i = 0; i < bList.size(); i++) {
			// 은행 출력
			bank.add(new JLabel(bList.get(i).getName()));
			deleteBlistBtn[i] = new JButton("삭제");
			bank.add(deleteBlistBtn[i]);
			
			// 첫번째 은행 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteBlistBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					bList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		
		listPanel_1.add(bank);
		add(listPanel_1);
		
		JPanel listPanel_2 = new JPanel();
		listPanel_2.setBounds(420, 214, 580, 81);
		
		ArrayList<Restaurant> rList = loginUser.getFavoriteRestaurant();
		JPanel restaurant = new JPanel();
		restaurant.setLayout(new GridLayout(20,1));
		JButton[] deleteRlistBtn = new JButton[rList.size()];
		
		for(int i = 0; i < rList.size(); i++) {
			// 레스토랑 출력
			restaurant.add(new JLabel(rList.get(i).getfName()));
			deleteRlistBtn[i] = new JButton("삭제");
			restaurant.add(deleteRlistBtn[i]);
			
			// 첫번째 레스토랑 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteRlistBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					rList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		
		listPanel_2.add(restaurant);
		add(listPanel_2);
		
		JPanel listPanel_2_1 = new JPanel();
		listPanel_2_1.setBounds(420, 375, 580, 81);
		
		ArrayList<BookAndLibrary> balList = loginUser.getFavoriteBookAndLibrary();
		JPanel bal = new JPanel();
		bal.setLayout(new GridLayout(20,1));
		JButton[] deletebalBtn = new JButton[balList.size()];
		
		for(int i = 0; i < balList.size(); i++) {
			// book and library 출력
			bal.add(new JLabel(balList.get(i).getName()));
			deletebalBtn[i] = new JButton("삭제");
			bal.add(deletebalBtn[i]);
			
			// 첫번째 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deletebalBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					balList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		listPanel_2_1.add(bal);
		add(listPanel_2_1);
		
		
		
		
		
		JPanel listPanel_2_2 = new JPanel();
		listPanel_2_1.add(listPanel_2_2);
		JPanel hah = new JPanel();
		hah.setLayout(new GridLayout(20,1));
		
		listPanel_2_2.add(hah);
		hah.setLayout(new GridLayout(20,1));
		
		JPanel listPanel_2_1_1 = new JPanel();
		listPanel_2_1_1.setBounds(420, 454, 580, 146);
		
		ArrayList<Movie> mList = loginUser.getFavoriteMovie();
		JPanel movie = new JPanel();
		movie.setLayout(new GridLayout(20,1));
		JButton[] deleteMovieBtn = new JButton[mList.size()];
		
		for(int i = 0; i < mList.size(); i++) {
			// movie 출력
			movie.add(new JLabel(mList.get(i).getName()));
			deleteMovieBtn[i] = new JButton("삭제");
			movie.add(deleteMovieBtn[i]);
			
			// 첫번째 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteMovieBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		listPanel_2_1_1.add(movie);
		add(listPanel_2_1_1);
		
		ArrayList<HobbyAndHealth> hahList = loginUser.getFavoriteHobbyAndHealth();
		JButton[] deleteHahBtn = new JButton[hahList.size()];
		
		for(int i = 0; i < hahList.size(); i++) {
			// movie 출력
			hah.add(new JLabel(hahList.get(i).getName()));
			deleteHahBtn[i] = new JButton("삭제");
			hah.add(deleteHahBtn[i]);
			
			// 첫번째 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteHahBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					hahList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		
		JPanel listPanel_2_3 = new JPanel();
		listPanel_2_3.setBounds(420, 295, 580, 81);
		
		ArrayList<Exhibit> eList = loginUser.getFavoriteExhibit();
		JPanel exhibit = new JPanel();
		JButton[] deleteEBtn = new JButton[eList.size()];
		
		for(int i = 0; i < eList.size(); i++) {
			// movie 출력
			exhibit.add(new JLabel(eList.get(i).getName()));
			deleteEBtn[i] = new JButton("삭제");
			exhibit.add(deleteEBtn[i]);
			
			// 첫번째 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
			int index = i;
			deleteEBtn[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					eList.remove(index);
					mf.getContentPane().removeAll();
					mf.getContentPane().add(new KeepListView(mf, loginUser));
					mf.repaint();
					mf.setVisible(true);
				}
			});
		}
		
		listPanel_2_3.add(exhibit);
		add(listPanel_2_3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 오른쪽 패널 위에 패널 따로 만들고 아이콘 추가
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setBounds(420, 0, 580, 50);
		// btnPanel.setBackground(Color.lightGray);
		add(btnPanel);
		
		// 뒤로가기 버튼
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(12, 2, 52, 42);
		btnPanel.add(backBtn);
		
		// 홈버튼
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(516, 4, 52, 40);
		btnPanel.add(homeBtn);
		
		backBtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new MypageView(mf, loginUser));
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

		/*// 검색 후 확인 버튼 -> 검색한 키워드에 해당하는 즐겨찾기 리스트 출력(change panel)
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String searchText = textField.getText();
				ArrayList<Hotel> list = hc.searchList(searchText); // 호텔, 맛집, 여가, 은행....
				JPanel searchPanel = new JPanel();
				for(Hotel h : list) {
					searchPanel.add(new JLabel(h.displayOnList()));
				}
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new ShowIndexList(mf));
				mf.repaint();
				mf.setVisible(true);

			}
		});*/
		

		
		
	}
}
