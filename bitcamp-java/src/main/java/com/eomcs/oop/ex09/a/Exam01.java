package com.eomcs.oop.ex09.a;

public class Exam01 {
  public static void main(String[] args) {
    Worker w1 = new BlueWorker();
    w1.execute();
    w1.sss();
    Worker w2 = new JubuWorker();
    w2.execute();
    w2.sss();
    Worker w3 = new WhiteWorker();
    w3.execute();
    w3.sss();
  }
}
