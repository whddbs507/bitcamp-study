package com.eomcs.oop.ex02.studypractice;

public class Test002 {
  public static void main(String[] args) {
    // 식 1 : 4 + 6 / 2 * 5 = 25
    // 식 2 : 2 - 1 * 8 / 4 = 2
    Calculate2 c1 = new Calculate2();
    Calculate2 c2 = new Calculate2();
    
    c1.sum(4);
    c2.sum(2);

    c1.sum(6);
    c2.sub(1);
    
    c1.div(2);
    c2.mul(8);
    
    c1.mul(5);
    c2.div(4);
    
    System.out.printf("%d\n", c1.result);
    System.out.printf("%d", c2.result);
  }
}
