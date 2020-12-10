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

	// ����, ����, ���, ��ȭ�� �� 4���� ��ư�� �ִ� �г�
	// �� ��ư�� ������ �ش� ��ư�� ���� ����Ʈ�� �����ִ� �гη� �Ѿ��

	public CultureCategorySelectPanel(JFrame mf, Person loginUser) {
		CultureController c = new CultureController();

		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// ���� �⺻ �г� (leftPanel)
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		add(leftPanel);
		leftPanel.setLayout(null);

		// �˻�â (textField)
		textField = new JTextField();
		textField.setFont(new Font("�����ٸ���", Font.BOLD, 12));
		textField.setForeground(Color.GRAY);
		textField.setBounds(29, 77, 219, 43);
		textField.setText("�˻� �� Ű���带 �Է��ϼ���.");
		leftPanel.add(textField);
		textField.setColumns(10);

		// ��ġ ��ư (searchButton)
		Icon searchBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\search.png");
		JButton searchButton = new JButton(searchBtnIcon);
		searchButton.setBounds(260, 77, 43, 43);
		leftPanel.add(searchButton);
		
		// ��ġ ��ư�� ������ �� 
		searchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String keyword = textField.getText(); 
				
				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				

				// �˻� �� �󺧿� �ø� ���� 
				String text = "�˻��Ͻ� " + keyword + " Ű������ ���� �˻�����Դϴ�.";
				

				DefaultListModel<String> model = new DefaultListModel<>();
				
				ArrayList<Movie> movieList = c.movieListReader();
				ArrayList<Library> libraryList = c.libraryListReader();
				ArrayList<Book> bookList = c.bookListReader();
				ArrayList<BookAndLibrary> bookAndLibraryList = c.bookAndLibraryListReader();
				ArrayList<Exhibit> exhibitList = c.exhibitListReader();
				ArrayList<Health> healthList = c.healthListReader();
				ArrayList<Hobby> hobbyList = c.hobbyListReader();
				ArrayList<HobbyAndHealth> hobbyAndHealthList = c.hobbyAndHealthListReader();
				
				
				// ���� ���� ��ǲ(keyword)�� switch������ ���͸� 
				boolean flag = true;
				
				while(flag) {
					
				switch (keyword) {
				case "��ȭ":
				case "��ȭ��":
					for (int i = 0; i < movieList.size(); i++) {
						model.addElement(movieList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "������":
					for (int i = 0; i < libraryList.size(); i++) {
						model.addElement(libraryList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "����":
				case "����":
					for (int i = 0; i < bookList.size(); i++) {
						model.addElement(bookList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "����":
				case "å":
					for (int i = 0; i < bookAndLibraryList.size(); i++) {
						model.addElement(bookAndLibraryList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "�ڹ���":
				case "�̼���":
				case "����":
				case "����":
				case "����ȸ":
				case "�̼�":
				case "������":
				case "ü���н�":
					for (int i = 0; i < exhibitList.size(); i++) {
						model.addElement(exhibitList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "�ｺ":
				case "�䰡":
				case "��":
				case "�ｺ��":
				case "��Ʈ�Ͻ�":
				case "�ʶ��׽�":
				case "�":
				case "ü��":
				case "��ü�":
				case "ü���ü�":
					for (int i = 0; i < healthList.size(); i++) {
						model.addElement(healthList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "����":
				case "�ǾƳ�":
				case "����":
				case "��Ʃ���":
				case "ü��":
					for (int i = 0; i < hobbyList.size(); i++) {
						model.addElement(hobbyList.get(i).getName());
					}
					myPanel.updateList(model);
					
					flag = false;
					break;
					
				case "�ڱ���":
				case "���":
					for (int i = 0; i < hobbyAndHealthList.size(); i++) {
						model.addElement(hobbyAndHealthList.get(i).getName());
					}
					myPanel.updateList(model);
					
					
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "�ٸ� Ű����� �˻��غ�����!");
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
		
		

		// ���� �⺻ �г��� ū ī�װ� 4 �� (������, ����, ��ȭ, ����) ��ư
		JButton restaurantBtn = new JButton("������");
		restaurantBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		restaurantBtn.setBounds(0, 247, 333, 76);
		restaurantBtn.setBackground(Color.ORANGE);
		restaurantBtn.setContentAreaFilled(false);
		restaurantBtn.setBorderPainted(false);
		leftPanel.add(restaurantBtn);
		
		restaurantBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new RestaurantPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		JButton accomBtn = new JButton("����");
		accomBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		accomBtn.setBounds(0, 319, 333, 76);
		accomBtn.setBackground(Color.ORANGE);
		accomBtn.setContentAreaFilled(false);
		accomBtn.setBorderPainted(false);
		leftPanel.add(accomBtn);
		
		accomBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new HotelPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		JButton financialBtn = new JButton("����");
		financialBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		financialBtn.setBounds(0, 389, 333, 76);
		financialBtn.setBackground(Color.ORANGE);
		financialBtn.setContentAreaFilled(false);
		financialBtn.setBorderPainted(false);
		leftPanel.add(financialBtn);

		financialBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new financePage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		// ������ �⺻ �г� (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 578);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);

		// ���� �г��� ���ư��� ��ư (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);

		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		
        // ���ư��� ��ư�� ������ �� 
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});

		// ���� �г��� Ȩ ��ư (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(600, 6, 40, 40);
		rightPanel.add(homeBtn);
		
		// Ȩ ��ư�� ������ �� 
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new MainPage(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		
		// ���� ī�װ� ��ư 4�� (����, ��ȭ, ���, �ǰ�)

		// ���� ī�װ� ��ư 1. ����
		JButton bookCategoryBtn = new JButton("����");
		bookCategoryBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		bookCategoryBtn.setBounds(162, 191, 170, 96);
		rightPanel.add(bookCategoryBtn);

		// ���� ��ư�� ������ ��
		bookCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // �� �г��� �����

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "���ϴ� ���� ���ýü��� Ŭ���ؼ� �������� ��ȸ�ϼ���";
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

		// ���� ī�װ� ��ư 2. ��ȭ
		JButton movieCategoryBtn = new JButton("��ȭ");
		movieCategoryBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		movieCategoryBtn.setBounds(344, 191, 170, 96);
		rightPanel.add(movieCategoryBtn);

		// ��ȭ ��ư�� ������ ��
		movieCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // �� �г��� �����

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "���ϴ� ��ȭ���� Ŭ���ؼ� �������� ��ȸ�ϼ���";
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

		// ���� ī�װ� ��ư 3. ���
		JButton hobbyCategoryBtn = new JButton("���");
		hobbyCategoryBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		hobbyCategoryBtn.setBounds(162, 299, 170, 96);
		rightPanel.add(hobbyCategoryBtn);

		hobbyCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // �� �г��� �����

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "���ϴ� ��̽ü��� Ŭ���ؼ� �������� ��ȸ�ϼ���";
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

		// ���� ī�װ� ��ư 4. ����
		JButton exhibitCategoryBtn = new JButton("����");
		exhibitCategoryBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
		exhibitCategoryBtn.setBounds(344, 299, 170, 96);
		rightPanel.add(exhibitCategoryBtn);

		exhibitCategoryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				mf.getContentPane().removeAll(); // �� �г��� �����

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				String text = "���ϴ� ���ð��� Ŭ���ؼ� �������� ��ȸ�ϼ���";
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