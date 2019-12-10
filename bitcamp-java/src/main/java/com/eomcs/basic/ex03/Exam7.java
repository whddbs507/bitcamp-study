package com.eomcs.basic.ex03;

// 이스케이프 문자(escape character)

public class Exam7 {

  public static void main(String[] args) {
    
    // 이스케이프 문자
    // - 문자를 제어하는 기능을 가진 문자
    // - 문법 ( \ + [n | r | f | t | b | ' | " | \ ])
    // \n : new line
    // \r : return
    // \b : back
    // \t : tab
    // \f : formfeed (별로사용안함)
    System.out.println("Hello,world!");
    System.out.println("Hello,\nworld!"); // 줄바꿈 문자
    System.out.println("Hello,\rabc"); // 커서 처음으로 돌리는 문자
    // 커서(cursor)란? 문자를 출력할 위치를 가리키는 것.
    System.out.println("Hello,\b\b\bworld!"); // 커서를 뒤로 한 칸 이동시키는 문자
    System.out.println("Hello,\tworld!"); // 탭 공간을 추가시키는 문자
    System.out.println("Hello,\fworld!"); // (별로사용안함) formfeed 추가시키는 문자
    System.out.println("Hello,\"w\"orld!"); // " 추가시키는 문자
    System.out.println("Hello,'w'orld!"); // ""안에서 ' 문자는 그냥 적는다.
    System.out.println('\'');  // '' 안에서 '문자를 출력시키는 문자
    System.out.println('"');  // '' 안에서 "문자는 그냥 적는다.
    System.out.println("c:\\Users\\user\\git");  // \ 문자를 출력시키는 문자

  }
}

// 줄바꿈 코드
// Carrage Return(CR) : 0d
// Line Feed(LF) : 0a
