package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;


public class App {
  public static void main(String[] args) {

    final int SIZE = 100;
    
    Scanner keyScan = new Scanner(System.in);

    int count = 0;

    LessonHandler lesson = new LessonHandler();
    BoardHandler board = new BoardHandler();

    for (int j = 0; j < SIZE; j++) {
      System.out.println("1 - Lesson 입력, 2 - Lesson 출력, 3 - Lesson 상세");
      System.out.println("4 - Board 입력, 5 - Board 출력, 6 - Board 상세");
      System.out.println("9 - 나가기");
      System.out.print("번호를 입력해주세요  >>>  ");
      int command = keyScan.nextInt();

      switch(command) {
        case 1:
        {
          lesson.add();
          count++;
          break;
        }
        case 2:
        {
          lesson.print();
          break;
        }
        case 3:
        {
          lesson.detail();
          break;
        }
        case 4:
        {
          board.add();
          count++;
          break;
        }
        case 5:
        {
          board.print();
          break;
        }
        case 6:
        {
          board.detail();
          break;
        }
        case 9:
        {
          break;
        }

        default:
        {
          System.out.print("다시 입력해주세요.");
        }
      }
      if (command == 9) {
        System.out.println("종료합니다.");
        break;
      }
    }

  }
}