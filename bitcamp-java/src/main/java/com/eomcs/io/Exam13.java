package com.eomcs.io;

import java.io.FileInputStream;

public class Exam13 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test1.data");
    
    byte[] buf = new byte[100];
    
    int count = in.read(buf, 10, 40);
    
    in.close();
    
    System.out.printf("읽은 바이트 수 : %d\n", count);
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%x ", buf[i]);
    }
    System.out.println();
  }
}
