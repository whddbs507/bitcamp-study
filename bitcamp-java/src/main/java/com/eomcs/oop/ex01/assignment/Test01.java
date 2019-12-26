package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01{
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    final int SIZE = 100;
    String[] name = new String[SIZE];
    int[] kor = new int[SIZE];
    int[] eng = new int[SIZE];
    int[] math = new int[SIZE];
    String response;
    int count = 1;
    int j = 0;
    System.out.println("이름, 국어, 영어, 수학을 입력하세요");
    do {
        System.out.print("입력: ");
        name[j] = keyScan.next();
        kor[j] = keyScan.nextInt();
        eng[j] = keyScan.nextInt();
        math[j] = keyScan.nextInt();
        keyScan.nextLine();
        System.out.println("더 입력하실래요? (Y/n)");
      count++; 
      j++;
      response = keyScan.nextLine();
    }while(response.equalsIgnoreCase("Y"));
    


    for (int i = 0; i < count - 1; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %d\n"
          , name[i], kor[i], eng[i], math[i], kor[i] + eng[i] + math[i], (kor[i] + eng[i] + math[i])/3);
    }
  }
}