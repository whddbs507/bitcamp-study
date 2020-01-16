package com.eomcs.oop.ex11.pracA;

public class Exam01 {
  int value;
  void setValue(int value) {
    this.value = value;
  }
  int getValue() {
    return this.value;
  }
  
  public static void main(String[] args) {
    Exam01 obj = new Exam01();
    obj.setValue(100);
    System.out.println(obj.getValue());
  }
}
