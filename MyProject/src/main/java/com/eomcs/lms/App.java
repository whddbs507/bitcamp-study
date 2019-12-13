package com.eomcs.lms;

import java.util.Scanner;

public class App {
  
  final static int size = 5000;
  static int count = 1;
  static int[] no = new int[size];
  static String[] manufacturer = new String[size];
  static String[] startSaleDate = new String[size];
  static String[] endSaleDate = new String[size];
  static String[] expirationDate = new String[size];
  static int[] price = new int[size];
  
  public static void main(String[] args) {
    inputItem();
    printItem();
  }
  
  static void inputItem() {
    Scanner keyScan = new Scanner(System.in);
    
    for (int i = 0; i < count; i++) {
      no[i] = i + 1;
      System.out.println("제조사를 입력해주세요.");
      manufacturer[i] = keyScan.nextLine();
      System.out.println("판매 시작일을 입력해주세요.");
      startSaleDate[i] = keyScan.nextLine();
      System.out.println("판매 종료일을 입력해주세요.");
      endSaleDate[i] = keyScan.nextLine();
      System.out.println("유통기한을 입력해주세요.");
      expirationDate[i] = keyScan.nextLine();
      System.out.println("금액을 입력해주세요.");
      price[i] = keyScan.nextInt();
      keyScan.nextLine(); 
      System.out.println("계속 입력하시겠습니까? (Y/N)");
      String response = keyScan.nextLine();
      if (!response.equalsIgnoreCase("Y")) {
        break;
      }
      count++;
    }
  }
  
  static void printItem() {

    for (int i = 0; i < count; i++) {
    System.out.printf("%-15d\t %-15s\t %-25s\t %-25s\t %-15s\t %-15d\n",
        no[i], manufacturer[i], startSaleDate[i], endSaleDate[i], expirationDate[i], price[i]);
    }
  }
}