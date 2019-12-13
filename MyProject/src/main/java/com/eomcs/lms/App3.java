package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {
  
  final static int size = 5000;
  static int[] no = new int[size];
  static String[] contents = new String[size];
  static int viewCount = 0;
  static int count = 1;
  static Date[] today = new Date[size];
  
  public static void main(String[] args) {
    inputBoard();
    printBoard();
  }
  
  static void inputBoard() {
    Scanner keyScan = new Scanner(System.in);
    String response = "";
    
    for (int i = 0; i < count; i++) {
      no[i] = i + 1;
      System.out.println("내용을 입력하세요.");
      contents[i] = keyScan.nextLine();
      today[i] = new Date(System.currentTimeMillis());
      System.out.println("계속 입력하시겠습니까? (Y/N)");
      response = keyScan.nextLine();
      if(!response.equalsIgnoreCase("Y")) {
        break;
      }
      count++;
    }
    keyScan.close();
  }
  
  static void printBoard() {
    for (int i = 0; i < count; i++) {
      System.out.printf("%15d %15s %20s %15s\n", no[i], contents[i], today[i], viewCount);
    }
  }
}