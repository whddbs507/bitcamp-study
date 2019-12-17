package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class myTest03_1 {
  static int inputBelow = 0;
  public static void main(String[] args) {
    inputBase();
    outputBase();
  }

  static void inputBase() {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("밑변의 길이를 입력하세요! (홀수만 입력)");
    inputBelow = keyScan.nextInt();
  }
  static void outputBase() {
    int m = 0;
    int i = 1;
    int j = 1;
    int a = (inputBelow / 2) + 1;   //4
    int b = 0;   //3-m

    while ( i <= a) {
      m = i - 1;
      b = (inputBelow / 2) - m;
      while ( j <= b) {
        System.out.print(" ");
        j++;
      }
      j = 1;
      while (j <= (2 * i) - 1) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
      j=1;
    }
  }
}

