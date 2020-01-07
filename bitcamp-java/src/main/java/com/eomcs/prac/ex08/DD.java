package com.eomcs.prac.ex08;

public class DD extends Object {
  int a;
}

class DD2 extends DD {
  int b;
}

class DD3 extends DD2 {
  int c;
}

class TestDD {
  public static void main(String[] args) {
    DD3 obj = new DD3();
    obj.c = 100;
    obj.b = 100;
    obj.a = 100;
  }
}