package main.login;
/**
 * 用户类
 */

import java.util.Scanner;
import main.users.DefaultUsers;

public class Login {

  /* 用户信息 */
  static String userInformation;
  /* 用户信息数组 */
  static String[] userArr;
  /* 是否允许登录 */
  boolean allowIn;

  /* 新建输入对象 */
  Scanner in = new Scanner(System.in);

  /**
   * 用户名及密码输入
   */
  public void exeInput() {
    /* 初始化每一次的输入 */
    allowIn = false;
    /* 输入用户信息 */
    userInformation = in.nextLine();
    if ("-1".equals(userInformation)) {
      System.exit(0);
    }
    userArr = userInformation.split(" ");
  }

  /**
   * 用户鉴权
   *
   * @param defaultUsers 用户列表
   */
  public Login(DefaultUsers defaultUsers) {
    System.out.print("请输入您的用户名和密码(以空格分隔):");
    while (!allowIn) {
      exeInput();
      for (int i = 0; i < defaultUsers.getDefaultUser().size(); i++) {
        if (defaultUsers.getDefaultUser().get(i).getName().equals(userArr[0])) {
          if (defaultUsers.getDefaultUser().get(i).getPasswd().equals(userArr[1])) {
            allowIn = true;
          }
        }
      }
      if (!allowIn) {
        System.out.print("请输入正确的的用户名和密码:");
      }
    }
  }
}
