package com.eomcs.io;

import java.io.File;
import java.io.FilenameFilter;

public class Exam4 {


  public static void main(String[] args) {
    
    File dir = new File(".");
    String[] names = dir.list();
    
    FilenameFilter filenameFilter = new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith("gradle"))
          return true;
        return false;
      }
    };
    
    for (String name : names) {
      System.out.println(name);
    } 
  }
}