package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

// static nested class 사용
// non-static nested class 사용
// local class 사용
// anonymous class 사용
// lambda class 사용

public class ExamPrac {

  public static void main(String[] args) {
    File dir = new File(".");

    String[] names = dir.list((d,n) -> {
        if (n.endsWith(".gradle"))
          return true;
        return false;
    });
    
    for (String name : names) {
      System.out.println(name);
    }

  }
}
