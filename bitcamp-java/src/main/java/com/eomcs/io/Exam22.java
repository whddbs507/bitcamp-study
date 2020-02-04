package com.eomcs.io;

import java.io.FileInputStream;

public class Exam22 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test3.data");
    
    // 00 01 6B CC 41 E9 00 00
    long value = (long)in.read() << 56;
    value += (long)in.read() << 48;
    value += (long)in.read() << 40;
    value += (long)in.read() << 32;
    value += (long)in.read() << 24;
    value += (long)in.read() << 16;
    value += (long)in.read() << 8;
    value += (long)in.read();
    
    in.close();
    
    System.out.printf("%x", value);
  }
}
