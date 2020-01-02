// 인스턴스 메서드와 클래스 메서드의 활용 - String 클래스
package com.eomcs.oop.ex04;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s3 = new String("ABC가각");
    System.out.println(s3.getBytes());
    byte[] bytes = s3.getBytes(); 
    for (int i = 0; i < bytes.length; i++)
      System.out.printf("%x,", bytes[i]);
    System.out.println();

    // 다른 인스턴스 메서드를 사용하여 바이트 배열을 추출해보자.
    bytes = s3.getBytes("EUC-KR");
    for (int i = 0; i < bytes.length; i++)
      System.out.printf("%x,", bytes[i]);
    System.out.println();

    // String 클래스에도 특정 인스턴스가 아닌 일반 목적으로 
    // 문자열을 다룰 수 있는 메서드를 제공한다.
    // 즉 "클래스 메서드=스태틱 메서드"를 제공한다.

    // => 형식을 갖춘 문자열을 만들기
    String s4 = String.format("%s님 반갑습니다", "홍길동");
    System.out.println(s4);

    // => 구분자와 문자열들을 파라미터로 받아서 새 문자열을 만든다.
    String s5 = String.join(":", "홍길동", "임꺽정", "유관순");
    System.out.println(s5);

    // => primitive 값을 문자열로 만든다.
    String s6 = String.valueOf(true);
    String s7 = String.valueOf(3.14f);
    String s8 = String.valueOf(100);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);


  }
}





