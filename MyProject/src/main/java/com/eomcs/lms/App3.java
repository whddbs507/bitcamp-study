package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    Date writeDay = new Date(System.currentTimeMillis());
    
    System.out.printf("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    System.out.printf("내용? ");
    String contents = keyboard.nextLine();
    int count = 0;
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", writeDay);
    System.out.printf("조회수: %s\n", count);
  }
}