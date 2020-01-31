// Exception 예외 던지고 받기
package com.eomcs.exception.ex03;

public class Exam0410 {

  static void m1() throws Exception {
    m2();
  }

  static void m2() throws Exception {
    m3();
  }

  static void m3() throws Exception {
    m4();
  }

  static void m4() throws Exception {
    throw new Exception("m4()에서 예외 발생!");
  }

  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}