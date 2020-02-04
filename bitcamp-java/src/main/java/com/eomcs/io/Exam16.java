package com.eomcs.io;

import java.io.FileReader;

public class Exam16 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/test2.txt");
    
    int ch1 = in.read();
    int ch2 = in.read();
    
    in.close();
    
    System.out.printf("%x\n", ch1);
    System.out.printf("%x\n", ch2);
  }
}
