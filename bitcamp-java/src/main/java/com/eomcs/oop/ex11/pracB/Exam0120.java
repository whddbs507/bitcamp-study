package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0120 {
  
  public static class JavaFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith("bat")) {
        return true;
      } else {
        return false;
      }
    }
    static void m1() {}
  }
  
  public static void main(String[] args) {
    File dir = new File(".");
    
    JavaFilter javaFilter = new JavaFilter();
    
    String[] names = dir.list(javaFilter);

    for ( String name : names) {
      System.out.println(name);
    }
  } 
}