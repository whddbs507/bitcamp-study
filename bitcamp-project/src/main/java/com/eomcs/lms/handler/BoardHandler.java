package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class BoardHandler {
  
  public final int SIZE = 100;
  int view = 0;
  
  int boardCount = 0;
  Board[] boards;
  Scanner input;
  int capacity;
  
  public BoardHandler(Scanner input) {
    this.input = input;
    boards = new Board[SIZE];
  }
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    this.capacity = capacity;
    if (capacity < SIZE) {
      boards = new Board[SIZE];
    } else if (capacity >= SIZE) {
      boards = new Board[capacity];
    }
  }
  
  public void add() {
    Board board = new Board();
    System.out.print("번호 : ");
    board.no = input.nextInt();
    input.nextLine();
    System.out.print("내용 : ");
    board.description = input.nextLine();
    boards[boardCount] = board;

    boardCount++;
  }
  
  public void list() {
    for (int i = 0; i < boardCount; i++) {
      Board board = boards[i];
      System.out.printf("%d %s %d\n", board.no, board.description, view);
    }
  }
  
  public void detail() {
    System.out.print("Board의 번호를 입력하세요>>   ");
    int i = input.nextInt();
    input.nextLine();
    for (int j = 0; j < boardCount; j++) {
      Board board = boards[j];
      if (i == board.no) {
        System.out.printf("%d %s %d\n", board.no, board.description, view);
        break;
      } else if (j == boardCount - 1) {
        System.out.println("존재하지 않는 Board의 번호입니다.");
      }
    }
  }
}