package com.eomcs.io;

import java.io.File;

public class Exam2 {
  public static void main(String[] args) throws Exception {
      File file = new File("aaa/bb/c/temptest.txt");
      File dir = file.getParentFile();
      System.out.println(dir.getCanonicalPath());
      if (dir.mkdirs()) {
        System.out.println("temp 디렉토리를 생성하였습니다.");
      } else {
        System.out.println("temp 디렉토리를 생성할 수 없습니다.");
      }
      
      if (file.createNewFile()) {
        System.out.println("파일 생성");
      } else {
        System.out.println("파일 미생성");
      }
  }
}
