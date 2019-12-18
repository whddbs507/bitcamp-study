package com.eomcs.basic.ex06.practice;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    int inputBelow = Graphic.inputInt();

    for (int i = 1; i <= (2 * inputBelow) - 1; i++) {
      if (i <= inputBelow) {
        Graphic.drawLine(i, '#');
      } else {
        Graphic.drawLine((2 * inputBelow) - i, '$');
      }
      System.out.println();
    }
  }
}
