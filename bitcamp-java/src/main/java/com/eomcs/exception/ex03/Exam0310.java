// 예외 처리 후 마무리 작업 - finally 블록
package com.eomcs.exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0310 {

  static void m(int i) 
      throws Exception, RuntimeException, SQLException, IOException {
    if (i < 0)
      return;

    if (i == 0)
      throw new Exception();
    else if (i == 1)
      throw new RuntimeException();
    else if (i == 2) 
      throw new SQLException("안뇽~");
    else 
      throw new IOException();
  }

  static void test1() throws Exception {
    try {
      m(2);
    }
    finally {
      // try 블록을 나가기 전에 무조건 실행해야 할 작업이 있다면 
      // catch 블록이 없어도 finally 블록만 사용할 수 있다.
      System.out.println("정상적인 실행일 때!");
    }
  }

  static void test2() throws Exception {
    try {
      m(0);
    } finally {
      System.out.println("Exception 예외가 발생했을 때!");
    }
  }

  public static void main(String[] args) {
    try { 
      test1(); 
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try { 
      test2(); 
      } catch (Exception e) {
      }
  }
}