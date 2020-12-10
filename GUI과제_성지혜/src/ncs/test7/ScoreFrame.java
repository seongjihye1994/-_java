package ncs.test7;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreFrame extends JFrame {
   private JTextField javaTextField;
   private JTextField SQLTextField;
   private JTextField averageTextField;
   private JTextField totalTextField;
   private JButton calcBtn;

   public ScoreFrame() {
      this.setTitle("문제 7");
      this.setSize(1000, 600);
      this.setLocationRelativeTo(null);
      getContentPane().setLayout(null);

      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 482, 353);
      getContentPane().add(panel);
      panel.setLayout(null);

      JLabel textLabel = new JLabel("점수를 입력하세요. : ");
      textLabel.setFont(new Font("굴림", Font.BOLD, 20));
      textLabel.setBounds(0, 0, 482, 85);
      panel.add(textLabel);

      JLabel javaLabel = new JLabel("자바");
      javaLabel.setBounds(10, 80, 40, 18);
      panel.add(javaLabel);

      JLabel SQLLabel = new JLabel("SQL");
      SQLLabel.setBounds(263, 80, 40, 18);
      panel.add(SQLLabel);

      JLabel sumLabel = new JLabel("총점");
      sumLabel.setBounds(14, 227, 28, 18);
      panel.add(sumLabel);

      JLabel agvLabel = new JLabel("평균");
      agvLabel.setBounds(263, 227, 40, 18);
      panel.add(agvLabel);

      javaTextField = new JTextField(5);
      javaTextField.setBounds(44, 77, 58, 24);
      panel.add(javaTextField);
      javaTextField.setColumns(10);

      SQLTextField = new JTextField(5);
      SQLTextField.setColumns(10);
      SQLTextField.setBounds(299, 77, 58, 24);
      panel.add(SQLTextField);

      averageTextField = new JTextField(5);
      averageTextField.setColumns(10);
      averageTextField.setBounds(299, 224, 58, 24);
      panel.add(averageTextField);

      totalTextField = new JTextField(5);
      totalTextField.setColumns(10);
      totalTextField.setBounds(44, 224, 58, 24);
      panel.add(totalTextField);

      calcBtn = new JButton("계산하기");
      calcBtn.setFont(new Font("굴림", Font.BOLD, 15));
      calcBtn.setBounds(156, 147, 105, 27);
      calcBtn.addActionListener(new ScoreFrame$ActionHandler());

      panel.add(calcBtn);

      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public class ScoreFrame$ActionHandler implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {

         int java = Integer.parseInt((javaTextField.getText()));
         int SQL = Integer.parseInt((SQLTextField.getText()));

         int sum = java + SQL;
         int avg = (java + SQL) / 2;

         if (e.getSource() == calcBtn) {
            totalTextField.setText(toString().valueOf(sum));
            averageTextField.setText(toString().valueOf(avg));

         }
      }

   }
}