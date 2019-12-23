package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;
// 과제: 재귀호출을 이용하여 직삼각형을 출력하라.
// 실행)
// 밑변의 길이? 5
// *
// **
// ***
// ****
// *****
//
public class Test051 {

  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    System.out.print("밑변의길이?  ");
    // 직삼각형을 출력한다.
    Scanner keyScan = new Scanner(System.in);
    int base = keyScan.nextInt();
    int cc = base;
    printTriangle(base, cc);
  }
  
  static void printTriangle(int base, int cc) {
    for (int i = cc; i >= base; i--) {
      System.out.print("*");
    }
    System.out.println();
    base = base - 1;
    
    if (base == 0) {
      return;
    } else {
      printTriangle(base, cc);
    }
  }
}





