package org.apache.ibatis.reflection.factory;

public interface Test {

  /**
   * 默认方法
   */
  default void test() {
    System.out.println(0);
  }

  /**
   * 父类重写默认方法
   */
  default void test01() {
    System.out.println(-1);
  };

  /**
   * 父类重写方法
   */
  void test01(String name);

  /**
   * 子类重写方法
   */
  default void test02() {
    System.out.println(2);
  }

}
