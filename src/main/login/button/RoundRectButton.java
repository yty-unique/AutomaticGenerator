package main.login.button;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.Border;

class RoundBorder implements Border {

  public Insets getBorderInsets(Component c) {
    return new Insets(0, 0, 0, 0);
  }

  public boolean isBorderOpaque() {
    return false;
  }

  public void paintBorder(Component c, Graphics g, int x, int y,
      int width, int height) {
    //使用黑色在组件的外边缘绘制一个圆角矩形
    g.setColor(Color.BLACK);
    g.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 10, 10);
  }
}

public class RoundRectButton extends JButton {

  public RoundRectButton(String s) {
    super(s);
    setMargin(new Insets(0, 0, 0, 0));//去除文字与按钮的边沿
    setBorder(new RoundBorder());//圆角矩形边界
    setContentAreaFilled(false);//取消原先画矩形的设置
    setBorderPainted(false);//会导致按钮没有明显边界
    setFocusPainted(false);//去除文字周围的虚线框
  }

  protected void paintComponent(Graphics g) {
    if (getModel().isArmed()) {
      g.setColor(Color.LIGHT_GRAY);//按下后按钮变成绿色
    } else {
      g.setColor(getBackground());
    }
    g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 10, 10);//填充圆角矩形边界
    // 这个调用会画一个标签和焦点矩形。
    super.paintComponent(g);
  }
}
