package com.kh.mini_Project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.mini_Project.controller.LoginController;
import com.kh.mini_Project.model.Person;

public class LoginPage extends JPanel {

	private Person loginUser;
   LoginController lc = new LoginController();

   private JTextField idText;
   private JPasswordField pwdText;
   private JTextField textField;

   public LoginPage(JFrame mf) {
      setLayout(null);

      // ���̵��
      JLabel idLabel = new JLabel("���̵�");
      idLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      idLabel.setBounds(465, 186, 187, 54);

      // ���̵��ؽ�Ʈ�ʵ�
      JTextField id = new JTextField(10);
      id.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      id.setBounds(465, 243, 411, 59);
      add(idLabel);
      add(id);

      // ��й�ȣ��
      JLabel pwdLabel = new JLabel("��� ��ȣ");
      pwdLabel.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      pwdLabel.setBounds(465, 312, 187, 54);

      // ��й�ȣ�ؽ�Ʈ�ʵ�
      JPasswordField pwd = new JPasswordField();
      pwd.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      pwd.setBounds(465, 363, 411, 59);
      add(pwdLabel);
      add(pwd);

      // �α��ι�ư
      JButton loginBtn = new JButton("�α���");
      loginBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      loginBtn.setBounds(465, 460, 174, 43);
      loginBtn.setOpaque(false);
      loginBtn.setContentAreaFilled(false);
      loginBtn.setBorderPainted(false);

      // �α��ι�ư �̺�Ʈ
      loginBtn.addMouseListener(new MouseAdapter() {

         // ��ư Ŭ�� �� �̺�Ʈ
         @Override
         public void mouseClicked(MouseEvent e) {
            String inputId = id.getText();
            char[] inputPwd = pwd.getPassword();

            if (inputId.isEmpty()) {
               JOptionPane.showMessageDialog(null, "���̵� Ȥ�� ��й�ȣ�� �Է��ϼ���");
               return;
            }

            // id pwd �޾Ƽ� LoginController�� �Ѱܼ� üũ
            //boolean checkYn = lc.loginCheck(inputId, inputPwd);
            Person loginUser = lc.loginCheck(inputId, inputPwd);
            if (loginUser != null) {
               JOptionPane.showMessageDialog(null, " �α����� �Ǿ����ϴ�! ");
            } else {
               JOptionPane.showMessageDialog(null, " ���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ");
               return;
            }
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new MainPage(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);
         }

      });

      add(loginBtn);
      
      // ���ư����ư
      JButton returnBtn = new JButton("ȸ������");
      returnBtn.setFont(new Font("�����ٸ���", Font.BOLD, 20));
      returnBtn.setBounds(702, 460, 174, 43);
      returnBtn.setOpaque(false);
      returnBtn.setContentAreaFilled(false);
      returnBtn.setBorderPainted(false);

      // ���ư��� ��ư �̺�ư
      returnBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 1. ���� �������� �����̳ʸ� ���� ��� ���� �����
            mf.getContentPane().removeAll();
            // 2. ���� �������� �����̳ʿ� �̵��ϰ��� �ϴ� �г��� �߰��Ѵ�
            mf.getContentPane().add(new SignUpPage(mf));
            // 3. �ٽ� �׸���
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(returnBtn);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(255, 255, 255));
      panel.setBounds(0, 0, 340, 598);
      
      Icon backBtnIcon = new ImageIcon(
				"C:\\Users\\scybj\\eclipse-workspace\\nc_java\\mini_Project\\src\\image\\mainPageImage.jpg");
	  JButton backBtn = new JButton(new ImageIcon(LoginPage.class.getResource("/image/MainPage.jpg")));
	  backBtn.setBounds(0, 0, 340, 598);
	  panel.add(backBtn);
      
      add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("New label");
      lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/image/MainPage.jpg")));
      lblNewLabel.setBounds(67, 213, 101, 72);
      panel.add(lblNewLabel);
      
      JLabel welLabel = new JLabel("    Welcome!");
      welLabel.setFont(new Font("�����ٸ���", Font.BOLD, 70));
      welLabel.setBounds(465, 71, 380, 89);
      add(welLabel);
     
   }
}