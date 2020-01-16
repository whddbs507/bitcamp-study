package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler3 {
  
  public final int SIZE = 100;
  int view = 0;
  Scanner keyScan = new Scanner(System.in);
  
  int boardCount = 0;
  Board[] boards = new Board[SIZE];
  
  void add() {
    Board board = new Board();
    System.out.print("번호 : ");
    board.no = keyScan.nextInt();
    keyScan.nextLine();
    System.out.print("내용 : ");
    board.description = keyScan.nextLine();
    boards[boardCount] = board;

    boardCount++;
  }
  
  void print() {
    for (int i = 0; i < boardCount; i++) {
      Board board = boards[i];
      System.out.printf("%d %s %d\n", board.no, board.description, view);
    }
  }
}
