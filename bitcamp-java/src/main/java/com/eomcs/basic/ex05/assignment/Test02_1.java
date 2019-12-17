package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test02_1 {

  static int[] inputNo = new int[5];
  static int minOutput = 0;
  static int maxOutput = 0;

  public static void main(String[] args) {
    inputA();
    outputA();
  }

  static void inputA() {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("숫자 5개를 입력해주세요");
    for ( int i = 0; i < 5; i++) {
      inputNo[i] = keyScan.nextInt();
      if (i == 0) {
        minOutput = inputNo[0];
        maxOutput = inputNo[0];
      }
      if (inputNo[i] < minOutput) {
        minOutput = inputNo[i];
      } else if (inputNo[i] > maxOutput) {
        maxOutput = inputNo[i];
      }
      keyScan.close();
    }
  }

  static void outputA() {
    System.out.printf("최소값 : %d, 최대값 : %d", minOutput, maxOutput);
  }
}