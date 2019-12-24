package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);



  public static void main(String[] args) {

    // LessonHandler의 메서드를 사용하기 전에 그 메서드가 필요로 하는 키보드 객체를 설정해줘야한다.
    LessonHandler.keyboard = keyboard;
    
    // MemberHandler의 메서드를 사용하기 전에 그 메서드가 필요로 하는 키보드 객체를 설정해줘야한다.
    MemberHandler.keyboard = keyboard;
    
    // BoardHandler의 메서드를 사용하기 전에 그 메서드가 필요로 하는 키보드 객체를 설정해줘야한다.
    BoardHandler.keyboard = keyboard;
    
    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          // 다른 클래스로 분리한 메서드를 호출할 때는
          // 클래스를 이름을 지정해야한다.
          LessonHandler.addLesson();
          break;

        case "/lesson/list":
          LessonHandler.listLesson();
          break;

        case "/member/add":
          MemberHandler.addMember();
          break;
        case "/member/list":
          MemberHandler.listMember();
          break;
        case "/board/add":
          BoardHandler.addBoard();
          break;
        case "/board/list":
          BoardHandler.listBoard();
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");

    keyboard.close();
  }


}






