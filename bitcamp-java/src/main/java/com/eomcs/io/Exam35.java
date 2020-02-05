package com.eomcs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam35 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");
    FileOutputStream out = new FileOutputStream("temp/jls13.pdf");
    
    byte[] buf = new byte[8192];
    int len = 0;
    int callCount = 0;
    long startTime = System.currentTimeMillis();
    
    while ((len = in.read(buf)) != -1) {
      out.write(buf, 0, len);
      callCount++;
    }
    
    long endTime = System.currentTimeMillis();
    
    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
    out.close();
  }
}
