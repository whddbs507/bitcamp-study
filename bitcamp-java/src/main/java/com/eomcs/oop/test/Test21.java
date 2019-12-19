package com.eomcs.oop.test;

public class Test21 {
  static class Member{
    int no;
    String name;
    int birthYear;
    boolean gender;
    float height;
    float weight;
    boolean personalTraining;
  }
  public static void main(String[] args) {


    // 인스턴스 주소 주고 받기

    // 1) 인스턴스 주소 받기
    Member m1;
    m1 = createMember();

    // 2) 인스턴스의 주소 넘기기
    setMemberValues(m1);

    printMember(m1);
  }
  // static유무 return타입 클래스name(레퍼런스변수) {
  static Member createMember() {  
    Member m = new Member();
    return m;
  }
  static void setMemberValues(Member m) {
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;
  }
  static void printMember(Member m) {
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);
  }
}