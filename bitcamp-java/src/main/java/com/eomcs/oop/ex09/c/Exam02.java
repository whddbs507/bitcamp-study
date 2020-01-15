package com.eomcs.oop.ex09.c;

public class Exam02 implements B, C {
  public static void main(String[] args) {
    Exam02 obj = new Exam02();
    B obj2 = obj;
    obj2.m1();
    obj2.m2();
    C obj3 = obj;
    obj3.m3();
  }
  public void m1() {}
  public void m2() {}
  public void m3() {}
}
