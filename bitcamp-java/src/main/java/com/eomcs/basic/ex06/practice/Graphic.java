package com.eomcs.basic.ex06.practice;

import java.util.Scanner;

public class Graphic {
  
  static int inputInt() {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("밑변 길이?");
    int input = keyScan.nextInt();
    
    return input;
  }
  
  static void drawLine(int length, char ch) {
    for (int j = 1; j <= length; j++) {
      System.out.print(ch);
    }
  }
}