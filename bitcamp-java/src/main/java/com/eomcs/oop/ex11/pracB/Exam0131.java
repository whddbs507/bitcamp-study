package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0131 {

  // non-static nested class = inner class
  class JavaFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith("gradle")) {
        return true;
      } else {
        return false;
      }
    }
  }

  public static void main(String[] args) {
    File file = new File(".");
    Exam0131 abc = new Exam0131();
    
    JavaFilter javaFilter = abc.new JavaFilter();
    String[] names = file.list(javaFilter);
    
    for ( String name : names ) {
      System.out.println(name);
    } 
  }
}