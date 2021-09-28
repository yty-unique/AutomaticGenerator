package main.users;

/**
 * 默认用户类
 */

import java.util.ArrayList;
import java.util.List;
import main.problem.Generate;

public class DefaultUsers {

  /* defaultUser 默认用户列表 */
  private List<User> defaultUser;
  /* defaultName 默认用户名 */
  String[] defaultName = {"张三", "李四", "王五"};
  /* defaultType 默认类型 */
  String[] defaultType = {"小学", "初中", "高中"};
  /* defaultNumber 默认类型中用户默认数量 */
  int defaultNumber = 3;
  /* defaultPasswd 默认密码 */
  String defaultPasswd = "123";
  /* 出题对象实例化 */
  Generate generate;

  /**
   * getDefaultUser 获取用户列表
   *
   * @return 用户列表
   */
  public List<User> getDefaultUser() {
    return defaultUser;
  }

  public void setDefaultUser(List<User> defaultUser) {
    this.defaultUser = defaultUser;
  }

  /**
   * setDefaultUser 设置默认用户列表
   */
  public void initUser() {
    List<User> myUser = new ArrayList<>();
    /* 添加默认用户 */
    for (int i = 0; i < defaultName.length; i++) {
      for (int j = 0; j < defaultNumber; j++) {
        User user = new User(defaultName[i] + (j + 1), defaultPasswd, defaultType[i], generate);
        myUser.add(user);
      }
    }
    setDefaultUser(myUser);
  }
}
