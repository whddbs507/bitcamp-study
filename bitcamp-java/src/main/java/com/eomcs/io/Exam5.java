package com.eomcs.io;

import java.io.File;
import java.io.FileFilter;

public class Exam5 {
  public static void main(String[] args) {
    
    File dir = new File(".");
    File[] files = dir.listFiles((pathname) -> {
        if (pathname.isFile() && pathname.getName().endsWith("gradle"))
          return true;
        return false;
    });
    
    for (File file : files) {
      System.out.printf("%s %12d %s\n", file.isDirectory() ? "d" : "-", file.length(),
          file.getName());
    }
  }
}
