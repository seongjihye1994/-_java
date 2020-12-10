package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.mini_Project.controller.FinancialController;
import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.FinanceDetail.backDetailReal.DetailList;

public class bankSearchList extends JPanel{
   private FinancialController bc = new FinancialController();
   public bankSearchList(JFrame mf, String keyword, Person loginUser) {
      
      this.setSize(1000,600);
      this.setLayout(null);
                 
      JPanel leftPanel = new JPanel();
      leftPanel.setLayout(null);
      leftPanel.setBounds(0, 0, 340, 600);
      leftPanel.setBackground(Color.orange);
      add(leftPanel);
      
      JLabel searchLabel = new JLabel("검색한 은행 결과");
      searchLabel.setBounds(73, 93, 213, 24);
      leftPanel.add(searchLabel);
      searchLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      searchLabel.setBackground(Color.WHITE);
      
      //오른쪽 패널
      JPanel newPanel = new JPanel();
      newPanel.setBackground(Color.WHITE);
      newPanel.setBounds(341, 0, 659, 600);
      add(newPanel);
      newPanel.setLayout(null);
      
      JPanel sListPanel = new JPanel();
      sListPanel.setBounds(0, 70, 659, 530);
      sListPanel.setBackground(Color.WHITE);
      newPanel.add(sListPanel);
      
      ArrayList<Bank> bank = bc.BankListReader();
      //Bank b = new Bank();
      
      for(int i=0; i < bank.size();i++) {
    	  int index = i;
         if(bank.get(i).getName().contains(keyword)) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new DetailList(mf, index, loginUser));
            mf.repaint();
            mf.setVisible(true);
         } 
      }
   }
}