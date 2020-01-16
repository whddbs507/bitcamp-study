package com.eomcs.oop.ex11.pracB;

import java.io.File;

public class Exam0110 {
  public static void main(String[] args) {
    File dir = new File(".");
    String[] names = dir.list();
    for (String name : names) {
      System.out.println(name);
    }
  }
}