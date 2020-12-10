package com.kh.mini_Project.view;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.CultureController;
import com.kh.mini_Project.model.BookAndLibrary;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.HobbyAndHealth;
import com.kh.mini_Project.model.Movie;
import com.kh.mini_Project.model.Person;

public class CultureListDetailPanel extends JPanel {
	
	CultureController cc = new CultureController();

	private JLabel facilityNameLabel = new JLabel("이곳에 상호 이름이 띄워짐"); // 상호명 라벨
	private JLabel facilityTelLabel = new JLabel("이곳에 전화번호 정보가 띄워짐"); // 전화번호 라벨
	private JLabel facilityAddressLabel = new JLabel("이곳에 주소 정보가 띄워짐"); // 주소 라벨
	
	
	ArrayList<Facility> culture = new ArrayList<Facility>(); // ArrayList에 담음 

	private JLabel mapLabel = new JLabel(); // 지도 이미지라벨
	// private ImageIcon mapImage = new ImageIcon(); // 지도 아이콘이미지

	private JButton setAsFavoriteBtn = new JButton("저 장"); // 즐겨찾기 버튼

	public CultureListDetailPanel(JFrame mf, Person loginUser) {
		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// 왼쪽 기본 패널 (leftPanel)
		JPanel leftPanel = new JPanel();
		add(leftPanel);
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		leftPanel.setLayout(null);

		// 서치 바 (searchBar)
		JTextField searchBar = new JTextField();
		searchBar.setFont(new Font("나눔바른펜", Font.BOLD, 12));
		searchBar.setForeground(Color.GRAY);
		searchBar.setBounds(29, 77, 219, 43);
		searchBar.setText("검색 할 키워드를 입력하세요");
		leftPanel.add(searchBar);
		searchBar.setColumns(10);

		// 서치 버튼 (searchButton)
		Icon searchBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\search.png");
		JButton searchButton = new JButton(searchBtnIcon);
		searchButton.setBounds(260, 77, 43, 43);
		leftPanel.add(searchButton);

		// 오른쪽 기본 패널 (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 600);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);

		// 우측 패널의 돌아가기 버튼 (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);
		JButton backBtn = new JButton(backBtnIcon);

		// 돌아가기 버튼을 눌렀을 때
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
			}
		});

		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		// 우측 패널의 홈 버튼 (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(597, 8, 40, 40);
		rightPanel.add(homeBtn);
		
		
		// 홈 버튼을 눌렀을 때
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
			}
		});

		// 상호명 라벨 (facilityNameLabel)
		facilityNameLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 33));
		facilityNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityNameLabel.setBounds(109, 66, 459, 42);
		rightPanel.add(facilityNameLabel);
		setAsFavoriteBtn.setFont(new Font("나눔바른펜", Font.BOLD, 12));
		

		// 즐겨찾기에 추가하는 버튼 (setAsFavoriteBtn)
		setAsFavoriteBtn.setBounds(277, 502, 117, 42);
		rightPanel.add(setAsFavoriteBtn);
		
		// 즐겨찾기에 추가하는 버튼을 눌렀을 때 
		setAsFavoriteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String facilityName = facilityNameLabel.getText(); // 이름 라벨 
			
			// 1. Culture에 있는 모든 리스트를 각각 뽑아옴.
			ArrayList<BookAndLibrary> bookAndLibraryList = cc.bookAndLibraryListReader();
			ArrayList<Movie> movieList = cc.movieListReader();
			ArrayList<HobbyAndHealth> hobbyAndHealthList = cc.hobbyAndHealthListReader();
			ArrayList<Exhibit> exhibitList = cc.exhibitListReader();
			
			// 2. 그 리스트의 i번째 인덱스에 getName이 facilityName과 같을 떄
			for (int i = 0; i < bookAndLibraryList.size(); i++) {
				if (bookAndLibraryList.get(i).getName().equals(facilityName)) {
					loginUser.getFavoriteBookAndLibrary().add(bookAndLibraryList.get(i));
				}
			}
			
			for (int i = 0; i < movieList.size(); i++) {
				if (movieList.get(i).getName().equals(facilityName)) {
					loginUser.getFavoriteMovie().add(movieList.get(i));
				}
			}
				
			for (int i = 0; i < hobbyAndHealthList.size(); i++) {
				if (hobbyAndHealthList.get(i).getName().equals(facilityName)) {
					loginUser.getFavoriteHobbyAndHealth().add(hobbyAndHealthList.get(i));
				}
			}
				
			for (int i = 0; i < exhibitList.size(); i++) {
				if (exhibitList.get(i).getName().equals(facilityName)) {
					loginUser.getFavoriteExhibit().add(exhibitList.get(i));
				}
			}
			
		}
	});

		// 전화번호 라벨 (facilityTelLabel)
		facilityTelLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		facilityTelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityTelLabel.setBounds(204, 394, 279, 40);
		rightPanel.add(facilityTelLabel);

		// 주소 라벨 (facilityAddressLabel)
		facilityAddressLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 18));
		facilityAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityAddressLabel.setBounds(147, 339, 398, 51);
		rightPanel.add(facilityAddressLabel);

		mapLabel.setBounds(171, 145, 353, 182);
		rightPanel.add(mapLabel);

	}

	// 업데이트 용도 메소드

	public void updateFacilityNameLabel(String text) { // 시설명 라벨 업데이트 메소드
		facilityNameLabel.setText(text);
	}

	public void updateFacilityTelLabel(String text) { // 시설 전화번호 라벨 업데이트 메소드
		facilityTelLabel.setText(text);
	}

	public void updateFacilityAddressLabel(String text) { // 시설 주소 라벨 업데이트 메소드
		facilityAddressLabel.setText(text);
	}

	public void updateMapLabel(String text) { // 지도 라벨 업데이트 메소드
		mapLabel.setIcon(new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\cultureMap\\" + text + ".png"));
	}
	
}