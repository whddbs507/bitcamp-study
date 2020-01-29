package com.eomcs.oop.ex12.prac;

public class Exam0110 {
  
  static interface Calculator {
    int compute(int a, int b);
  }
  
  static class MyCalculator {
    public static int plus(int a, int b) {
      return a + b;
    }

    public static int minus(int a, int b) {
      return a - b;
    }

    public static int multiple(int a, int b) {
      return a * b;
    }

    public static int divide(int a, int b) {
      return a / b;
    }
  }
  
  public static void main(String[] args) {
    Calculator c1 = MyCalculator::plus;
    System.out.println(c1.compute(2, 3));
  }
}