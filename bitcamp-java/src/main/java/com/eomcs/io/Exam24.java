package com.eomcs.io;

import java.io.FileInputStream;

public class Exam24 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test3.data");
    
    byte[] buf = new byte[100];
    
    int count = in.read(buf);
    
    String str = new String(buf, 0, count, "UTF-8");
    
    in.close();
    
    System.out.printf("%s\n", str);
  }
}