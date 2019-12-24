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
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의길이?  ");
    System.out.print("");
    // 직삼각형을 출력한다.
    int base = keyScan.nextInt();
    keyScan.close();
    int cc = base;
    printTriangle(base, cc);
  }
  
  static void printTriangle(int base, int cc) {
    for (int i = cc; i >= base; i--) {
      System.out.print("*");
    }
    System.out.println();
        
    if (base == 1) {
      return;
    } else {
      printTriangle(base-1, cc);
    }
  }
}




