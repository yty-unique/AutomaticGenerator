package main.login.pages;

import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.login.button.RoundRectButton;

public class Register {

  public Register() {
    /* 初始化窗体 */
    JFrame loginStart = new JFrame("数学试卷生成系统");
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
    imagePanel.setLayout(null);

    /* 页面提示 */
    JLabel welcomeJlable = new JLabel("注  册");
    welcomeJlable.setFont(new Font("微软雅黑", 0, 25));
    welcomeJlable.setForeground(Color.CYAN);
    welcomeJlable.setBounds(170, 130, 300, 90);

    /* 添加账号面板 */
    JLabel userID = new JLabel("账号");
    userID.setForeground(Color.white);
    userID.setBounds(75, 200, 190, 30);
    userID.setFont(new Font("微软雅黑", 0, 18));
    JTextField userName = new JTextField();
    userName.setSize(150, 20);
    userName.setBounds(120, 200, 190, 30);
    userName.setFont(new Font("微软雅黑", 0, 16));
    imagePanel.add(userID);
    imagePanel.add(userName);

    /* 添加密码面板 */
    JLabel userPasswd = new JLabel("密码");
    userPasswd.setForeground(Color.white);
    userPasswd.setBounds(75, 240, 190, 30);
    userPasswd.setFont(new Font("微软雅黑", 0, 18));
    JPasswordField passWord = new JPasswordField();
    passWord.setSize(150, 20);
    passWord.setBounds(120, 240, 190, 30);
    passWord.setFont(new Font("微软雅黑", 0, 18));
    imagePanel.add(userPasswd);
    imagePanel.add(passWord);

    /* 确认密码 */
    JLabel repeatPasswd = new JLabel("确认密码");
    repeatPasswd.setForeground(Color.white);
    repeatPasswd.setBounds(38, 280, 190, 30);
    repeatPasswd.setFont(new Font("微软雅黑", 0, 18));
    JPasswordField repeatWord = new JPasswordField();
    repeatWord.setBounds(120, 280, 190, 30);
    repeatWord.setFont(new Font("微软雅黑", 0, 18));
    imagePanel.add(repeatPasswd);
    imagePanel.add(repeatWord);

    /* 验证码 */
    JLabel verificationPasswd = new JLabel("验证码");
    verificationPasswd.setForeground(Color.white);
    verificationPasswd.setBounds(58, 320, 190, 30);
    verificationPasswd.setFont(new Font("微软雅黑", 0, 18));
    JTextField verificationWord = new JTextField();
    verificationWord.setBounds(120, 320, 80, 30);
    verificationWord.setFont(new Font("微软雅黑", 0, 18));
    imagePanel.add(verificationPasswd);
    imagePanel.add(verificationWord);

    /* 获取验证码按钮 */
    RoundRectButton obtain = new RoundRectButton("获取验证码");
    obtain.setFont(new Font("微软雅黑", 0, 14));
    obtain.setBounds(210, 320, 100, 30);
    obtain.setForeground(Color.WHITE);
    obtain.setBackground(new Color(0, 191, 255));
    imagePanel.add(obtain);

    /* 添加登陆注册按钮 */
    RoundRectButton determine = new RoundRectButton("注   册");
    determine.setFont(new Font("微软雅黑", 0, 14));
    determine.setBounds(100, 360, 180, 30);
    determine.setForeground(Color.WHITE);
    determine.setBackground(new Color(0, 191, 255));
    imagePanel.add(determine);

    imagePanel.add(welcomeJlable);
    loginStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    loginStart.setResizable(false);
    loginStart.setVisible(true);
  }
}