package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.mini_Project.controller.FinancialController;
import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.FinanceDetail.backDetailReal.DetailList;


public class financePage extends JPanel{
   private FinancialController bc = new FinancialController();
   private Person loginUser;
   
   public financePage(JFrame mf, Person loginUser) {
      this.setSize(1000,600);
      this.setLayout(null);
      
      // 기본 좌측 패널에 검색 기능 올리기
      JPanel leftPanel = new JPanel();
      leftPanel.setLayout(null);
      leftPanel.setBounds(0, 0, 340, 600);
      leftPanel.setBackground(Color.orange);
      add(leftPanel);
      
      JLabel label2 = new JLabel("BANK");
      label2.setBounds(128,36,112,50);
      label2.setFont(new Font("나눔바른펜", Font.PLAIN, 34));
      leftPanel.add(label2);
      
      
      JLabel label = new JLabel("검색");
      label.setBounds(111, 127, 100, 50);
	  label.setHorizontalAlignment(SwingConstants.CENTER);
	  label.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      leftPanel.add(label);
		
	  JTextField textField = new JTextField(15);
      textField.setBounds(20, 177, 220, 43);
	  leftPanel.add(textField);
      
      JButton btn = new JButton("확인");
      btn.setFont(new Font("나눔바른펜", Font.BOLD, 15));
      btn.setBounds(252,177,62,43);
      leftPanel.add(btn);
      
      JButton res = new JButton("맛집");
      res.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      res.setBounds(20,250,300,50);
      leftPanel.add(res);
      
      JButton hotel = new JButton("호텔");
      hotel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      hotel.setBounds(20,350,300,50);
      leftPanel.add(hotel);
      
      JButton cur = new JButton("여가");
      cur.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      cur.setBounds(20,450,300,50);
      leftPanel.add(cur);
		
		res.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new RestaurantPage(mf, loginUser));
	            mf.repaint();
	            mf.setVisible(true);
	            
	         }
	         
	      });
		
		hotel.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new HotelPage(mf, loginUser));
	            mf.repaint();
	            mf.setVisible(true);
	            
	         }
	         
	      });
		
		cur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
				mf.repaint();
				mf.setVisible(true);
				
			}
			
		});

      
      // 오른쪽 패널에 호텔 전체 리스트 출력
      JPanel listPanel = new JPanel();
      //listPanel.setLayout(null);
      listPanel.setBounds(340, 50, 660, 600);
      
      ArrayList<Bank> list = bc.BankListReader();
      JPanel bank = new JPanel();
      bank.setLayout(new GridLayout(17,1));
      JButton[] detail = new JButton[list.size()];
      
      for(int i = 0; i < list.size(); i++) {
         //금융 출력
         bank.add(new JLabel(list.get(i).getName()));
         
         // 금융 리스트 옆 상세정보 버튼
         detail[i] = new JButton("상세정보");
         detail[i].setSize(30,50);
         bank.add(detail[i]);
         listPanel.add(bank);
         
         // 첫번째 호텔 상세정보 버튼 눌렀을 때 -> 패널 넘어가기
         int index = i;
            detail[i].addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                  
                  mf.getContentPane().removeAll();
                  mf.getContentPane().add(new DetailList(mf, index , loginUser));
                  mf.repaint();
                  mf.setVisible(true);
               }
            });
         
               add(listPanel);

      
      
      // 오른쪽 패널 위에 패널 따로 만들고 아이콘 추가
      JPanel btnPanel = new JPanel();
      btnPanel.setLayout(null);
      btnPanel.setBounds(340, 0, 660, 50);
      add(btnPanel);
      
      
      Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
      JButton backBtn = new JButton(backBtnIcon);
	  backBtn.setBounds(12, 4, 42, 42);
	  btnPanel.add(backBtn);
		
	  Icon homeBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
	  JButton homeBtn = new JButton(homeBtnIcon);
	  homeBtn.setBounds(584, 4, 40, 40);
	  btnPanel.add(homeBtn);
		
	  backBtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            mf.getContentPane().removeAll();
	            mf.getContentPane().add(new MainPage(mf, loginUser));
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
      
      // 검색 후 확인 버튼 -> 검색한 호텔 출력(change panel)
      // 작동안됨
      btn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new bankSearchList(mf, textField.getText(), loginUser));
            mf.repaint();
            mf.setVisible(true);
         }
      });      
   }
}
}