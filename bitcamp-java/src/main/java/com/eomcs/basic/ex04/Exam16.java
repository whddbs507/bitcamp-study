package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    // 변수의 종류 (primitive data type, reference)

    // => primitive data type(자바 원시 데이터 타입)

    byte b; // 1바이트 크기를 갖는 메모리
    short s;  // 2바이트
    int i;  // 4바이트
    long l;  // 8바이트

    float f;  // 4바이트
    double d;  // 8바이트

    boolean bool;  // jvm에서 int로 취급 (4바이트)

    char c;  // 2바이트

    
    // => reference(레퍼런스) : 다른 메모리의 주소를 저장하는 변수

    String str;
    Thread t;
    java.sql.Date date;
    java.net.Socket socket;

  }
}