package com.eomcs.io;

import java.io.File;

public class Exam8 {
  public static void main(String[] args) {
    File dir = new File("temp");

    deleteFile(dir);

    System.out.println("삭제하였습니다");
  }

  static void deleteFile(File dir) {
    if (dir.isDirectory()) {
      File[] files = dir.listFiles();
      for (File file : files) {
        deleteFile(file);
      }
    }
    dir.delete();
  }
}
