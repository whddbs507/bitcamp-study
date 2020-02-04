package com.eomcs.io;

import java.io.FileWriter;

public class Exam15 {
  public static void main(String[] args) throws Exception{
    FileWriter out = new FileWriter("temp/test2.txt");
    
    out.write(0x7a6bac00);
    out.write(0x7a5f0041);
    
    out.close();
    
    
  }
}
