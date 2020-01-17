package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;


public class App {
  public static void main(String[] args) {

    final int SIZE = 100;
    
    Scanner keyboard = new Scanner(System.in);

    int count = 0;

    LessonHandler lesson = new LessonHandler(keyboard);
    BoardHandler board = new BoardHandler(keyboard, 200);
    BoardHandler board2 = new BoardHandler(keyboard, 1000);
    BoardHandler board3 = new BoardHandler(keyboard);
    
    for (int j = 0; j < SIZE; j++) {
      System.out.print("명령어를 입력해주세요  >>>  ");
      String command = keyboard.next();
      keyboard.nextLine();
      
      switch(command) {
        case "/lesson/add":
        {
          lesson.add();
          count++;
          break;
        }
        case "/lesson/list":
        {
          lesson.list();
          break;
        }
        case "/lesson/detail":
        {
          lesson.detail();
          break;
        }
        case "/board/add":
        {
          board.add();
          count++;
          break;
        }
        case "/board/list":
        {
          board.list();
          break;
        }
        case "/board/detail":
        {
          board.detail();
          break;
        }
        case "/board2/add":
        {
          board2.add();
          count++;
          break;
        }
        case "/board2/list":
        {
          board2.list();
          break;
        }
        case "/board2/detail":
        {
          board2.detail();
          break;
        }
        case "quit":
        {
          break;
        }
        case "QUIT":
        {
          break;
        }
        default:
        {
          System.out.println("다시 입력해주세요.");
        }
      }
      if (command.equals("quit") || command.equals("QUIT")) {
        System.out.println("종료합니다.");
        break;
      }
    }
  }
}