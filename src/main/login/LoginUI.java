package main.login;

import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUI {

  public LoginUI() {
    /* 初始化窗体 */
    JFrame loginStart = new JFrame("背景图片测试");
    loginStart.setSize(400, 700);
    loginStart.setLocationRelativeTo(null);//居中显示

    /* 设置背景图片 */
    ImageIcon background = new ImageIcon("images/background.jpeg");// 背景图片
    JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面
    label.setBounds(0, 0, loginStart.getWidth(), loginStart.getHeight());
    JPanel imagePanel = (JPanel) loginStart.getContentPane();// 把内容窗格转化为JPanel
    imagePanel.setOpaque(false);//用方法setOpaque()来使内容窗格透明
    imagePanel.setLayout(new FlowLayout());// 内容窗格默认的布局管理器为BorderLayout
    loginStart.getLayeredPane().setLayout(null);
    loginStart.getLayeredPane()
        .add(label, Integer.valueOf(Integer.MIN_VALUE));// 把背景图片添加到分层窗格的最底层作为背景

    /* 设置界面欢迎语 */
    JLabel welcomeJlable = new JLabel("欢迎来到数学答题生成系统");
    imagePanel.setLayout(null);
    welcomeJlable.setFont(new Font("微软雅黑",0,25));
    welcomeJlable.setForeground(Color.CYAN);
    welcomeJlable.setBounds(50,150,300,90);

    /* 添加账号面板 */
    JTextField userName = new JTextField();
    userName.setSize(150,20);
    imagePanel.setLayout(null);
    userName.setBounds(100,250,190,30);
    imagePanel.add(userName);

    /* 添加密码面板 */
    JPasswordField passWord = new JPasswordField();
    passWord.setSize(150,20);
    imagePanel.setLayout(null);
    passWord.setBounds(100,290,190,30);
    imagePanel.add(passWord);

    imagePanel.add(welcomeJlable);
    loginStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    loginStart.setResizable(false);
    loginStart.setVisible(true);
  }
}