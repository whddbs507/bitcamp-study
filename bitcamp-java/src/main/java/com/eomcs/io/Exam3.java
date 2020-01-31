package com.eomcs.io;

import java.io.File;

public class Exam3 {
  public static void main(String[] args) {
    File dir = new File(".");
    String[] names = dir.list();
    for (String name : names) {
      System.out.println(name);
    }
  }
}
