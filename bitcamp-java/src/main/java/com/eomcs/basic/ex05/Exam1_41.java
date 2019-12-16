// 산술 연산자 : 연산의 결과 타입  
package com.eomcs.basic.ex05;

public class Exam1_41 {
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    float r = i / j; // int와 int의 연산 결과는 항상 int이다.
    // 따라서 r 변수에 넣기 전에 
    // 이미 결과는 정수 2가 된다.
    // 정수 2를 float 변수에 넣으면 
    // 출력할 때 2.0이 된다.
    System.out.println(r);

  }
}