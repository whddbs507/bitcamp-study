package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

// static nested class
// non-static nested class
// local class
// anonymous class
// lambda
public class Exam0160 {

  public static void main(String[] args) {
    File dir = new File(".");
    
    String[] names = dir.list((d, n) -> {
        if (n.endsWith(".gradle"))
          return true;
        return false;
    });
    
    for ( String name : names ) {
      System.out.println(name);
    }
  }
}