package com.eomcs.oop.ex08.test;

import com.eomcs.oop.ex08.test.sub.H2;

public class H extends Object {
  private int a;
  int b;
  protected int c;
  public int d;
}
class TestH {
  public static void main(String[] args) {
    H obj = new H();  // D3가 상속하고 있는 수퍼 클래스의 인스턴스 변수까지 생성한다.
    obj.d = 100;
    obj.c = 100;        
    obj.b = 100;        
    // obj.a = 100;     
    
    H2 obj2 = new H2();
    // obj2.a = 100;
    // obj2.b = 100;
    obj2.c = 100;   // H2 클래스로 만들었기 떄문에 H3에 사용권이 없다.
    // protected 멤버는
    // 서브 클래스의 멤버인 경우만 접근할 수 있다.
    obj2.d = 100;
    
    H3 obj3 = new H3();
    // obj3.a = 100;
    // obj3.b = 100;
    obj3.c = 100;
  }
}