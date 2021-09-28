package main.users;

import main.problem.Generate;

public class User {

  /* name 用户名 */
  private String name;
  /* passwd 密码 */
  private String passwd;
  /* type 用户类型 */
  private String type;
  /* 出题方法 */
  private Generate generate;

  public User(String name, String passwd, String type, Generate generate) {
    this.name = name;
    this.passwd = passwd;
    this.type = type;
    this.generate = generate;
  }

  /**
   * setName 设置用户名
   *
   * @param name 用户名
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * setPasswd 设置密码
   *
   * @param passwd 密码
   */
  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  /**
   * setType 设置类型
   *
   * @param type 类型
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * 出题方法
   *
   * @param generate 工厂类
   */
  public void setGenerate(Generate generate) {
    this.generate = generate;
  }

  /**
   * 获取用户名
   *
   * @return 用户名
   */
  public String getName() {
    return name;
  }

  /**
   * 获取密码
   *
   * @return 密码
   */
  public String getPasswd() {
    return passwd;
  }

  /**
   * 获取用户类型
   *
   * @return 用户类型
   */
  public String getType() {
    return type;
  }

  /**
   * 获取出题方法
   *
   * @return 工厂类
   */
  public Generate getGenerate() {
    return generate;
  }

}
