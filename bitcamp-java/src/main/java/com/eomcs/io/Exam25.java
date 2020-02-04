package com.eomcs.io;

import java.io.FileInputStream;

// AB가각간 출력
public class Exam25 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test3.data");
    
    byte[] buf = new byte[100];
    int count = in.read(buf);
    
    String st = new String(buf, 0, count, "UTF-8");
    in.close();
    
    
    System.out.println(st);
  }
}
