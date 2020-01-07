package com.eomcs.prac.ex08;

import com.eomcs.prac.sub.HH2;

public class HH extends Object {
  private int a;    // 클래스 내부
  int b;            // 클래스 내부 + 같은 패키지
  protected int c;  // 클래스 내부 + 같은 패키지 + 자식 클래스
  public int d;     // 모두 접근 가능!
}

class HH3 extends HH2 {
  void m1() {
    HH2 obj2 = new HH2();
    
    // obj2.a = 100;
    // obj2.b = 100;
    // obj2.c = 100;  // protected 멤버는
                      // 멤버의 사용권을 가진 서브 클래스에서 접근할 수 있다.
    obj2.d = 100;
  
  HH3 obj3 = new HH3();
  // obj3.a = 100;
  // obj3.b = 100;
  obj3.c = 100;
  obj3.d = 100;
  }
}

class TestHH {
  public static void main(String[] args) {
    HH obj = new HH();
    // obj.a = 100;
    obj.b = 100;
    obj.c = 100;
    obj.d = 100;
    
    HH2 obj2 = new HH2();
    // obj2.a = 100;
    // obj2.b = 100;
    // obj2.c = 100;
    obj2.d = 100;
  }
}