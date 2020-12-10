package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.mini_Project.model.Person;

public class SignUpPage extends JPanel {
   private JTextField pwdText;
   private JTextField pwdCheckText;
   private JTextField nameText;
   private JTextField ageText;
   private JTextField idText;

   public SignUpPage(JFrame mf) {
      setLayout(null);
      
      JLabel idLabel = new JLabel("���̵�");
      idLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      idLabel.setBounds(460, 38, 401, 31);
      add(idLabel);
      
      idText = new JTextField();
      idText.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
      idText.setColumns(10);
      idText.setBounds(460, 82, 401, 31);
      add(idText);
      
      JLabel pwdLabel = new JLabel("��� ��ȣ");
      pwdLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      pwdLabel.setBounds(460, 126, 127, 31);
      add(pwdLabel);
      
      pwdText = new JTextField();
      pwdText.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
      pwdText.setBounds(460, 170, 401, 31);
      add(pwdText);
      pwdText.setColumns(10);
      
      JLabel pwdCheckLabel = new JLabel("��� ��ȣ Ȯ��");
      pwdCheckLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      pwdCheckLabel.setBounds(463, 222, 151, 31);
      add(pwdCheckLabel);
      
      pwdCheckText = new JTextField();
      pwdCheckText.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
      pwdCheckText.setColumns(10);
      pwdCheckText.setBounds(463, 266, 401, 31);
      add(pwdCheckText);
      
      JLabel nameLabel = new JLabel("�� ��");
      nameLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      nameLabel.setBounds(465, 313, 145, 31);
      add(nameLabel);
      
      nameText = new JTextField();
      nameText.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
      nameText.setColumns(10);
      nameText.setBounds(464, 357, 401, 31);
      add(nameText);
      
      
      JLabel ageLabel = new JLabel("�� ��");
      ageLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      ageLabel.setBounds(465, 404, 127, 31);
      add(ageLabel);
      
      ageText = new JTextField();
      ageText.setFont(new Font("�����ٸ���", Font.PLAIN, 20));
      ageText.setColumns(10);
      ageText.setBounds(465, 448, 401, 31);
      add(ageText);
      
      JPanel leftPanel = new JPanel();
      leftPanel.setBackground(new Color(0, 0, 0));
      leftPanel.setBounds(0, 0, 333, 599);
      add(leftPanel);
      leftPanel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("SignUp");
      lblNewLabel.setBounds(72, 245, 191, 82);
      lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
      lblNewLabel.setFont(new Font("�����ٸ���", Font.BOLD, 70));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      leftPanel.add(lblNewLabel);

      JButton inserBtn = new JButton("Ȯ ��");
      inserBtn.setOpaque(false);
      inserBtn.setContentAreaFilled(false);
      inserBtn.setBorderPainted(false);
      inserBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      inserBtn.setBounds(497, 492, 145, 57);
      inserBtn.addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            // ȸ�� ���� �Է°� �޾ƿ�
            String inputId = idText.getText();
            String inputPwd = pwdText.getText();
            String inputPwdCheck = pwdCheckText.getText();
            String inputName = nameText.getText();
            String inputAge = ageText.getText();
            
            // ȸ�� ���� ���Է� ��
            if (inputId.isEmpty()) {
               JOptionPane.showMessageDialog(null, "ȸ�������� �Է��ϼ���.");
               return;
            }

            // ��й�ȣ, 2�� ��й�ȣ ��
            if (!inputPwd.equals(inputPwdCheck)) {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٸ��ϴ�.");
               return;
            }
            // fileSave
            try (BufferedWriter file = new BufferedWriter(new FileWriter("user.txt", true))) {

               String contents = inputId + ", " + inputPwd + ", " + inputName + ", " + inputAge;
               file.write(contents);
               file.newLine();

               JOptionPane.showMessageDialog(null, " ȸ�������� �Ǿ����ϴ�! �α����ϼ���!");

               mf.getContentPane().removeAll();
               mf.getContentPane().add(new LoginPage(mf));
               mf.repaint();
               mf.setVisible(true);

            } catch (IOException e1) {
               e1.printStackTrace();
            }
         }
      });
      add(inserBtn);
    
      JButton returnBtn = new JButton("���ư���");
      returnBtn.setOpaque(false);
      returnBtn.setContentAreaFilled(false);
      returnBtn.setBorderPainted(false);
      returnBtn.addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new LoginPage(mf));
            mf.repaint();
            mf.setVisible(true);
         }

      });
      returnBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      returnBtn.setBounds(695, 492, 145, 57);
      add(returnBtn);
      
   }
}