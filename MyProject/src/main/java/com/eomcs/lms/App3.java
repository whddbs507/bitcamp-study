package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    System.out.printf("번호: ");
    String no = keyboard.nextLine();
    System.out.printf("내용: ");
    String contents = keyboard.nextLine();
    System.out.printf("조회수: ");
    String views = keyboard.nextLine();
    
    Date createdDay = new Date(System.currentTimeMillis());
    
    System.out.printf("번호: %s\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", createdDay);
    System.out.printf("조회수: %s\n", views);
    
    keyboard.close();
  }
}