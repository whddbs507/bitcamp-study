package com.eomcs.oop.ex05.test;

public class Car2{
  
  public String model;
  public String maker;
  public int capacity;
  boolean sunroof;
  boolean auto;
  
  public Car2() {}

  public Car2(String model, String maker, int capacity, boolean sunroof, boolean auto ) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
    this.sunroof = true;
    this.auto = false;
  }
}