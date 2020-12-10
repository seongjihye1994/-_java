package com.kh.mini_Project.view.RestaurantDetaillist;

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

import com.kh.mini_Project.controller.RestaurantsController;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.model.Restaurant;
import com.kh.mini_Project.view.MainPage;
import com.kh.mini_Project.view.RestaurantPage;




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

import com.kh.mini_Project.controller.FinancialController;
import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.MainPage;
import com.kh.mini_Project.view.financePage;

public class DetailRestaurant extends JPanel {
   private RestaurantsController rc = new RestaurantsController();
   private JFrame mainFrame;
   private ArrayList<Restaurant> list = rc.restaurantListReader();

   public DetailRestaurant(JFrame mf, int index, Person loginUser) {
      mainFrame = mf;
      this.setSize(1000, 600);
      this.setLayout(null);

      JPanel leftPanel = new JPanel(); 
      leftPanel.setLayout(null);
      leftPanel.setBounds(0, 0, 340, 600);
      leftPanel.setBackground(Color.orange);
      add(leftPanel);
      
      // ¿ÞÂÊ ÆÐ³Î À§¿¡ Áñ°ÜÃ£±â ¹öÆ° Ãß°¡
      JButton favorite = new JButton("Áñ°ÜÃ£±â Ãß°¡");
      favorite.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.BOLD, 15));
      favorite.setBounds(20,200,300,50);
      leftPanel.add(favorite);
      
      // Áñ°ÜÃ£±â ¹öÆ°À» ´­·¶À» ¶§
      favorite.addMouseListener(new MouseAdapter() {

		@Override
		public void mouseClicked(MouseEvent e) {
						
			// ÇöÀç ·Î±×ÀÎµÇ¾î ÀÖ´Â UserÀÇ Bank Áñ°ÜÃ£±â ¸®½ºÆ®¿¡ ÇØ´ç ÀÎµ¦½º ³Ñ¹ö¸¦ Ãß°¡
			// BankÁñ°ÜÃ£±â -> Person °´Ã¼¿¡ Ãß°¡
			loginUser.getFavoriteRestaurant().add(list.get(index));
			System.out.println(loginUser.getFavoriteRestaurant());
			
			mf.setVisible(true);
		}
	});
      
      

      JLabel label = new JLabel(list.get(index).displayOn());
      label.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 14));
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setBounds(0, 84, 340, 16);
      leftPanel.add(label);

      JPanel btnPanel = new JPanel();
      btnPanel.setLayout(null);
      btnPanel.setBounds(340, 0, 660, 50);
      add(btnPanel);

      Icon backBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\backBtn.png");
      JButton backBtn = new JButton(backBtnIcon);
      backBtn.setBounds(6, 6, 42, 42);
      btnPanel.add(backBtn);

      Icon homeBtnIcon = new ImageIcon("C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\homeBtn.png");
      JButton homeBtn = new JButton(homeBtnIcon);
      homeBtn.setBounds(604, 6, 40, 40);
      btnPanel.add(homeBtn);

      backBtn.addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new RestaurantPage(mf, loginUser));
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
      
      JPanel detailPanel = new JPanel();
      detailPanel.setBounds(340, 50, 660, 191);
      panel.add(detailPanel);
      detailPanel.setLayout(null);
      
      JLabel nameL = new JLabel("ÁöÁ¡¸í   :  "+list.get(index).getfName());
      nameL.setHorizontalAlignment(SwingConstants.LEFT);
      nameL.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
      nameL.setBounds(50, 21, 248, 16);
      detailPanel.add(nameL);
      
      JLabel phoneL = new JLabel("ÁöÁ¡ ¿¬¶ôÃ³  :  "+list.get(index).getfTeleNumber());
      phoneL.setHorizontalAlignment(SwingConstants.LEFT);
      phoneL.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
      phoneL.setBounds(50, 47, 616, 16);
      detailPanel.add(phoneL);
      
      JLabel addressL = new JLabel("ÁÖ¼Ò  :  "+list.get(index).getAddress());
      addressL.setBounds(50, 73, 428, 16);
      addressL.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
      detailPanel.add(addressL);
      
      JPanel mapPanel = new JPanel();
      mapPanel.setBounds(340, 241, 660, 359);
      panel.add(mapPanel);
      mapPanel.setLayout(null);
      
      JLabel map = new JLabel("Áöµµ");
      map.setBounds(50, 0, 61, 16);
      map.setFont(new Font("³ª´®¹Ù¸¥Ææ", Font.PLAIN, 15));
      mapPanel.add(map);
      
      JLabel map2 = new JLabel();
      if(list.get(index)==list.get(0)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant.png")));
      } else if (list.get(index)==list.get(1)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant1.png")));
      } else if (list.get(index)==list.get(2)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant2.png")));
      } else if (list.get(index)==list.get(3)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant3.png")));
      } else if (list.get(index)==list.get(4)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant4.png")));
      } else if (list.get(index)==list.get(5)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant5.png")));
      } else if (list.get(index)==list.get(6)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant6.png")));
      } else if (list.get(index)==list.get(7)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant7.png")));
      } else if (list.get(index)==list.get(8)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant8.png")));
      } else if (list.get(index)==list.get(9)) {
         map2.setIcon(new ImageIcon(DetailRestaurant.class.getResource("/image/Restaurant/DetailRestaurant9.png")));
      } 
      
      map2.setBounds(50, 30, 400, 300);
      mapPanel.add(map2);
   }
}