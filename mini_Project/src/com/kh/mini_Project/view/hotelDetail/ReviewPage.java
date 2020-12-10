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
		
		// 왼쪽 패널
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 340, 600);
		leftPanel.setBackground(Color.orange);
		add(leftPanel);
		
		JLabel label = new JLabel(list.get(index).getName() + " 리뷰");
		label.setFont(new Font("나눔바른펜", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 84, 340, 16);
		leftPanel.add(label);


		// 오른쪽 패널 위에 패널 따로 만들고 아이콘 추가
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
		review[0] = new JLabel("8.0   룸컨디션 너무 좋았고 루프트탑에 사람이 많아서 좀 정신없었지만 룸은 너무 좋고 친절했다. ");
		review[1] = new JLabel("9.0   친절하시고 숙소도 깨끗해서 너무 만족스러웠습니다.");
		review[2] = new JLabel("7.5   룸 상태는 전반적으로 괜찮았구요 친절하셔서 좋았습니다 다만 화장실이 조금 좁았어요");
		review[3] = new JLabel("8.5   깨끗한 객실과 푹신한 침대는 출장으로 피곤한 저에게 충분한 휴식이 되었습니다");
		review[4] = new JLabel("9.5   가격대비 최고인 것 같아요! 직원분께서 엄청 친절하고 좋았습니다.");
		review[5] = new JLabel("7.0   역 바로 앞이라 너무 좋네요. 어차피 도심이라 뷰는 딱히 필요 없었어서 방이 넓은 게 좋았습니다.");
		review[6] = new JLabel("6.5   방은 작고 부대시설은 뭐 딱히 없는듯요 루프탑 별로였구요 루프탑 직원또한 별로였어요");
		
		// review의 index값 중복 없애기
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