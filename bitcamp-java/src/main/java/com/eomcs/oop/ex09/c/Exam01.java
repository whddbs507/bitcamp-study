package com.eomcs.oop.ex09.c;

public class Exam01 implements B {
  public static void main(String[] args) {
    Exam01 obj = new Exam01();
    A objA = obj;
    objA.m1();
    // objA.m2();
    B objB = obj;
    objB.m1();
    objB.m2();
    obj.m1();
    obj.m2();
    obj.x1();
    
  }
  
  public void m1() {}
  public void m2() {}
  void x1() {}
  void x2() {}
  
}
