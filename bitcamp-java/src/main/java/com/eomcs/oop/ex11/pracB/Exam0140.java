package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;
// 클래스의 종류 : local class

public class Exam0140 {
  public static void main(String[] args) {

    class JavaFilter implements FilenameFilter {
      public boolean accept(File dir, String name) {
        if (name.endsWith(".bat"))
          return true;
        return false;
      }
    }
    
    File dir = new File(".");
    JavaFilter n = new JavaFilter();
    String[] names = dir.list(n);

    for ( String name : names ) {
      System.out.println(name);
    }
  }
}
