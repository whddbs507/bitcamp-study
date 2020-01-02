//# 캡슐화 문법 사용 후 - 필드의 값을 변경할 때마다 특정 작업을 수행하게 만들기
package com.eomcs.oop.ex07.a;

class Score3 {
  String name;

  // 국, 영, 수 점수를 바꿀 때마다 자동적ㅇ로 합계, 평균을 계산해야 한다.
  // 방법?
  // => 직접 필드의 값을 바꾸게 하지말고 메서드를 통해 바꾸도록 유도한다.
  // => 이렇게 필드의 값을 바꿀 때마다 뭔가를 수행해야 하는 경우, 해당 필드의 직접 접근을 막아라!
  private int kor;
  private int eng;
  private int math;

  // 대신 메서드를 통해 값을 설정하게 하라
  // 보통 필드의 값을 설정하는 메서드는 set필드명()으로 이름을 짓는다.
  // => 이런 메서드를 "세터(setter)"라 부른다.
  // => 외부에서 호출할 수 있도록 공개 모드로 설정한다.

  public int getKor() {
    return this.kor;
  }
  public int getEng() {
    return this.eng;
  }
  public int getMath() {
    return this.math;
  }
  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }
  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }
  public void setMath(int math) {
    this.math = math;
    this.compute();
  }
  private int sum;
  private float aver;

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

public class Exam0310 {
  public static void main(String[] args) {
    Score3 s1 = new Score3();
    s1.name = "홍길동";
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);
    s1.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.getKor()
        , s1.getEng(), s1.getMath(), s1.getSum(), s1.getAver());
  }
}
