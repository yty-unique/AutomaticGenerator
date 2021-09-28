package main.problem;

/**
 * 题目接口类
 */
public interface ProblemFactory {

  /**
   * primaryProblem 小学题目生成接口
   */
  void primaryProblem();

  /**
   * middleProblem 初中题目生成接口
   */
  void middleProblem();

  /**
   * highProblem 高中题目生成接口
   */
  void highProblem();
}
