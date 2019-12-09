package com.eomcs.basic.ex02;

// 애노테이션 (annotation)
// - 컴파일러나 JVM에게 지시하는 명령
// - 실행 중에 추출해서 사용하는 특별한 데이터

public class Exam3 {
  public static void main(String[] args) {
    // multi-line comments
    System.out.println("애노테이션");

  }

  @Override // <== 컴파일러에게 메서드를 재정의함을 알리는 명령어
  public String toString() {
    return "okok";
  }
}