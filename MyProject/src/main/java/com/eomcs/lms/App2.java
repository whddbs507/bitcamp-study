package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class App2 {
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.printf("번호 : ");
    String no = keyboard.nextLine();
    System.out.printf("이름 : ");
    String name = keyboard.nextLine();
    System.out.printf("이메일 : ");
    String email = keyboard.nextLine();
    System.out.printf("암호 : ");
    String password = keyboard.nextLine();
    System.out.printf("사진 : ");
    String picture = keyboard.nextLine();
    System.out.printf("전화 : ");
    String tel = keyboard.nextLine();
    keyboard.close();
    
    Date joinDate = new Date(System.currentTimeMillis());
    
    System.out.printf("");
    System.out.printf("번호: %s\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", picture);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", joinDate);
    
    
  }
}
