package org.apache.ibatis.reflection.factory;


public class Test01 implements Test {


  public void test01() {
    System.out.println(1);
  }

  @Override
  public void test01(String name) {
    System.out.println(name);
  }
}
