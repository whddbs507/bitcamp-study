package com.eomcs.oop.ex08.test;

public class J2 {

  // Student와 Teacher의 공통 분모를 뽑아서 수퍼 클래스를 정의
  
  class Student extends Member{
    int grade;
    boolean working;
    
    @Override
    void print() {
      System.out.println("학생 정보");
    }
  }

  class Teacher extends Member{
    String email;
    String pwd;
    String name;
    String tel;
    int pay;
    String major;

    void print() {
      System.out.println("강사 정보");
    }
  }
}