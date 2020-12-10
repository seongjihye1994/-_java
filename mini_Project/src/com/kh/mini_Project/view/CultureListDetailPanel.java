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

	private JLabel facilityNameLabel = new JLabel("�̰��� ��ȣ �̸��� �����"); // ��ȣ�� ��
	private JLabel facilityTelLabel = new JLabel("�̰��� ��ȭ��ȣ ������ �����"); // ��ȭ��ȣ ��
	private JLabel facilityAddressLabel = new JLabel("�̰��� �ּ� ������ �����"); // �ּ� ��
	
	
	ArrayList<Facility> culture = new ArrayList<Facility>(); // ArrayList�� ���� 

	private JLabel mapLabel = new JLabel(); // ���� �̹�����
	// private ImageIcon mapImage = new ImageIcon(); // ���� �������̹���

	private JButton setAsFavoriteBtn = new JButton("�� ��"); // ���ã�� ��ư

	public CultureListDetailPanel(JFrame mf, Person loginUser) {
		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// ���� �⺻ �г� (leftPanel)
		JPanel leftPanel = new JPanel();
		add(leftPanel);
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		leftPanel.setLayout(null);

		// ��ġ �� (searchBar)
		JTextField searchBar = new JTextField();
		searchBar.setFont(new Font("�����ٸ���", Font.BOLD, 12));
		searchBar.setForeground(Color.GRAY);
		searchBar.setBounds(29, 77, 219, 43);
		searchBar.setText("�˻� �� Ű���带 �Է��ϼ���");
		leftPanel.add(searchBar);
		searchBar.setColumns(10);

		// ��ġ ��ư (searchButton)
		Icon searchBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\search.png");
		JButton searchButton = new JButton(searchBtnIcon);
		searchButton.setBounds(260, 77, 43, 43);
		leftPanel.add(searchButton);

		// ������ �⺻ �г� (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 600);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);

		// ���� �г��� ���ư��� ��ư (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);
		JButton backBtn = new JButton(backBtnIcon);

		// ���ư��� ��ư�� ������ ��
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
			}
		});

		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		// ���� �г��� Ȩ ��ư (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(597, 8, 40, 40);
		rightPanel.add(homeBtn);
		
		
		// Ȩ ��ư�� ������ ��
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
			}
		});

		// ��ȣ�� �� (facilityNameLabel)
		facilityNameLabel.setFont(new Font("�����ٸ���", Font.PLAIN, 33));
		facilityNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityNameLabel.setBounds(109, 66, 459, 42);
		rightPanel.add(facilityNameLabel);
		setAsFavoriteBtn.setFont(new Font("�����ٸ���", Font.BOLD, 12));
		

		// ���ã�⿡ �߰��ϴ� ��ư (setAsFavoriteBtn)
		setAsFavoriteBtn.setBounds(277, 502, 117, 42);
		rightPanel.add(setAsFavoriteBtn);
		
		// ���ã�⿡ �߰��ϴ� ��ư�� ������ �� 
		setAsFavoriteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String facilityName = facilityNameLabel.getText(); // �̸� �� 
			
			// 1. Culture�� �ִ� ��� ����Ʈ�� ���� �̾ƿ�.
			ArrayList<BookAndLibrary> bookAndLibraryList = cc.bookAndLibraryListReader();
			ArrayList<Movie> movieList = cc.movieListReader();
			ArrayList<HobbyAndHealth> hobbyAndHealthList = cc.hobbyAndHealthListReader();
			ArrayList<Exhibit> exhibitList = cc.exhibitListReader();
			
			// 2. �� ����Ʈ�� i��° �ε����� getName�� facilityName�� ���� ��
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

		// ��ȭ��ȣ �� (facilityTelLabel)
		facilityTelLabel.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		facilityTelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityTelLabel.setBounds(204, 394, 279, 40);
		rightPanel.add(facilityTelLabel);

		// �ּ� �� (facilityAddressLabel)
		facilityAddressLabel.setFont(new Font("�����ٸ���", Font.PLAIN, 18));
		facilityAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		facilityAddressLabel.setBounds(147, 339, 398, 51);
		rightPanel.add(facilityAddressLabel);

		mapLabel.setBounds(171, 145, 353, 182);
		rightPanel.add(mapLabel);

	}

	// ������Ʈ �뵵 �޼ҵ�

	public void updateFacilityNameLabel(String text) { // �ü��� �� ������Ʈ �޼ҵ�
		facilityNameLabel.setText(text);
	}

	public void updateFacilityTelLabel(String text) { // �ü� ��ȭ��ȣ �� ������Ʈ �޼ҵ�
		facilityTelLabel.setText(text);
	}

	public void updateFacilityAddressLabel(String text) { // �ü� �ּ� �� ������Ʈ �޼ҵ�
		facilityAddressLabel.setText(text);
	}

	public void updateMapLabel(String text) { // ���� �� ������Ʈ �޼ҵ�
		mapLabel.setIcon(new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\cultureMap\\" + text + ".png"));
	}
	
}