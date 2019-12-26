package com.eomcs.oop.ex02.study;

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  // 메서드를 통해 값을 계산하는 기능을 추가 : 연산자 정의
  // => 합계와 평균을 계산하는 기능을 추가한다.
  // => 메서드를 다음과 같이 호출할 때,
  //    인스턴스주소.메서드명();
  //    인스턴스 주소를 자동으로 받는 메서드 문법이 있다. "인스턴스 메서드"이다.
  public static void calculate(Score score) {
    // 인스턴스 메서드는 인스턴스 주소를 받는 내장 변수(built-in)가 있다.
    // 그 변수의 이름은 this이다.
    score.sum = score.kor + score.eng + score.math;
    score.aver = score.sum / 3f;
  }
}
