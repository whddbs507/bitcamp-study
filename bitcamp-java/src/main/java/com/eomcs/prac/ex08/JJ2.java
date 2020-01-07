package com.eomcs.prac.ex08;

public class JJ2 {
  
  // Student와 Teacher의 공통 분모를 뽑아서 슈퍼 클래스를 정의 
  // => Generalization
  
  class Member {
    String email;
    String pwd;
    String name;
    String tel;
    
    void print() {
      System.out.println("회원 정보");
    }
  }
  
  // 대신 기존 클래스는 슈퍼 클래스를 상속받는다.
  class Student extends Member {
    int grade;
    boolean working;
    
    @Override
    void print() {
      System.out.println("학생 정보");
    }
  }
  
  class Teacher extends Member {
    int pay;
    String major;
    
    @Override
    void print() {
      System.out.println("강사 정보");
    }
  }
}