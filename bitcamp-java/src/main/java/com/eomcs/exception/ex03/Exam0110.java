package com.eomcs.exception.ex03;

public class Exam0110 {
  static void m() {
    throw new RuntimeException("예외가 발생했습니다.");
  }
  
  public static void main(String[] args) {
    try {
      m();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
