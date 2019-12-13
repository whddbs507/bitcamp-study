package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("첫 번째 값을 입력하세요");
    int a1 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("두 번째 값을 입력하세요");
    int a2 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("연산자를 입력하세요.");
    String ss = keyboard.nextLine();

    if (ss.equals("+")) {
      System.out.printf("%d + %d = %d \n", a1, a2, a1+a2);
      
    } else if (ss.equals("-")) {
      System.out.printf("%d - %d = %d \n", a1, a2, a1-a2);
    } else if (ss.equals("*")) {
      System.out.printf("%d / %d = %d \n", a1, a2, a1*a2);
    } else if (ss.equals("/")) {
      System.out.printf("%d / %d = %d \n", a1, a2, a1/a2);
    }

    keyboard.close();
  }
}

