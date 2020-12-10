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

import com.kh.mini_Project.controller.RestaurantsController;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.model.Restaurant;
import com.kh.mini_Project.view.RestaurantDetaillist.DetailRestaurant;

public class RestaurantPage extends JPanel{
    private RestaurantsController bc = new RestaurantsController();
      private Person loginUser;
      
      public RestaurantPage(JFrame mf, Person loginUser) {
         this.setSize(1000,600);
         this.setLayout(null);
          
         // Í∏∞Î≥∏ Ï¢åÏ∏°  å® Ñê óê Í≤  Éâ Í∏∞Îä•  ò¨Î¶¨Í∏∞
         JPanel leftPanel = new JPanel();
         leftPanel.setLayout(null);
         leftPanel.setBounds(0, 0, 340, 600);
         leftPanel.setBackground(Color.orange);
         add(leftPanel);
         
         JLabel label2 = new JLabel("¿ΩΩƒ¡°");
         label2.setBounds(128,36,112,50);
         label2.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.PLAIN, 34));
         leftPanel.add(label2);
         
         
         JLabel label = new JLabel("∞Àªˆ");
         label.setBounds(111, 127, 100, 50);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.BOLD, 20));
         leftPanel.add(label);
         
        JTextField textField = new JTextField(15);
         textField.setBounds(20, 177, 220, 43);
        leftPanel.add(textField);
         
         JButton btn = new JButton("»Æ¿Œ");
         btn.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.BOLD, 15));
         btn.setBounds(252,177,62,43);
         leftPanel.add(btn);
         
         JButton res = new JButton("»£≈⁄");
         res.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.BOLD, 20));
         res.setBounds(20,250,300,50);
         leftPanel.add(res);
         
         JButton fin = new JButton("±›¿∂");
         fin.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.BOLD, 20));
         fin.setBounds(20,350,300,50);
         leftPanel.add(fin);
         
         JButton cur = new JButton("ø©∞° ");
         cur.setFont(new Font("≥™¥ÆπŸ∏•∆Ê", Font.BOLD, 20));
         cur.setBounds(20,450,300,50);
         leftPanel.add(cur);
         
         res.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                  mf.getContentPane().removeAll();
                  mf.getContentPane().add(new HotelPage(mf, loginUser));
                  mf.repaint();
                  mf.setVisible(true);
                  
               }
               
            });
         
         fin.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                  mf.getContentPane().removeAll();
                  mf.getContentPane().add(new financePage(mf, loginUser));
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

         
         //  ò§Î•∏Ï™Ω  å® Ñê óê  ò∏ Öî  †Ñ“˙  Î¶¨Ïä§ ä∏ Ï∂úÎ†•
         JPanel listPanel = new JPanel();
         //listPanel.setLayout(null);
         listPanel.setBounds(340, 50, 660, 600);
         
         ArrayList<Restaurant> list = bc.restaurantListReader();
         JPanel Restaurant = new JPanel();
         Restaurant.setLayout(new GridLayout(17,1));
         JButton[] detail = new JButton[list.size()];
         
         for(int i = 0; i < list.size(); i++) {
            //Í∏àÏúµ Ï∂úÎ†•
            Restaurant.add(new JLabel(list.get(i).getfName()));
            
            // Í∏àÏúµ Î¶¨Ïä§ ä∏  òÜ  ÉÅ Ñ∏ †ïÎ≥  Î≤ÑÌäº
            detail[i] = new JButton("ªÛºº¡§∫∏ ");
            detail[i].setSize(30,50);
            Restaurant.add(detail[i]);
            listPanel.add(Restaurant);
            
            // “˙´Î≤à◊Ÿ   ò∏ Öî  ÉÅ Ñ∏ †ïÎ≥  Î≤ÑÌäº  àå   ùÑ  ïå ->  å® Ñê  Ñò ñ¥Í∞ Í∏ 
            int index = i;
               detail[i].addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                     
                     mf.getContentPane().removeAll();
                     mf.getContentPane().add(new DetailRestaurant(mf, index , loginUser));
                     mf.repaint();
                     mf.setVisible(true);
                  }
               });
            
                  add(listPanel);

         
         
         //  ò§Î•∏Ï™Ω  å® Ñê  úÑ óê  å® Ñê  î∞Î°  ◊∫åÎì§Í≥   ïÑ ù¥ÏΩ  Ï∂îÍ 
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
         
         // Í≤  Éâ  õÑ  ôï ù∏ Î≤ÑÌäº -> Í≤  Éâ ïú  ò∏ Öî Ï∂úÎ†•(change panel)
         //  ûë èô ïà ê®
         btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
               mf.getContentPane().removeAll();
               mf.getContentPane().add(new RestaurantSerch(mf, textField.getText(), loginUser));
               mf.repaint();
               mf.setVisible(true);
            }
         });      
      }
   }
   }    