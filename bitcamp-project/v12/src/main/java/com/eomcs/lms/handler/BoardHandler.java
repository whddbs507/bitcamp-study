package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import sun.tools.tree.ThisExpression;

public class BoardHandler {
  
  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;
  public static Scanner keyboard;
  
  // 인스턴스 메서드
  // => 인스턴스가 있어야만 호출할 수 있는 메서드이다
  // => 인스턴스를 사용하는 메서드인 경우 인스턴스 메서드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  //    인스턴스주소.메서드명();
  public void listBoard() {
    for (int i = 0; i < this.boardCount; i++) {
      Board b = this.boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }

  public void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;
    
    this.boards[this.boardCount++] = board;
    System.out.println("저장하였습니다.");
  }
  
  public void detailBoard() {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤의 남은 공백 제거
    
    Board board = null;
    for (int i = 0; i < this.boardCount; i++) {
      if (this.boards[i].no == no) {
        board = this.boards[i];
        break;
      }
    }
    
    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", board.no);
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("등록일: %s\n", board.date);
    System.out.printf("조회수: %d\n", board.viewCount);
  }

}









