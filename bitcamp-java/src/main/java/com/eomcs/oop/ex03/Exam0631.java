package com.eomcs.oop.ex03;

public class Exam0631 {

  static class A {
    A() {
      System.out.println("A()");
    }
    
    A(int a) {
      System.out.println("A(int)");
      this.a = a;
    }
    {
      a = 200;
      System.out.println("초기화 블록");
    }
    int a = 100;
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println(obj1.a);
    
    System.out.println("-------------------");
    
    A obj2 = new A(1111);
    System.out.println(obj2.a);
  }
}