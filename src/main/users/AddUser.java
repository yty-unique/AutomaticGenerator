package main.users;

import main.problem.Generate;

/**
 * 删除用户类
 */

public class AddUser {

  boolean flag = false;
  Generate generate;//出题对象实例化

  public AddUser(DefaultUsers defaultUsers, String name, String type) {
    for (int i = 0; i < defaultUsers.getDefaultUser().size(); i++) {
      if (defaultUsers.getDefaultUser().get(i).getName().equals(name)) {
        flag = true;
        break;
      }
    }
    if (flag) {
      System.out.println("该用户已经存在！");
    } else {
      defaultUsers.getDefaultUser().add(new User(name, defaultUsers.defaultPasswd, type, generate));
    }
  }
}
