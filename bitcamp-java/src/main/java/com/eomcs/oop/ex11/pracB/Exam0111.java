package com.eomcs.oop.ex11.pracB;

import java.io.File;

public class Exam0111 {
  public static void main(String[] args) {
    File dir = new File(".");
    
    JavaFilter javaFilter = new JavaFilter();
    String[] names = dir.list(javaFilter);
  }
}