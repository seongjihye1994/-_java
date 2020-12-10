package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.mini_Project.controller.MyPageController;
import com.kh.mini_Project.model.Person;

public class WelcomPage extends JPanel {
   
   MyPageController controller = new MyPageController();
   Person person = new Person();
   private ImageIcon icon;

   public WelcomPage(JFrame mf) {
      setBackground(SystemColor.window);
      setForeground(Color.WHITE);
      setLayout(null);
      setSize(1000, 600);

      JLabel loginLabel = new JLabel("   Welcome!");
      loginLabel.setBounds(12, 61, 307, 129);
      add(loginLabel);
      loginLabel.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 55));

      JPanel rightPanel = new JPanel();
      rightPanel.setBounds(322, 0, 689, 599);
      add(rightPanel);
      rightPanel.setLayout(null);

      JLabel imageLabel = new JLabel("");
      imageLabel.setBounds(-26, -96, 1584, 812);
      rightPanel.add(imageLabel);
      
      JLabel label = new JLabel("");
      label.setIcon(new ImageIcon(WelcomPage.class.getResource("/image/MainPage.jpg")));
      label.setBounds(0, 0, 677, 599);
      rightPanel.add(label);


      // ·Î±¸ÀÎ
      JButton login = new JButton("·Î±×ÀÎ");
      login.setBounds(62, 222, 202, 57);
      login.setBackground(new Color(0, 0, 0));
      login.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 20));
      login.setForeground(new Color(255, 255, 255));

      login.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new LoginPage(mf));
            mf.repaint();
            mf.setVisible(true);

         }
      });

      add(login);

      // È¸¿ø °¡ÀÔ
      JButton SignUp = new JButton("È¸¿ø °¡ÀÔ");
      SignUp.setBounds(62, 316, 202, 57);
      SignUp.setForeground(new Color(255, 255, 255));
      SignUp.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 20));
      SignUp.setBackground(new Color(0, 0, 0));

      SignUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new SignUpPage(mf));
            mf.repaint();
            mf.setVisible(true);

         }
      });

      add(SignUp);

      // ³ª°¡±â
      JButton exit = new JButton("³ª°¡±â");
      exit.setBounds(62, 406, 202, 57);
      exit.setForeground(new Color(255, 255, 255));
      exit.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 20));
      exit.setBackground(new Color(0, 0, 0));

      exit.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            mf.dispose();

         }
      });

      add(exit);

   }

}