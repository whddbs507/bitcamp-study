package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test01 {
  
  static int input1 = 0;
  static int input2 = 0;
  static int rangeSum = 0;
  
  public static void main(String[] args) {
    inputSum();
    outputSum();
  }
  
  static void inputSum() {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.println("입력?");
    input1 = keyScan.nextInt();
    input2 = keyScan.nextInt();
    
    for (int i = input1; i < (input2 + 1); i++) {
      rangeSum = rangeSum + i;
    }
  }
  
  static void outputSum() {
    System.out.printf("%d에서 %d까지의 합은 %d입니다.", input1, input2, rangeSum);
  }
}
