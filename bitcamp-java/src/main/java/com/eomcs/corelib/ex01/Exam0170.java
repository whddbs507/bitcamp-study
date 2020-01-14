package com.eomcs.corelib.ex01;

public class Exam0170 {

  static class Score implements Cloneable {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String aa, int bb, int cc, int dd) {
      this.name = aa;
      this.kor = bb;
      this.eng = cc;
      this.math = dd;
      this.sum = this.kor + this.eng + this.math;
      this.aver = (this.kor + this.eng + this.math) / 3f;
    }
    
    @Override
    public String toString() {
      return this.name + ", " + this.kor + ", " + 
    this.eng + ", " + this.sum + ", " + this.aver;
    }
    
    @Override
    public Score clone() throws CloneNotSupportedException {
      return (Score) super.clone();
    }
  }
  
  public static void main(String[] args) throws Exception{
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = s1.clone();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1 == s2);
  }
}
