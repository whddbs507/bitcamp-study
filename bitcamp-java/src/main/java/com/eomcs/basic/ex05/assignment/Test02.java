package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test02 {

  static int[] inputArray = new int[5];

  public static void main(String[] args) {
    inputA();
    compareA();
    outputA();
  }

  static void inputA() {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("5개의 값을 입력하세요.");
    inputArray[0] = keyScan.nextInt();
    inputArray[1] = keyScan.nextInt();
    inputArray[2] = keyScan.nextInt();
    inputArray[3] = keyScan.nextInt();
    inputArray[4] = keyScan.nextInt();
  }

  static void compareA() {
    
    int temp = 0;
    for (int i = 0; i < 4; i++) {
      
      for (int j = i+1; j < 5; j++) {
        
        if (inputArray[i] < inputArray[j]) {
          
        } else if (inputArray[i] > inputArray[j]) {
          temp = inputArray[i];
          inputArray[i] = inputArray[j];
          inputArray[j] = temp;
          
        }
      }
    }
  }
  

  static void outputA() {
    System.out.printf("최소값 : %d\n", inputArray[0]);
    System.out.printf("최대값 : %d", inputArray[4]);
  }
}