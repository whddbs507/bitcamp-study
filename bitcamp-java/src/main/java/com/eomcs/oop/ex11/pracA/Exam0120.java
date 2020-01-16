package com.eomcs.oop.ex11.pracA;

import com.eomcs.oop.ex11.pracA.Exam0120_X.B;

class Exam0120_X {
  static int sValue = 0;
  
  static class A {
    
  }
  class B {
    void m() {
      
    }
  }
}

public class Exam0120 {
  
  public static void main(String[] args) {
    Exam0120_X.sValue = 100;
    
    Exam0120_X.A obj;
    obj = new Exam0120_X.A();
    
    Exam0120_X bb = new Exam0120_X();
    B obj2 = bb.new B(); 
    obj2.m();
  }
}
