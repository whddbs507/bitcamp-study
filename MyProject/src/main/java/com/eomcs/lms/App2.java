package com.eomcs.lms;

import java.util.Scanner;

public class App2 {
  
  final static int size = 5000;
  static int count = 1;
  static int[] no = new int[size];
  static String[] id = new String[size];
  static String[] password = new String[size];
  static String[] passwordRe = new String[size];
  static String[] name = new String[size];
  static String[] email = new String[size];
  
  public static void main(String[] args) {
    inputRegister();
    printRegister();
  }
  
  static void inputRegister() {
    Scanner keyScan = new Scanner(System.in);
    
    for (int i = 0; i < count; i++) {
      no[i] = i + 1;
      System.out.println("아이디를 입력해주세요.");
      id[i] = keyScan.nextLine();
      System.out.println("비밀번호를 입력해주세요.");
      password[i] = keyScan.nextLine();
      System.out.println("비밀번호를 다시 입력해주세요.");
      passwordRe[i] = keyScan.nextLine();
      if (!passwordRe[i].equals(password[i])) {
        System.out.println("틀렸습니다. 다시 입력하세요");
        passwordRe[i] = keyScan.nextLine();
      }
      System.out.println("이름을 입력해주세요.");
      name[i] = keyScan.nextLine();
      System.out.println("이메일을 입력해주세요.");
      email[i] = keyScan.nextLine();
      System.out.println("계속 입력하시겠습니까? (Y/N)");
      String response = keyScan.nextLine();
      if (!response.equalsIgnoreCase("Y")) {
        break;
      }
      count++;
    }
  }
  
  static void printRegister() {

    for (int i = 0; i < count; i++) {
    System.out.printf("%-15d\t %-15s\t %-25s\t %-25s\t %-15s\t %-15s\n",
        no[i], id[i], password[i], passwordRe[i], name[i], email[i]);
    }
  }
}