package com.eomcs.prac.ex08;

public class GG extends Object {
  int a;
  void m1() {
    
  }
}

class GG2 extends GG {
  int b;
  
  void m2() {
    
  }
  
  void m2(int a) {  // 오버로딩 : 같은 일을 하는 메서드에 대해 같은 이름을 부여.
    
  }
  
  @Override
  void m1() {       // 오버라이딩 : 상속 받은 메서드를 서브 클래스의 역할에 맞게 재정의.
    
  }
  
  void m1(int a) {  // 오버로딩 : 상속받은 메서드에 대해서도 오버로딩 가능
    
  }
}

class GG3 extends GG2 {
  int c;
  void m3() {
    
  }
  
  @Override
  void m1() {   // 오버라이딩
    
  }
}

class TestG {
  public static void main(String[] args) {
    GG3 obj1 = new GG3();
    obj1.m1();     // G3의 m1() 호출
    
    GG obj2 = new GG3();
    obj2.m1();
    
    GG obj3 = new GG();
    obj3.m1();
  }
}