package com.eomcs.oop.ex08.test;

public class J3 {

  public static void main(String[] args) {
    Student s = new Student();
    Teacher t = new Teacher();
    // Member m = new Member();    // 추상 클래스는 인스턴스를 생성할 수 없다.
  }
  // 보통 Generalization을 통해 정의한 수퍼 클래스는 직접 사용할 일이 없기 때문에
  // 추상클래스로 정의하여 직접 사용하지 않게 만든다.
  
  abstract class Member() {
    
  }
}