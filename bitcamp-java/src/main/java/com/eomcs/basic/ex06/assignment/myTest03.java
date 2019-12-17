package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class myTest03 {
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
    int i = 1;
    int j = 1;
    int s = 1;
    int m = 0;
    int t = (inputBelow / 2) + 1;  
    int a = 0;
    int b = 0;
    int c = 0;

    while (i <= t) {
      m = i - 1;
      a = (inputBelow / 2) + 1;  
      b = (inputBelow / 2) - m;   //    3   2   1
      c = (inputBelow / 2) + m;   //    3   4   5    

      switch (s) {
        case 1:
          while (s <= b) {
            System.out.print(" ");
            j++;
            s++;
            
          }
          j = 1;

        default:
          while (j <= 2 * i - 1) {
            System.out.print("*");
            j++;
            s++;
          }

      }
      s = 1;
      j = 1;
      System.out.println();
      i++;
    }

  }
}

