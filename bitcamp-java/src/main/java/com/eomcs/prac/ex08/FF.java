package com.eomcs.prac.ex08;

public class FF extends Object {
  int a;
  void m1() {
    
  }
  
}

class FF2 extends FF {
  int b;
  void m2() {
    
  }
}

class FF3 extends FF2 {
  int c;
  void m3() {
    
  }
}

class TestFF {
  public static void main(String[] args) {
    // 다형적 변수
    // => 참조 변수는 하위 클래스의 인스턴스 주소를 저장할 수 있다.
    // => 레퍼런스는 하위 (클래스의) 객체를 가리킬 수 있다.
    FF obj1 = new FF();
    obj1 = new FF2();
    obj1 = new FF3();
    
    FF2 obj2 = new FF2();
    obj2 = new FF3();
  }
}