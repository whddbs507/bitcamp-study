package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class myTest02 {
  static int length = 0;
  public static void main(String[] args) {
    inputBase();
    outputBase();
  }

  static void inputBase() {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("마름모 중앙의 길이를 입력해주세요!");
    length = keyScan.nextInt();
  }

  static void outputBase() {
    int i = 1;
    int j = 1;

    while (i <= ( 2 * length - 1)) {
      if (i <= length) {
        while (j <= i) {
          System.out.print("*");
          j++;
        }
      }else if (i > length) {
        while (j <= 2 * length - i) {
          System.out.print("*");
          j++;
          }
        }
      System.out.println();
      i++;
      j = 1;
      }
    }
  }