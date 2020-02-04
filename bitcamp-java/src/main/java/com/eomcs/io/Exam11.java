package com.eomcs.io;

import java.io.FileInputStream;

public class Exam11 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test1.data");
    int b = in.read();
    in.close();
    System.out.printf("%x\n", b);
  }
}