package com.eomcs.oop.ex10.c;

public class Exam01 {
  public static void main(String[] args) {
    Restaurant r = new Restaurant();
    Farm f = new Farm();
    
    r.build();
    System.out.println("------------");
    f.build();
  }
}
