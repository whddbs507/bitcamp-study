package com.eomcs.oop.ex03.test;


public class Car {
  
  boolean on;
  int speed;
  String model;
  String maker;     // 메모리 설게도
  Engine engine;
  int distance;
  
  Car() {
    this.engine = new Engine(4, 16, 1980);
  }
  
  void start() {        
    this.on = true;                // 연산자
  }
  
  void stop() {
    this.on = false;
  }
  
  void check() {
    if (this.engine.oilState == 0) {
      this.engine.cleanOil();
      System.out.println("자동차의 엔진 오일을 교환했습니다.");
    }
    System.out.println("자동차를 정비했습니다!");
  }
}