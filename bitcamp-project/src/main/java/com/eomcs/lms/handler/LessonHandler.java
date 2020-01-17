package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  public final int SIZE = 100;

  int lessonCount = 0;
  Scanner input;
  Lesson[] lessons = new Lesson[SIZE];
  
  public LessonHandler(Scanner input) {
    this.input = input;
  }
  
  public void add() {
    Lesson lesson = new Lesson();
    System.out.print("번호 : ");
    lesson.no = input.nextInt();
    input.nextLine();
    System.out.print("수업명 : ");
    lesson.title = input.nextLine();
    System.out.print("설명 : ");
    lesson.description = input.nextLine();
    lessons[lessonCount] = lesson;

    lessonCount++;
  }

  public void list() {
    for (int i = 0; i < lessonCount; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d %s %s\n", lesson.no, lesson.title, lesson.description);
    }
  }

  public void detail() {
    System.out.print("Lesson의 번호를 입력하세요>>   ");
    int i = input.nextInt();
    input.nextLine();
    for (int j = 0; j < lessonCount; j++) {
      Lesson lesson = lessons[j];
      if (i == lesson.no) {
        System.out.printf("%d %s %s\n", lesson.no, lesson.title, lesson.description);
        break;
      } else if (j == lessonCount - 1) {
        System.out.println("존재하지 않는 Lesson의 번호입니다.");
      }
    }

  }
}