package com.eomcs.oop.ex11.pracA;

public class Exam03 {
  
  int value;
  class Inner {
    void m() {
      System.out.println(Exam03.this.value);
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
    Exam03 obj = new Exam03();
    obj.setValue(200);
    Inner obj2 = obj.new Inner();
  }
}