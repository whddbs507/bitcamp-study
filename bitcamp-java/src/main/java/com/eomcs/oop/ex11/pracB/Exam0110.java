package com.eomcs.oop.ex11.pracB;

import java.io.File;

public class Exam0110 {
  public static void main(String[] args) {
    File dir = new File(".");
    String[] files = dir.list();
    for (String file : files) {
      System.out.println(file);
    }
  }
}