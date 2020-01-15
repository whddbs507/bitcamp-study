package com.eomcs.oop.ex10.c;

public abstract class Building {
  public void build() {
    System.out.println("건물을 짓고 있습니다.");
    startEffect();
    System.out.println("건물이 완성되었습니다.");
    endEffect();
  }
  public abstract void startEffect();
  public abstract void endEffect();
}
