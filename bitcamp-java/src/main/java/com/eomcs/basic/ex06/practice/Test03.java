package com.eomcs.basic.ex06.practice;

import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    
    int inputBelow = Graphic.inputInt();
    
    for (int i = 1; i <= (inputBelow / 2) + 1; i++) {
      Graphic.drawLine(((inputBelow / 2) + 1) - i, ' ');
      Graphic.drawLine(2 * i - 1, '%');
      System.out.println();
    }
  }
}
