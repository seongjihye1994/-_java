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

	// �����ϼ��� �� (plzSelectLabel)
	private JLabel plzSelectLabel = new JLabel("���� �ؽ�Ʈ�� �̰��� �ö� ����");

	// ����� ��� ����Ʈ (list)
	private JList list = new JList();

	public CultureListPanel(JFrame mf, Person loginUser) {
		setVisible(true);
		setLayout(null);
		setSize(1000, 600);

		// ���� �⺻ �г� (leftPanel)
		JPanel leftPanel = new JPanel();
		add(leftPanel);
		leftPanel.setBounds(0, 0, 333, 600);
		leftPanel.setBackground(Color.ORANGE);
		leftPanel.setLayout(null);

		// ��ġ �� (textField)
		JTextField textField = new JTextField();
		textField.setForeground(Color.GRAY);
		textField.setBounds(29, 77, 219, 43);
		textField.setText("�˻� �� Ű���带 �Է��ϼ���");
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

				mf.getContentPane().removeAll();

				String keyword = textField.getText();

				CultureListPanel myPanel = new CultureListPanel(mf, loginUser);
				mf.getContentPane().add(myPanel);

				// �˻� �� �󺧿� �ø� ����
				String text = "�˻��Ͻ� " + keyword + " Ű������ ���� �˻�����Դϴ�.";
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
		
		// ������ �⺻ �г� (rightPanel)
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(333, 0, 667, 600);
		rightPanel.setBackground(Color.WHITE);
		add(rightPanel);
		rightPanel.setLayout(null);
		list.setFont(new Font("�����ٸ���", Font.PLAIN, 22));

		// ����Ʈ(JList)�� �������� ���콺 Ŭ�� �Ǿ��� ��
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object selectedItem = list.getSelectedValue(); // ���õ� ����Ʈ�� �� 
				CultureListDetailPanel listDetail = new CultureListDetailPanel(mf, loginUser); // ���Ӱ� ��� �г�

				ArrayList<BookAndLibrary> bookAndLibraryList = c.bookAndLibraryListReader();
				ArrayList<Movie> movieList = c.movieListReader();
				ArrayList<HobbyAndHealth> hobbyAndHealthList = c.hobbyAndHealthListReader();
				ArrayList<Exhibit> exhibitList = c.exhibitListReader();

				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(listDetail);

				for (int i = 0; i < bookAndLibraryList.size(); i++) {
					if (selectedItem == bookAndLibraryList.get(i).getName()) {
						// ���� Ŭ���� ��ȣ���� �������ýü� ����Ʈ�� �����Ѵٸ�
						listDetail.updateFacilityNameLabel(bookAndLibraryList.get(i).getName());
						listDetail.updateFacilityAddressLabel(bookAndLibraryList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(bookAndLibraryList.get(i).getTelenumber());
						listDetail.updateMapLabel(bookAndLibraryList.get(i).getImagePath());
					}
				}

				for (int i = 0; i < movieList.size(); i++) {
					if (selectedItem == movieList.get(i).getName()) {
						// ���� Ŭ���� ��ȣ���� ��ȭ�� ����Ʈ�� �����Ѵٸ�
						listDetail.updateFacilityNameLabel(movieList.get(i).getName());
						listDetail.updateFacilityAddressLabel(movieList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(movieList.get(i).getTelenumber());
						listDetail.updateMapLabel(movieList.get(i).getImagePath());
					}
				}

				for (int i = 0; i < hobbyAndHealthList.size(); i++) {
					if (selectedItem == hobbyAndHealthList.get(i).getName()) {
						// ���� Ŭ���� ��ȣ���� ��� + �ǰ��ü� ����Ʈ�� �����Ѵٸ�
						listDetail.updateFacilityNameLabel(hobbyAndHealthList.get(i).getName());
						listDetail.updateFacilityAddressLabel(hobbyAndHealthList.get(i).getAddress());
						listDetail.updateFacilityTelLabel(hobbyAndHealthList.get(i).getTelenumber());
						listDetail.updateMapLabel(hobbyAndHealthList.get(i).getImagePath());
					}

				}
				for (int i = 0; i < exhibitList.size(); i++) {
					if (selectedItem == exhibitList.get(i).getName()) {
						// ���� Ŭ���� ��ȣ���� ���ð� ����Ʈ�� �����Ѵٸ�
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

		// ���� �г��� ���ư��� ��ư (backBtn)
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		rightPanel.setLayout(null);
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		rightPanel.add(backBtn);

		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
			}
		});

		// ���� �г��� Ȩ ��ư (homeBtn)
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);

		// Ȩ ��ư�� ������ ��
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll(); // �� �г��� �����
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

	public void updateLabel(String text) { // ���� ������Ʈ ���� �޼ҵ� (updateLabel())
		plzSelectLabel.setText(text);

	}

	public void updateList(DefaultListModel<String> model) { // ����Ʈ�� ������Ʈ ���� �޼ҵ� (updateList())
		list.setModel(model);
	}

}