package com.eomcs.prac.ex08;

public class EE extends Object {
  EE() {
    super();
  }
  
  EE(int i) {
    this();
  }
  
  EE(String s) {
    super();    // super 클래스의 생성자나 자신의 생성자나 모두 첫 문장으로 와야하기 때문에
    //this();     // super(), this() 동시에 사용 불가능하다.
  }
  
  EE(int a, int b) {
    //super();  // 수퍼 클래스의 생서자 호출을 생략하면 기본으로 수퍼 클래스의 default 생성자를 호출한다.
  }
}

class EE2 extends EE {
  EE2(int a) {
    // 생성자가 한 개 이상 있으면 컴파일러는 default 생성자를 만들지 않는다.
  }
}

class EE3 extends EE2 {
  EE3() {
    // 슈퍼 클래스에 기본 생성자가 없을 때 개발자가 직접
    // 어떤 슈퍼 클래스의 생성자를 호출할 지 지정해야 한다.
    super(100);     // E2(int) 생성자를 호출한다.
  }
}

class TestEE {
  public static void main(String[] args) {
    EE3 obj;
    obj = new EE3();
    // 생성자 호출은 EE3() 생성자부터 상위 클래스로 따라 올라가면서 호출한다.
    // 결국 실행은 상위 클래스의 생성자부터 실행하면서 내려온다.
  }
}