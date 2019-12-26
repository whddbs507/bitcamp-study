package com.eomcs.oop.ex02.studypractice;

public class Test001 {
  public static void main(String[] args) {
    // 식 1 : 4 + 6 / 2 * 5 = 25
    // 식 2 : 2 - 1 * 8 / 4 = 2
    Calculate c1 = new Calculate();
    Calculate c2 = new Calculate();
    
    Calculate.sum(c1, 4);
    Calculate.sum(c2, 2);

    Calculate.sum(c1, 6);
    Calculate.sub(c2, 1);
    
    Calculate.div(c1, 2);
    Calculate.mul(c2, 8);
    
    Calculate.mul(c1, 5);
    Calculate.div(c2, 4);
    
    System.out.printf("%d\n", c1.result);
    System.out.printf("%d", c2.result);
  }
}
