package com.eomcs.exception.ex05.prac;

import java.sql.Date;
import java.util.Scanner;

public class Exam {
  
  static Board read() {
    Scanner keyScan = new Scanner(System.in);
    
    Board board = new Board();
    System.out.print("번호 > ");
    board.setNum(keyScan.nextInt());
    keyScan.nextLine();
    System.out.print("제목 > ");
    board.setTitle(keyScan.nextLine());
    System.out.print("내용 > ");
    board.setIndex(keyScan.nextLine());
    System.out.print("등록일 > ");
    board.setDate(Date.valueOf(keyScan.nextLine()));
    
    return board;
  }
  
  public static void main(String[] args) {
    try {    
      Board board = read();
      
      System.out.printf("번호 : %d\n", board.getNum());
      System.out.printf("제목 : %s\n", board.getTitle());
      System.out.printf("내용 : %s\n", board.getIndex());
      System.out.printf("등록일 : %s\n", board.getDate());
    } catch(RuntimeException e) {
      System.out.println("게시물 입력 중 오류 발생");
      e.printStackTrace();
    }
  }
}
