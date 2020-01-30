package com.eomcs.exception.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0210 {
  
  static void m(int i) throws Exception {
    if (i == 0) {
      throw new Exception();
    }
    if (i == 1) {
      throw new RuntimeException();
    }
    if (i == 2) {
      throw new SQLException();
    } else {
      throw new IOException();
    }
  }
  
  public static void main (String[] args) throws Exception {
    try {
      m(0);
    } catch(RuntimeException | SQLException | IOException e) {
      System.out.println("catch 1");
    } catch(Exception e) {
      System.out.println("catch 2");
    } finally {
      System.out.println("finally");
    }
  }
}