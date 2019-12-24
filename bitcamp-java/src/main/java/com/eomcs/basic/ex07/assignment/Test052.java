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
public class Test052 {

  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의길이?  ");
    System.out.print("");
    // 직삼각형을 출력한다.
    int base = keyScan.nextInt();
    keyScan.close();
    printTriangle(base);
  }
  
  static void printTriangle(int base) {
        
    if (base == 0) {
      return;
    } else {
      printTriangle(base-1);
    }
    for (int i = 0; i < base; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}





