package com.eomcs.exception.ex01;

public class Exam0110 {
  public static void main(String[] args) {
    int result = Calculator.compute("-", 100, 200);
    System.out.println(result);
    int result2 = Calculator.compute("/", 3, 0);
    System.out.println(result2);
  }
}
