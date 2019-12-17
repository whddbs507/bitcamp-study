package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test02_final {
  
  final static int size = 5050;
  static int[] inputInt = new int[size];
  static int minOutput = 0;
  static int maxOutput = 0;
  static int countOutput = 0;
  static int i = 0;
  
  public static void main(String[] args) {
    inputA();
    calculateA();
    outputA();
  }

  static void inputA() {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.println("값을 입력하세요.");
 
    while(true) {
      inputInt[i] = keyScan.nextInt();
      if ((char)inputInt[i].equals("aa")) {
        
      }
    }
    
  }
  static void calculateA() {

  }
  static void outputA() {
    System.out.printf("입력받은 수 : %d", countOutput);
    System.out.printf("최소 값 : %d", minOutput);
    System.out.printf("최대 값 : %d", maxOutput);
  }
}