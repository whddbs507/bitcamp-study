package com.eomcs.oop.ex11.pracA;

public class Exam0110 {
  static int sValue;
  static void sm() {
    
  }
  int iValue;
  void im() {
    
  }
  static class A {
    void m1() {
      sValue = 100;
      // iValue = 100;
      sm();
    }
    
    void m2() {
      A obj;
      obj = new A();
    }
  }
}
