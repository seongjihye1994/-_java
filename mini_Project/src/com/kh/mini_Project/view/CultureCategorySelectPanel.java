package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
import java.awt.Font;

public class CultureCategorySelectPanel extends JPanel {
	private JTextField textField;

	// 도서, 전시, 취미, 영화관 총 4개의 버튼이 있는 패널
	// 각 버튼을 누르면 해당 버튼에 대한 리스트를 보여주는 패널로 넘어간다

	public CultureCategorySelectPanel(JFrame mf, Person loginUser) {
		CultureController c = new CultureController();

		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// 왼쪽 기본 패널 (leftPanel)
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		add(leftPanel);
		leftPanel.setLayout(null);

		// 검색창 (textField)
		textField = new JTextField();
		textField.setFont(new Font("나눔바른펜", Font.BOLD, 12));
		textField.setForeground(Color.GRAY);
		textField.setBounds(29, 77, 219, 43);
		textField.setText("검색 할 키워드를 입력하세요.");
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
				
				String keyword = textField.getText(); 
				
				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				

				// 검색 후 라벨에 올릴 문구 
				String text = "검색하신 " + keyword + " 키워드의 유사 검색결과입니다.";
				

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
		JButton restaurantBtn = new JButton("음식점");
		restaurantBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		restaurantBtn.setBounds(0, 247, 333, 76);
		restaurantBtn.setBackground(Color.ORANGE);
		restaurantBtn.setContentAreaFilled(false);
		restaurantBtn.setBorderPainted(false);
		leftPanel.add(restaurantBtn);
		
		restaurantBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new RestaurantPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		JButton accomBtn = new JButton("숙박");
		accomBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		accomBtn.setBounds(0, 319, 333, 76);
		accomBtn.setBackground(Color.ORANGE);
		accomBtn.setContentAreaFilled(false);
		accomBtn.setBorderPainted(false);
		leftPanel.add(accomBtn);
		
		accomBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new HotelPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		JButton financialBtn = new JButton("금융");
		financialBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		financialBtn.setBounds(0, 389, 333, 76);
		financialBtn.setBackground(Color.ORANGE);
		financialBtn.setContentAreaFilled(false);
		financialBtn.setBorderPainted(false);
		leftPanel.add(financialBtn);

		financialBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new financePage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		// 오른쪽 기본 패널 (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 578);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);

		// 우측 패널의 돌아가기 버튼 (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);

		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		
        // 돌아가기 버튼을 눌렀을 때 
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		// 우측 패널의 홈 버튼 (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(600, 6, 40, 40);
		rightPanel.add(homeBtn);
		
		// 홈 버튼을 눌렀을 때 
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // 구 패널을 지운다
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		
		// 하위 카테고리 버튼 4개 (도서, 영화, 취미, 건강)

		// 하위 카테고리 버튼 1. 도서
		JButton bookCategoryBtn = new JButton("도서");
		bookCategoryBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		bookCategoryBtn.setBounds(162, 191, 170, 96);
		rightPanel.add(bookCategoryBtn);

		// 도서 버튼을 눌렀을 때
		bookCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // 구 패널을 지운다

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "원하는 도서 관련시설을 클릭해서 상세정보를 조회하세요";
				myPanel.updateLabel(text);

				DefaultListModel<String> model = new DefaultListModel<>();
				ArrayList<BookAndLibrary> list = c.bookAndLibraryListReader();

				for (int i = 0; i < list.size(); i++) {
					model.addElement(list.get(i).getName());
				}

				myPanel.updateList(model);

				mf.repaint();
				mf.setVisible(true);
			}
		});

		// 하위 카테고리 버튼 2. 영화
		JButton movieCategoryBtn = new JButton("영화");
		movieCategoryBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		movieCategoryBtn.setBounds(344, 191, 170, 96);
		rightPanel.add(movieCategoryBtn);

		// 영화 버튼을 눌렀을 때
		movieCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // 구 패널을 지운다

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "원하는 영화관을 클릭해서 상세정보를 조회하세요";
				myPanel.updateLabel(text);

				DefaultListModel<String> model = new DefaultListModel<>();

				ArrayList<Movie> list = c.movieListReader();

				for (int i = 0; i < list.size(); i++) {
					model.addElement(list.get(i).getName());
				}

				myPanel.updateList(model);

				mf.repaint();
				mf.setVisible(true);

			}
		});

		// 하위 카테고리 버튼 3. 취미
		JButton hobbyCategoryBtn = new JButton("취미");
		hobbyCategoryBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		hobbyCategoryBtn.setBounds(162, 299, 170, 96);
		rightPanel.add(hobbyCategoryBtn);

		hobbyCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // 구 패널을 지운다

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "원하는 취미시설을 클릭해서 상세정보를 조회하세요";
				myPanel.updateLabel(text);

				DefaultListModel<String> model = new DefaultListModel<>();

				ArrayList<HobbyAndHealth> list = c.hobbyAndHealthListReader();

				for (int i = 0; i < list.size(); i++) {
					model.addElement(list.get(i).getName());
				}

				myPanel.updateList(model);

				mf.repaint();
				mf.setVisible(true);

			}
		});

		// 하위 카테고리 버튼 4. 전시
		JButton exhibitCategoryBtn = new JButton("전시");
		exhibitCategoryBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
		exhibitCategoryBtn.setBounds(344, 299, 170, 96);
		rightPanel.add(exhibitCategoryBtn);

		exhibitCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // 구 패널을 지운다

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "원하는 전시관을 클릭해서 상세정보를 조회하세요";
				myPanel.updateLabel(text);

				DefaultListModel<String> model = new DefaultListModel<>();

				ArrayList<Exhibit> list = c.exhibitListReader();

				for (int i = 0; i < list.size(); i++) {
					model.addElement(list.get(i).getName());
				}

				myPanel.updateList(model);

				mf.repaint();
				mf.setVisible(true);
			}
		});

	}
}