// 초기화 블록 - 인스턴스 블록의 활용
package com.eomcs.oop.ex03;

public class Exam0620 {

  public static void main(String[] args) {
    Object obj1 = new Object() {
      {
        System.out.println("인스턴스 블록...");
      }
    };

  }
}