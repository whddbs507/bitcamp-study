package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    class Lesson {
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registeredDate;
    }

    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    }

    final int SIZE = 100;

    Lesson[] lessons = new Lesson[SIZE];
    Member[] members = new Member[SIZE];
    Board[] boards = new Board[SIZE];
    int count = 0;
    String command;


    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          Lesson lesson = new Lesson();
          lessons[count] = lesson;

          System.out.print("번호? ");
          lesson.no = keyboard.nextInt();

          keyboard.nextLine(); 

          System.out.print("수업명? ");
          lesson.title = keyboard.nextLine();

          System.out.print("설명? ");
          lesson.description = keyboard.nextLine();

          System.out.print("시작일? ");
          lesson.startDate = Date.valueOf(keyboard.next());

          System.out.print("종료일? ");
          lesson.endDate = Date.valueOf(keyboard.next());

          System.out.print("총수업시간? ");
          lesson.totalHours = keyboard.nextInt();

          System.out.print("일수업시간? ");
          lesson.dayHours = keyboard.nextInt();
          keyboard.nextLine(); 
          count++;
          break;

        case "/lesson/list":
          for (int i = 0; i < count; i++) {
            Lesson l = lessons[i];
            System.out.printf("%d, %s, %s ~ %s, %d\n",
                l.no, l.title, 
                l.startDate, l.endDate, 
                l.totalHours);
          }
          break;
        case "/member/add":
          Member member = new Member();
          members[count] = member;
          System.out.print("번호? ");
          member.no = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용

          System.out.print("이름? ");
          member.name = keyboard.nextLine();

          System.out.print("이메일? ");
          member.email = keyboard.nextLine();

          System.out.print("암호? ");
          member.password = keyboard.nextLine();

          System.out.print("사진? ");
          member.photo = keyboard.nextLine();

          System.out.print("전화? ");
          member.tel = keyboard.nextLine();

          member.registeredDate = new Date(System.currentTimeMillis());
          count++;
          break;
        case "/member/list":
          for (int i = 0; i < count; i++) {
            Member memberz = members[i];
            System.out.printf("%d, %s, %s, %s, %s\n", 
                memberz.no, memberz.name, memberz.email, 
                memberz.tel, memberz.registeredDate);
          }
        case "/board/add":
          Board board = new Board();
          
          System.out.print("번호? ");
          board.no = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용

          System.out.print("내용? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());
          board.viewCount = 0;
          boards[count] = board;
          count++;
          break;
        case "/board/list":
          for (int i = 0; i < count; i++) {
            Board boardss = boards[i];
            System.out.printf("%d, %s, %s, %d\n", 
                boardss.no, boardss.title, boardss.date, boardss.viewCount);
          }
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






