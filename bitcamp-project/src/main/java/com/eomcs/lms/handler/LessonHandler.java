package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  public final int SIZE = 100;
  Scanner keyScan = new Scanner(System.in);

  Lesson[] lessons = new Lesson[SIZE];
  int lessonCount = 0;

  public void add() {
    Lesson lesson = new Lesson();
    System.out.print("번호 : ");
    lesson.no = keyScan.nextInt();
    keyScan.nextLine();
    System.out.print("수업명 : ");
    lesson.title = keyScan.nextLine();
    System.out.print("설명 : ");
    lesson.description = keyScan.nextLine();
    lessons[lessonCount] = lesson;

    lessonCount++;
  }

  public void print() {
    for (int i = 0; i < lessonCount; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d %s %s\n", lesson.no, lesson.title, lesson.description);
    }
  }

  public void detail() {
    System.out.print("Lesson의 번호를 입력하세요>>   ");
    int i = keyScan.nextInt();
    keyScan.nextLine();
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