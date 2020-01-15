package com.eomcs.oop.ex09.a;

public class Exam01 {
  
  public static void main(String[] args) {
    Worker w1 = new BlueWorker();
    Worker w2 = new WhiteWorker();
    Worker w3 = new JubuWorker();
    WhiteWorker w4 = new WhiteWorker();
    w1.execute();
    w2.execute();
    w3.execute();
    w4.sss();
    w4.execute();
  }
}
