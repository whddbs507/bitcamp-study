package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App{
  
  public static void main(String[] args) {

    // 키보드에서 사용자가 입력한 값을 읽어 
    // 문자열이나 정수, 부동소수점 등으로 리턴하는 역할
    Scanner keyboard = new Scanner(System.in);
    
    final int SIZE = 100;
    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] description = new String[SIZE];
    Date[] startDate = new Date[SIZE];
    Date[] endDate = new Date[SIZE];
    int[] totalHours = new int[SIZE];
    int[] dayHours = new int[SIZE];
    
    int count = 0;
    
    for (int i = 0; i < SIZE; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      
      keyboard.nextLine();  // nextInt() 후에 남아 있는 줄바꿈 기호를 제거하는 용도이다.
      
      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();
      
      System.out.print("설명? ");
      description[i] = keyboard.nextLine();   
      
      System.out.print("시작일? ");
      // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
      startDate[i] = Date.valueOf(keyboard.next());
      
      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next());
      
      System.out.print("총수업시간? ");
      totalHours[i] = keyboard.nextInt();
      
      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();      
      keyboard.nextLine();
      
      System.out.println("계속 입력하시겠습니까?(Y/N)");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    
    System.out.println();
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s ~ %s, %d\n", no[i], title[i], startDate[i], endDate[i], totalHours[i]);
    }
    keyboard.close();
  }
}