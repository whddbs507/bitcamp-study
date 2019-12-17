package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class myTest01 {
  static int base = 0;
  
  public static void main(String[] args) {
    inputBase();
    outputBase();
  }
  
  static void inputBase() {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.println("밑변 개수를 설정해주세요!");
    base = keyScan.nextInt();
  }
  static void outputBase() {
    int i = 1; 
    int j = 1;
    
    while (i <= base) {      
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
      j = 1;
    }
  }
}