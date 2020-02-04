package com.eomcs.io;

import java.io.FileReader;

public class Exam18 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/test2.txt");
    
    char[] buf = new char[100];
    
    int count = in.read(buf, 10, 40);
    
    in.close();
    
    System.out.printf("%d\n", count);
    for (int i = 0; i < count+15; i++) {
      System.out.printf("%c(%x) ", buf[i], (int)buf[i]);
    }
  }
}