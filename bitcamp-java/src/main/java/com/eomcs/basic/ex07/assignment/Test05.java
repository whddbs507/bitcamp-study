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
public class Test05 {
  static Scanner keyScan = new Scanner(System.in);
  static int base = keyScan.nextInt();
  static int temp = base;
  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    System.out.print("입력?  ");
    // 직삼각형을 출력한다.
    System.out.println();
    printTriangle(base);
  }
  
  static void printTriangle(int base) {
    int j = temp;
    for (int i = j; i >= base; i--) {
      System.out.print("*");
    }
    System.out.println();
    base = base - 1;
    
    if (base == 0) {
    } else {
      printTriangle(base);
    }
  }
}





