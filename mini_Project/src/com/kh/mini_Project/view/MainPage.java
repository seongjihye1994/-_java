package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.mini_Project.model.Person;

public class MainPage extends JPanel {
	private Person loginUser;

   /**
    * Create the panel.
    */
   public MainPage(JFrame mf, Person loginUser) {
	   this.loginUser = loginUser;
      setBackground(new Color(255, 250, 250));
      setLayout(null);
      
      // �������� �г�
      JPanel rightPanel = new JPanel();
      rightPanel.setLayout(null);
      rightPanel.setBackground(new Color(255, 250, 250));
      rightPanel.setBounds(340, 0, 660, 600);
      add(rightPanel);

      JLabel imageLabel = new JLabel("");
      imageLabel.setIcon(new ImageIcon(MainPage.class.getResource("/image/MainPage.jpg")));
      imageLabel.setBounds(0, 0, 660, 600);
      rightPanel.add(imageLabel);
      //imageLabel.setIcon(new ImageIcon(MainPage.class.getResource("/imange/naeun.jpg")));
      
      // ���ư��� ��ư
      JButton returnBtn = new JButton("");
      returnBtn.setBounds(0, 0, 44, 40);
      returnBtn.setOpaque(false);
      returnBtn.setContentAreaFilled(false);
      returnBtn.setBorderPainted(false);
      //returnBtn.setIcon(new ImageIcon(MainPage.class.getResource("/imange/return1.png")));

      returnBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new LoginPage(mf));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      rightPanel.add(returnBtn);
      
      // ������
      JButton foodBtn = new JButton("�� �� ��");
      foodBtn.setForeground(new Color(0, 0, 0));
      foodBtn.setBackground(Color.BLACK);
      foodBtn.setFont(new Font("�����ٸ���", Font.BOLD, 30));
      foodBtn.setBounds(0, 158, 340, 60);
      foodBtn.setOpaque(false);
      foodBtn.setContentAreaFilled(false);
      foodBtn.setBorderPainted(false);

      foodBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new RestaurantPage(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(foodBtn);

      // ����
      JButton lodgmentBtn = new JButton("���� �ü�");
      lodgmentBtn.setForeground(new Color(0, 0, 0));
      lodgmentBtn.setBackground(Color.BLACK);
      lodgmentBtn.setFont(new Font("�����ٸ���", Font.BOLD, 30));
      lodgmentBtn.setBounds(0, 231, 340, 60);
      lodgmentBtn.setOpaque(false);
      lodgmentBtn.setContentAreaFilled(false);
      lodgmentBtn.setBorderPainted(false);
      lodgmentBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new HotelPage(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);

         }
      });

      add(lodgmentBtn);

      // ����
      JButton culture = new JButton("���� �ü�");
      culture.setForeground(new Color(0, 0, 0));
      culture.setBackground(Color.BLACK);
      culture.setFont(new Font("�����ٸ���", Font.BOLD, 30));
      culture.setBounds(0, 304, 340, 60);
      culture.setOpaque(false);
      culture.setContentAreaFilled(false);
      culture.setBorderPainted(false);

      culture.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new CultureCategorySelectPanel(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(culture);

      // ����
      JButton financeBtn = new JButton("���� �ü�");
      financeBtn.setForeground(new Color(0, 0, 0));
      financeBtn.setBackground(Color.BLACK);
      financeBtn.setFont(new Font("�����ٸ���", Font.BOLD, 30));
      financeBtn.setBounds(0, 377, 340, 60);
      financeBtn.setOpaque(false);
      financeBtn.setContentAreaFilled(false);
      financeBtn.setBorderPainted(false);

      financeBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new financePage(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);

         }
      });

      add(financeBtn);

      // ����������
      JButton myPage = new JButton("����������");
      myPage.setForeground(new Color(0, 0, 0));
      myPage.setFont(new Font("�����ٸ���", Font.BOLD, 30));
      myPage.setBackground(Color.BLACK);
      myPage.setBounds(0, 450, 340, 60);
      myPage.setOpaque(false);
      myPage.setContentAreaFilled(false);
      myPage.setBorderPainted(false);

      myPage.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new MypageView(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(myPage);

      JLabel categoryLabel = new JLabel("  Category");
      categoryLabel.setFont(new Font("�����ٸ���", Font.BOLD, 50));
      categoryLabel.setBounds(53, 23, 238, 129);
      add(categoryLabel);

   }
}