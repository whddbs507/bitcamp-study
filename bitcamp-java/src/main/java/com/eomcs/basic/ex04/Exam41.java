package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {
    // 문자 변수
    short s;  // -32768 ~ 32767
    char c;   // 문자이므로 양수만 가능 < 0~65535 >

    s = -32768;
    s = 32767;

    c = 0;
    c = 65535;

    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    int d1 = 65;
    int d2 = 0x41;
    int d3 = 0b0100_0001;
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);

    char c4 = 'A';    // 문자에 부여된 ucs-2 코드 값
    System.out.println(c4);   // char 출력

    int i1 = 'A';
    System.out.println(i1);   // int 출력
    i1 = i1 + 10;
    System.out.println(i1);  
    System.out.println((char)i1);   // 형변환 (int -> char)    

    for (int i = 65; i < 'A' + 26; i++) {
      System.out.println(i);    // int i 출력
      System.out.println((char)i);    // 형변환으로 인한 char i 출력
    }

    for (char j = 0x0041; j < 0x0066; j++) {
      System.out.println(j);
    }
  }
}