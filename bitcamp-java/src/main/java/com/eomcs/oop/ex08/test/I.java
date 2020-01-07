package com.eomcs.oop.ex08.test;

import com.eomcs.oop.ex08.test.sub.H2;

public class I extends Object {
  private int a;
  int b;
  protected int c;
  public int d;
}
class TestI {
  public static void main(String[] args) {
    I obj = new I();
    // obj.a = 100;
    // obj.b = 100;
    
    obj.setA(100);
    obj.setA(100);
  }
}