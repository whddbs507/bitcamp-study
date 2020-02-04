package com.eomcs.io;

import java.io.File;

public class Exam7 {
  public static void main(String[] args) throws Exception {
    File dir = new File(".");       
    System.out.println(dir.getCanonicalPath());
    
    printList(dir, 1);
  }
  
  static void printList(File dir, int level) {    // 현재 디렉토리의 하위 파일 및 디렉토리 목록을 알아냄
    File[] files = dir.listFiles();
    
    for (File file : files) {
      printIndent(level);
      
      if (file.isDirectory() && !file.isHidden()) {
        System.out.printf("디렉토리 파일 : %s\n", file.getName());
        printList(file, level + 1);
      } else {
        System.out.printf("나머지 : %s\n", file.getName());
      }
    }
  }
  
  static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("+");
    }
  }
}