package com.eomcs.oop.ex12.prac;

public class Exam0110 {
  static interface Interest {
    
  }
  
  
  public static void main(String[] args) {
    Interest i1 = getInterest(1);
    System.out.println("금액 : %.2f\n", i1.compute(1_0000_0000));
  }
}