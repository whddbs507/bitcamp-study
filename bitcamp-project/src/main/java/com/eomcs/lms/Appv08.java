package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class Appv08 {

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
    int countA = 0;
    int countB = 0;
    System.out.print("명령어 >> ");
    String command = keyboard.nextLine();

    do {
      switch (command) {
        case "/lesson/add":
          Lesson lesson = new Lesson();
          System.out.print("번호? ");
          lesson.no = keyboard.nextInt();
          keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.
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
          lessons[count] = lesson;
          count++;
          break;

        case "/lesson/list":
          for (int i = 0; i < count; i++) {
            Lesson lessonz = lessons[i];
            System.out.printf("%d, %s, %s ~ %s, %d\n",
                lessonz.no, lessonz.title, 
                lessonz.startDate, lessonz.endDate, 
                lessonz.totalHours);
          } break;
          
        case "/member/add":
          Member member = new Member();

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

          members[countA] = member;
          countA++;
          break;
          
        case "/member/list":
          for (int i = 0; i < countA; i++) {
            Member memberz = members[i];
            System.out.printf("%d, %s, %s, %s, %s\n", 
                memberz.no, memberz.name, memberz.email, 
                memberz.tel, memberz.registeredDate);
          } break;
          
        case "/board/add":
          Board board = new Board();

          System.out.print("번호? ");
          board.no = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용

          System.out.print("내용? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());
          board.viewCount = 0;

          // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다.
          boards[countB] = board;
          countB++;
          break;

        case "/board/list":
          for (int i = 0; i < countB; i++) {
            Board boardz = boards[i];
            System.out.printf("%d, %s, %s, %d\n", 
                boardz.no, boardz.title, boardz.date, boardz.viewCount);
          } break;
        default:
          System.out.println("명령어를 제대로 입력하세요");
          break;
      }
      System.out.print("명령어 >> ");
      command = keyboard.nextLine();
    } while (!command.equalsIgnoreCase("quit")); 
    System.out.println("종료합니다.");
    
  }
}



