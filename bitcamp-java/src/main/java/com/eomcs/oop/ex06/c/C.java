package com.eomcs.oop.ex06.c;

public class C {
  private void m1() {}      // 현재 클래스에서만 접근 가능
  void m2() {}              // (default) : 현재 클래스 + 같은 패키지 소속 클래스 + 서브 클래스              
  protected void m3() {}    // 현재 클래스 + 같은 패키지 클래스 + 자식 클래스
  public void m4() {}       // public 접근 범위 : 모두
}
