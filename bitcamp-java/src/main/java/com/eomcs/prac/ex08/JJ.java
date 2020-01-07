package com.eomcs.prac.ex08;

public class JJ {
  class Student {
    String email;
    String pwd;
    String name;
    String tel;
    int grade;
    boolean working;
    
    void print() {
      System.out.println("학생 정보");
    }
  }
  
  class Teacher {
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