package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test02_2 {

  static int[] inputNo = new int[5];
  static int minOutput = Integer.MAX_VALUE;
  static int maxOutput = Integer.MIN_VALUE;

  public static void main(String[] args) {
    inputA();
    outputA();
  }

  static void inputA() {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("숫자 5개를 입력해주세요");
    for ( int i = 0; i < 5; i++) {
      inputNo[i] = keyScan.nextInt();
      if (inputNo[i] < minOutput) {
        minOutput = inputNo[i];
      } else if (inputNo[i] > maxOutput) {
        maxOutput = inputNo[i];
      }
      
    }
    keyScan.close();
  }

  static void outputA() {
    System.out.printf("최소값 : %d, 최대값 : %d", minOutput, maxOutput);
  }
}