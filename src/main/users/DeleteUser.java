package main.users;

/**
 * 删除用户类
 */

public class DeleteUser {

  boolean flag = false;

  public DeleteUser(DefaultUsers defaultUsers, String name) {
    for (int i = 0; i < defaultUsers.getDefaultUser().size(); i++) {
      if (defaultUsers.getDefaultUser().get(i).getName().equals(name)) {
        defaultUsers.getDefaultUser().remove(i);
        flag = true;
      }
    }
    if (!flag) {
      System.out.println("该用户不存在！");
    } else {
      System.out.println("已删除！");
    }
  }
}
