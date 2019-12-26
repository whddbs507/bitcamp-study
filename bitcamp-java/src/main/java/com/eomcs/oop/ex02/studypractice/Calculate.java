package com.eomcs.oop.ex02.studypractice;

public class Calculate {
  
  int result = 0;
  
  static void sum(Calculate cal, int num) {
    cal.result += num;
  }
  static void sub(Calculate cal, int num) {
    cal.result -= num;
  }
  static void mul(Calculate cal, int num) {
    cal.result *= num;
  }
  static void div(Calculate cal, int num) {
    cal.result /= num;
  }
}