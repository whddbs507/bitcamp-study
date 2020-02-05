package com.eomcs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam34 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");
    FileOutputStream out = new FileOutputStream("temp/jls11_2.pdf");
    
    int b;
    long startTime = System.currentTimeMillis();
    int callCount = 0;
    while ((b = in.read()) != -1) {
      out.write(b);
      callCount++;
    }
    
    long endTime = System.currentTimeMillis();
    
    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
    out.close();
  }
}
