package com.eomcs.basic.ex06.practice;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    int inputBelow = Graphic.inputInt();

    for (int i = 1; i <= inputBelow; i++) {
      Graphic.drawLine(i, '@');
      System.out.println();
    }
  }
}