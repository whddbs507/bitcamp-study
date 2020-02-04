package com.eomcs.io;

import java.io.File;

public class Exam6 {
  public static void main(String[] args) throws Exception{
    File dir = new File(".");
    
    System.out.println(dir.getCanonicalPath());
    // C:/Users/user/git/bitcamp-study/bitcamp-java

    printList(dir);
  }
  
  static void printList(File dir) {
    File[] files = dir.listFiles();
    for (File file : files) {
      System.out.println(file.getName());
    }
  }
}