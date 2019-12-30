// 초기화 블록 - 클래스 블록 = 스태틱 블록
package com.eomcs.oop.ex03;

public class Exam0642 {

  public static class A {
    static int a;
    static void m() {
      System.out.println("dd");
    }

    A(){
      System.out.println("33");
    }
    static {
      System.out.println("Static{} 11111");
    }
    {
      System.out.println("44");
    }
    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) throws Exception {

    System.out.println("-----------");
    A jj = new A();
    System.out.println("===========");
    A tt = new A();
    System.out.println("종료!");
  }
}





