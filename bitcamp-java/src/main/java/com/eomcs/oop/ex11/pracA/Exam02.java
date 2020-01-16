package com.eomcs.oop.ex11.pracA;

public class Exam02 {
  
  int value;
  class Inner {
    void m() {
      System.out.println(Exam02.this.value);
    }
  }
  
  void setValue(int value) {
    this.value = value;
  }
  
  void test() {
    Inner innerObj = new Inner();
    innerObj.m();
  }
  
  public static void main(String[] args) {
    Exam02 obj = new Exam02();
    obj.setValue(100);
    obj.test();
  }
}