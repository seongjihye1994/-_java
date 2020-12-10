package com.kh.mini_Project.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
   public MainFrame() {
      this.setTitle("손안에 강남");
      this.setSize(1000, 600);
      this.setLocationRelativeTo(null);
      this.getContentPane().add(new LoginPage(this));
      
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}