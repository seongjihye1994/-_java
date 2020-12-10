package com.kh.mini_Project.view.hotelDetail;

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
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.HotelController;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.HotelPage;
import com.kh.mini_Project.view.MainPage;

public class ReviewPage extends JPanel {
	private HotelController hc = new HotelController();
	private ArrayList<Hotel> list = hc.selectList();
	private JFrame mainFrame;
	private Person loginUser;

	public ReviewPage(JFrame mf, int index, Person loginUser) {
		this.setSize(1000, 600);
		this.setLayout(null);
		
		// ���� �г�
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 340, 600);
		leftPanel.setBackground(Color.orange);
		add(leftPanel);
		
		JLabel label = new JLabel(list.get(index).getName() + " ����");
		label.setFont(new Font("�����ٸ���", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 84, 340, 16);
		leftPanel.add(label);


		// ������ �г� ���� �г� ���� ����� ������ �߰�
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setBounds(340, 0, 660, 50);
		add(btnPanel);

		Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
		JButton backBtn = new JButton(backBtnIcon);
		backBtn.setBounds(6, 6, 42, 42);
		btnPanel.add(backBtn);

		Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
		JButton homeBtn = new JButton(homeBtnIcon);
		homeBtn.setBounds(604, 6, 40, 40);
		btnPanel.add(homeBtn);

		backBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new DetailList(mf, index ,loginUser));
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
		
		JPanel reviewPanel = new JPanel();
		reviewPanel.setBounds(340, 50, 660, 600);
		panel.add(reviewPanel);
		reviewPanel.setLayout(null);
		
		JLabel[] review = new JLabel[7];
		review[0] = new JLabel("8.0   ������� �ʹ� ���Ұ� ����Ʈž�� ����� ���Ƽ� �� ���ž������� ���� �ʹ� ���� ģ���ߴ�. ");
		review[1] = new JLabel("9.0   ģ���Ͻð� ���ҵ� �����ؼ� �ʹ� �������������ϴ�.");
		review[2] = new JLabel("7.5   �� ���´� ���������� �����ұ��� ģ���ϼż� ���ҽ��ϴ� �ٸ� ȭ����� ���� ���Ҿ��");
		review[3] = new JLabel("8.5   ������ ���ǰ� ǫ���� ħ��� �������� �ǰ��� ������ ����� �޽��� �Ǿ����ϴ�");
		review[4] = new JLabel("9.5   ���ݴ�� �ְ��� �� ���ƿ�! �����в��� ��û ģ���ϰ� ���ҽ��ϴ�.");
		review[5] = new JLabel("7.0   �� �ٷ� ���̶� �ʹ� ���׿�. ������ �����̶� ��� ���� �ʿ� ����� ���� ���� �� ���ҽ��ϴ�.");
		review[6] = new JLabel("6.5   ���� �۰� �δ�ü��� �� ���� ���µ�� ����ž ���ο����� ����ž �������� ���ο����");
		
		// review�� index�� �ߺ� ���ֱ�
		int[] random = new int[3];
		JLabel[] ranReview = new JLabel[3];
		
		
		for(int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * review.length);
			
			for(int j = 0; j < i; j++) {
				
				if(random[i] == random[j]) {
					i--;
					break;
				}
			}
		ranReview[i] = review[random[i]];
		System.out.println(ranReview[i].getText());
			
		}
	
		
		JLabel lblNewLabel = ranReview[0];
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 94, 660, 30);
		reviewPanel.add(lblNewLabel);
		
		JLabel label_1 = ranReview[1];
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 133, 660, 30);
		reviewPanel.add(label_1);
		
		JLabel label_2 = ranReview[2];
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 175, 660, 30);
		reviewPanel.add(label_2);
		
	
	}
}