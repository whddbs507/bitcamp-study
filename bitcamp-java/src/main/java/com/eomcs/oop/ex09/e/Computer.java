package com.eomcs.oop.ex09.e;

public interface Computer {
  public abstract void execute();
  default public void touch() {
    System.out.println("a");
  }
}
