package com.ohoracs.basic.ex03;

// 리터럴(literal)
// - 자바 언어에서 값을 표기하는 문법
public class Exam1 {
  public static void main(String[] args) {
    // 정수 리터럴
    System.out.println(78);  // 10진수 표기법
    // 78이 정수 리터럴이다.
    System.out.println(+78);  // 10진수 표기법
    System.out.println(-78);  // 10진수 표기법

    System.out.println(0116);  // 8진수 표기법 (0부터 시작하면 8진수)
    System.out.println(-0116);  // 8진수 표기법

    System.out.println(0x4e);  // 16진수 표기법 (0x부터 시작하면 16진수)
    System.out.println(-0x4e);  // 16진수 표기법

    System.out.println(0b01001110);  // 2진수 표기법 (0b부터 시작하면 2진수)
    System.out.println(-0b01001110);  // 2진수 표기법
    // 부동소수점 리터럴
    System.out.println(3.14);  // 고정소수점
    System.out.println(0.314e1);   // 부동소수점 (0.314 * 10의1승)
    System.out.println(31.4e-1);   // 부동소수점
    // 논리 리터럴
    System.out.println(true);
    System.out.println(false);
    // 문자 리터럴
    System.out.println('A');
    System.out.println('가');

    // 문자열 리터럴
    System.out.println("안녕하세요. 비트캠프!");
  }
}
