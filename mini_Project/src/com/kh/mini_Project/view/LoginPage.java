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

      // 아이디라벨
      JLabel idLabel = new JLabel("아이디");
      idLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      idLabel.setBounds(465, 186, 187, 54);

      // 아이디텍스트필드
      JTextField id = new JTextField(10);
      id.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      id.setBounds(465, 243, 411, 59);
      add(idLabel);
      add(id);

      // 비밀번호라벨
      JLabel pwdLabel = new JLabel("비밀 번호");
      pwdLabel.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      pwdLabel.setBounds(465, 312, 187, 54);

      // 비밀번호텍스트필드
      JPasswordField pwd = new JPasswordField();
      pwd.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      pwd.setBounds(465, 363, 411, 59);
      add(pwdLabel);
      add(pwd);

      // 로그인버튼
      JButton loginBtn = new JButton("로그인");
      loginBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      loginBtn.setBounds(465, 460, 174, 43);
      loginBtn.setOpaque(false);
      loginBtn.setContentAreaFilled(false);
      loginBtn.setBorderPainted(false);

      // 로그인버튼 이벤트
      loginBtn.addMouseListener(new MouseAdapter() {

         // 버튼 클릭 시 이벤트
         @Override
         public void mouseClicked(MouseEvent e) {
            String inputId = id.getText();
            char[] inputPwd = pwd.getPassword();

            if (inputId.isEmpty()) {
               JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 입력하세요");
               return;
            }

            // id pwd 받아서 LoginController로 넘겨서 체크
            //boolean checkYn = lc.loginCheck(inputId, inputPwd);
            Person loginUser = lc.loginCheck(inputId, inputPwd);
            if (loginUser != null) {
               JOptionPane.showMessageDialog(null, " 로그인이 되었습니다! ");
            } else {
               JOptionPane.showMessageDialog(null, " 아이디 혹은 비밀번호가 틀렸습니다. ");
               return;
            }
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new MainPage(mf, loginUser));
            mf.repaint();
            mf.setVisible(true);
         }

      });

      add(loginBtn);
      
      // 돌아가기버튼
      JButton returnBtn = new JButton("회원가입");
      returnBtn.setFont(new Font("나눔바른펜", Font.BOLD, 20));
      returnBtn.setBounds(702, 460, 174, 43);
      returnBtn.setOpaque(false);
      returnBtn.setContentAreaFilled(false);
      returnBtn.setBorderPainted(false);

      // 돌아가기 버튼 이벤튼
      returnBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 1. 메인 프레임의 컨테이너를 얻어와 모든 값을 지운다
            mf.getContentPane().removeAll();
            // 2. 메인 프레임의 컨테이너에 이동하고자 하는 패널을 추가한다
            mf.getContentPane().add(new SignUpPage(mf));
            // 3. 다시 그린다
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
      welLabel.setFont(new Font("나눔바른펜", Font.BOLD, 70));
      welLabel.setBounds(465, 71, 380, 89);
      add(welLabel);
     
   }
}