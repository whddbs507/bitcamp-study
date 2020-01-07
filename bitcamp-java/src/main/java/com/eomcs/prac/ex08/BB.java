package com.eomcs.prac.ex08;

public class BB {
  // field
  static int a;     // 클래스 필드 = 스태틱 필드
  String b;         // 인스턴스 필드 = 논스태틱 필드
  
  // method
  static void m1() {    // 클래스 메서드 = 스태틱 메서드
    
  }
  int m2() {            // 인스턴스 메서드 = 논스태틱 메서드
    return 0;
  }
  
  // initializer block
  static {      // 스태틱 블록
    
  }
  {             // 인스턴스 블록
    
  }
  
  // constructor (생성자)
  BB() {
    
  }
  
  // nested class
  static class B1 {
    
  }
  class B2 {
    
  }
}
