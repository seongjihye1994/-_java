package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.CultureController;
import com.kh.mini_Project.model.Book;
import com.kh.mini_Project.model.BookAndLibrary;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.Health;
import com.kh.mini_Project.model.Hobby;
import com.kh.mini_Project.model.HobbyAndHealth;
import com.kh.mini_Project.model.Library;
import com.kh.mini_Project.model.Movie;
import com.kh.mini_Project.model.Person;

public class CultureListPanel extends JPanel {


	JFrame mf = new JFrame();
	CultureController c = new CultureController();
	// CultureListDetailPanel listDetail = new CultureListDetailPanel(mf);

	// 선택하세요 라벨 (plzSelectLabel)
	private JLabel plzSelectLabel = new JLabel("라벨의 텍스트가 이곳에 올라갈 예정");

	// 목록을 띄울 리스트 (list)
	private JList list = new JList();

	public CultureListPanel(JFrame mf, Person loginUser) {
		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// 왼쪽 기본 패널 (leftPanel)
		JPanel leftPanel = new JPanel();
		add(leftPanel);
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		leftPanel.setLayout(null);

		// 서치 바 (textField)
		JTextField textField = new JTextField();
		textField.setForeground(Color.GRAY);
		textField.setBounds(29, 77, 219, 43);
		textField.setText("검색 할 키워드를 입력하세요");
		leftPanel.add(textField);
		textField.setColumns(10);

		// 서치 버튼 (searchButton)
		Icon searchBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\search.png");
		JButton searchButton = new JButton(searchBtnIcon);
		searchButton.setBounds(260, 77, 43, 43);
		leftPanel.add(searchButton);

		// 서치 버튼이 눌렸을 때
		searchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll();

				String keyword = textField.getText();

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				// 검색 후 라벨에 올릴 문구
				String text = "검색하신 " + keyword + " 키워드의 유사 검색결과입니다.";
				myPanel.updateLabel(text);

				DefaultListModel<String> model = new DefaultListModel<>();

				ArrayList<Movie> movieList = c.movieListReader();
				ArrayList<Library> libraryList = c.libraryListReader();
				ArrayList<Book> bookList = c.bookListReader();
				ArrayList<BookAndLibrary> bookAndLibraryList = c.bookAndLibraryListReader();
				ArrayList<Exhibit> exhibitList = c.exhibitListReader();
				ArrayList<Health> healthList = c.healthListReader();
				ArrayList<Hobby> hobbyList = c.hobbyListReader();
				ArrayList<HobbyAndHealth> hobbyAndHealthList = c.hobbyAndHealthListReader();

				// 들어온 유저 인풋(keyword)을 switch문으로 필터링 
				boolean flag = true;
				
				while(flag) {
					
				switch (keyword) {
				case "영화":
				case "영화관":
					for (int i = 0; i < movieList.size(); i++) {
						model.addElement(movieList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "도서관":
					for (int i = 0; i < libraryList.size(); i++) {
						model.addElement(libraryList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "서점":
				case "문고":
					for (int i = 0; i < bookList.size(); i++) {
						model.addElement(bookList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "도서":
				case "책":
					for (int i = 0; i < bookAndLibraryList.size(); i++) {
						model.addElement(bookAndLibraryList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "박물관":
				case "미술관":
				case "유물":
				case "전시":
				case "전시회":
				case "미술":
				case "갤러리":
				case "체험학습":
					for (int i = 0; i < exhibitList.size(); i++) {
						model.addElement(exhibitList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "헬스":
				case "요가":
				case "짐":
				case "헬스장":
				case "피트니스":
				case "필라테스":
				case "운동":
				case "체육":
				case "운동시설":
				case "체육시설":
					for (int i = 0; i < healthList.size(); i++) {
						model.addElement(healthList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "음악":
				case "피아노":
				case "공방":
				case "스튜디오":
				case "체험":
					for (int i = 0; i < hobbyList.size(); i++) {
						model.addElement(hobbyList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "자기계발":
				case "취미":
					for (int i = 0; i < hobbyAndHealthList.size(); i++) {
						model.addElement(hobbyAndHealthList.get(i).getName());
					}
					myPanel.updateList(model);
					
					
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "다른 키워드로 검색해보세요!");
					textField.setText("");
					return;
				
				}
				mf.getContentPane().removeAll();

				mf.getContentPane().add(myPanel);
				myPanel.updateLabel(text);
				
	            mf.repaint();
	            mf.setVisible(true);
			}
		} 
		}); 

		// 왼쪽 기본 패널의 큰 카테고리 4 개 (음식점, 숙박, 문화, 금융) 버튼
		
		// 오른쪽 기본 패널 (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 600);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);
		list.setFont(new Font("나눔바른펜", Font.PLAIN, 22));

		// 리스트(JList)의 아이템이 마우스 클릭 되었을 때
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object selectedItem = list.getSelectedValue(); // 선택된 리스트의 값 
				CultureListDetailPanel listDetail = new CultureListDetailPanel(mf, loginUser); // 새롭게 띄울 패널

				ArrayList<BookAndLibrary> bookAndLibraryList = c.bookAndLibraryListReader();
				ArrayList<Movie> movieList = c.movieListReader();
				ArrayList<HobbyAndHealth> hobbyAndHealthList = c.hobbyAndHealthListReader();
				ArrayList<Exhibit> exhibitList = c.exhibitListReader();

				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(listDetail);

				for (int i = 0; i < bookAndLibraryList.size(); i++) {
					if (selectedItem == bookAndLibraryList.get(i).getName()) {
						// 만약 클릭된 상호명이 도서관련시설 리스트에 존재한다면
						listDetail.updateFacilityNameLabel(bookAndLibraryList.get(i).getName());
						listDetail.updateFacilityAddressLabel(bookAndLibraryList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(bookAndLibraryList.get(i).getTelenumber());
						listDetail.updateMapLabel(bookAndLibraryList.get(i).getImagePath());
					}
				}

				for (int i = 0; i < movieList.size(); i++) {
					if (selectedItem == movieList.get(i).getName()) {
						// 만약 클릭된 상호명이 영화관 리스트에 존재한다면
						listDetail.updateFacilityNameLabel(movieList.get(i).getName());
						listDetail.updateFacilityAddressLabel(movieList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(movieList.get(i).getTelenumber());
						listDetail.updateMapLabel(movieList.get(i).getImagePath());
					}
				}

				for (int i = 0; i < hobbyAndHealthList.size(); i++) {
					if (selectedItem == hobbyAndHealthList.get(i).getName()) {
						// 만약 클릭된 상호명이 취미 + 건강시설 리스트에 존재한다면
						listDetail.updateFacilityNameLabel(hobbyAndHealthList.get(i).getName());
						listDetail.updateFacilityAddressLabel(hobbyAndHealthList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(hobbyAndHealthList.get(i).getTelenumber());
						listDetail.updateMapLabel(hobbyAndHealthList.get(i).getImagePath());
					}

				}
				for (int i = 0; i < exhibitList.size(); i++) {
					if (selectedItem == exhibitList.get(i).getName()) {
						// 만약 클릭된 상호명이 전시관 리스트에 존재한다면
						listDetail.updateFacilityNameLabel(exhibitList.get(i).getName());
						listDetail.updateFacilityAddressLabel(exhibitList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(exhibitList.get(i).getTelenumber());
						listDetail.updateMapLabel(exhibitList.get(i).getImagePath());
					}
				}

				mf.repaint();
				mf.setVisible(true);
			}
		});

		list.setBackground(SystemColor.control);
		list.setBounds(59, 174, 551, 342);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) list.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		rightPanel.add(list);

		// 우측 패널의 돌아가기 버튼 (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
			}
		});

		// 우측 패널의 홈 버튼 (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);

		// 홈 버튼을 눌렀을 때
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
			}
		});

		homeBtn.setBounds(592, 6, 40, 40);
		rightPanel.add(homeBtn);
		plzSelectLabel.setFont(new Font("Nanum Gothic", Font.PLAIN, 22));

		plzSelectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		plzSelectLabel.setBounds(69, 64, 541, 34);
		rightPanel.add(plzSelectLabel);

	}

	public void updateLabel(String text) { // 라벨을 업데이트 해줄 메소드 (updateLabel())
		plzSelectLabel.setText(text);

	}

	public void updateList(DefaultListModel<String> model) { // 리스트를 업데이트 해줄 메소드 (updateList())
		list.setModel(model);
	}

}