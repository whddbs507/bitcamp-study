package com.eomcs.io;

import java.io.File;
import java.io.FilenameFilter;

public class Exam9 {
  public static void main(String[] args) throws Exception {
    File dir = new File("/bin/main");
    System.out.println(dir.getCanonicalPath());

    printList(dir);
  }

  // 숨겨진파일, 클래스파일, .txt파일 뺴고 나머지 다 삭제
  static void printList(File sss) { 
    File[] files = sss.listFiles(new FilenameFilter() {

      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith(".txt")) 
          return true;
        if (dir.isHidden())
          return true;
        return false;
      }
    });
    for (File file : files) {
      System.out.println(file);
    }
  }
}