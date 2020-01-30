package com.eomcs.exception.ex01;

public class Exam0120 {
  public static void main(String[] args) {
    try {
      int result = Calculator.compute("#", 100, 0);
      System.out.println(result);
    } catch (RuntimeException e){
      System.out.println(e.getMessage());
    }
  }
}