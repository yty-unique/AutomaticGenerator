package main;

import main.login.Login;
import main.login.LoginUI;
import main.users.*;
/**
 * 程序主类
 */
public class AutomaticGenerator {

  public static void main(String[] args) {
    new LoginUI();
    DefaultUsers defaultUsers = new DefaultUsers();
    defaultUsers.initUser();
    /* login 用户鉴权 */
    Login login = new Login(defaultUsers);
    /* 删除用户 */
    DeleteUser deleteUser = new DeleteUser(defaultUsers, "张三1");
    /* 添加用户 */
    AddUser addUser = new AddUser(defaultUsers, "yty", "初中");
    /* 输出所有用户信息 */
    for (int i = 0; i < defaultUsers.getDefaultUser().size(); i++) {
      System.out.println(
          defaultUsers.getDefaultUser().get(i).getName() + " " + defaultUsers.getDefaultUser()
              .get(i).getType());
    }
  }
}
