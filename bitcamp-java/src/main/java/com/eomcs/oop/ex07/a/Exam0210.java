//# 캡슐화 문법 사용 후 - 개발자가 특정 필드를 직접 접근하지 못하게 막기
package com.eomcs.oop.ex07.a;

class Score2 {
  String name;
  int kor;
  int eng;
  int math;

  // sum이나 aver 필드는 kor,eng,math값을 연산한 결과를 보관하기 떄문에 이러한 문법을
  // '캡슐화(encapsulation)'을 사용해야 한다.
  private int sum;
  private float aver;
  
  // sum 과 aver 의 값을 직접 변경하지는 못하더라도
  // 외부에서 이 값들을 조회할 수 있는 방법/수단9method)은 제공해야 한다.
  // => 보통 이렇게 필드의 값을 조회하는 용도로 사용하는 메서드의 경우 메서드의 용도를 이해하기 쉽도록
  //     getXxx() 형태로 이름을 짓는다.
  //         get필드명() {...}
  // => 메서드의 이름이 get으로 시작한다고 해서 "게터(getter)"라고 부른다.
  // => 그리고 이런 getter는 공개 모드로 설정한다.
  
  int getSum() {
    return this.sum;
  }
  float getAver() {
    return this.aver;
  }
  
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam0210 {
  public static void main(String[] args) {
    Score2 s1 = new Score2();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.compute();
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor
        , s1.eng, s1.math, s1.getSum(), s1.getAver());
  }
}
