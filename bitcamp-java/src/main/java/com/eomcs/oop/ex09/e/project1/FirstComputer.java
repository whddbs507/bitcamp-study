package com.eomcs.oop.ex09.e.project1;

import com.eomcs.oop.ex09.e.Computer;

public class FirstComputer implements Computer {
  public static void main(String[] args) {
    Computer AA = new FirstComputer();
    AA.touch();
  }
  public void execute() {
    System.out.println("첫 번째 컴퓨터 : 계산만 수행");
  }
}
