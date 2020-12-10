package com.kh.mini_Project.view;

import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JOptionPane;

import com.kh.mini_Project.controller.MyPageController;
import com.kh.mini_Project.model.Person;
import javax.swing.JList;

public class MypageView extends JPanel { // �������������� ���ã�� ��ư�� ������ ������ �гο��� ���ã�� ����Ʈ�� ����ϴ� �г� // �˻� + ī�װ� ��ư 4���� �ʿ��Ѱ�?
	private Person loginUser;
	MyPageController controller = new MyPageController();

	/**
	 * Create the panel.
	 */
	public MypageView(JFrame mf, Person loginUser) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(405, 0, 595, 600);
		add(panel);
		
		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		
		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		panel.setLayout(null);
		
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(12, 10, 42, 42);
		panel.add(backBtn);
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(530, 10, 40, 40);
		panel.add(homeBtn);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 640, 600);
		panel.add(label);
		label.setIcon(new ImageIcon(MypageView.class.getResource("/image/MainPage.jpg")));
		
		homeBtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new MainPage(mf, loginUser));
	            mf.repaint();
	            mf.setVisible(true);

	         }
	      });
		
		
		backBtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new MainPage(mf, loginUser));
	            mf.repaint();
	            mf.setVisible(true);

	         }
	      });

		JLabel lblNewLabel = new JLabel("  \uFF03MyPage");
		lblNewLabel.setBounds(50, 103, 307, 138);
		add(lblNewLabel);
		lblNewLabel.setFont(new Font("�����ٸ���", Font.BOLD, 60));
		
		JPanel rightPanel = new JPanel();
	    rightPanel.setBounds(405, 0, 606, 599);
	    add(rightPanel);
		rightPanel.setLayout(null);
        //imageLabel.setIcon(new ImageIcon(MypageView.class.getResource("/imange/userImage.jpg")));
		
		// ��ư 1 ���ã��
		JButton favoriteList = new JButton("���ã��");
		favoriteList.setForeground(new Color(139, 0, 0));
		favoriteList.setFont(new Font("�����ٸ���", Font.BOLD, 30));
		favoriteList.setBounds(101, 251, 202, 57);
		favoriteList.setOpaque(false);
		favoriteList.setContentAreaFilled(false);
		favoriteList.setBorderPainted(false);
		add(favoriteList);
		
		JButton logOutBtn = new JButton("�α׾ƿ�");
		logOutBtn.setForeground(new Color(139, 0, 0));
		logOutBtn.setFont(new Font("�����ٸ���", Font.BOLD, 30));
		logOutBtn.setBounds(101, 318, 202, 57);
		logOutBtn.setOpaque(false);
		logOutBtn.setContentAreaFilled(false);
		logOutBtn.setBorderPainted(false);
		add(logOutBtn);
		
		
		// �α׾ƿ�
		logOutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �α׾ƿ� �� �α��� �������� �̵�
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ϸ�");
				mf.getContentPane().removeAll();
	            mf.getContentPane().add(new LoginPage(mf));
	            mf.repaint();
	            mf.setVisible(true);

			}
		});
		
		// ���ã��
		favoriteList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new KeepListView(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		
		
		
		
		
	}
}
