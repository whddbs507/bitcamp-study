package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

// 고급
// 1) 배열의 개수를 변수에 저장하여 크기 변경을 쉽게 하기
// 2) 배열의 개수를 저장하고 있는 변수를 함부로 변경하지 못하도록 한다. 
//    final
// 3) 코드를 관리하기 쉽도록 작은 기능 단위로 분리한다.
//    메서드
// 4) 메서드 사이에 공유하는 변수는 클래스 변수로 선언한다.

public class App3 {

  static final int size = 522;

  static int[] no = new int[size];
  static String[] title = new String[size];
  static Date[] date = new Date[size];
  static int[] viewCount = new int[size];
  static int count = 0;  
  static Scanner keyboard = new Scanner(System.in);
  static int i = 0;

  
  public static void main(String[] args) {

    inputBoards();

    printBoards();
    
  }


  static void inputBoards() {
    String response;

    for (int i = 0; i < size; i++) {
      
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();        // 줄바꿈 기호 제거용
      
      date[i] = new Date(System.currentTimeMillis());
      viewCount[i] = 0;
      count++;
      System.out.print("내용? ");
      title[i] = keyboard.nextLine();
      
      System.out.print("계속 입력하시겠습니까?(Y/N) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("Y")) {
        break;      // 반복문을 즉시 멈춰라!
      }
    }
    
  }
  
  static void printBoards() {
    
    System.out.println("");

    for (i=0; i < count; i++) {
     System.out.printf("%d, %s, %s, %d\n", no[i], title[i], date[i], viewCount[i]);    
    }
  }

}