package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0131 {
  static int a;
  int b;

  class JavaFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith(".gradle"))
        return true;
      return false;
    }
  }

  public static void main(String[] args) {
    a = 100;
    // b = 100;
    Exam0131 ee = new Exam0131();
    JavaFilter javaFilter = ee.new JavaFilter();
    
    
    File dir = new File(".");
    String[] names = dir.list(javaFilter);
    for ( String name : names ) {
      System.out.println(name);
    }
  }
}