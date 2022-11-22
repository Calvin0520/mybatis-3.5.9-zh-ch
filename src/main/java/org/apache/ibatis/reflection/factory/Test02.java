package org.apache.ibatis.reflection.factory;

import org.apache.ibatis.reflection.Reflector;

public class Test02 extends Test01 implements Test {

  @Override
  public void test02() {
    System.out.println(2);
  }

  public static void main(String[] args) {
    Reflector reflector = new Reflector(Test02.class);
  }
}
