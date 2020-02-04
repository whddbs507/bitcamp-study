package com.eomcs.io;

import java.io.FileWriter;

public class Exam17 {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/test2.txt");
    
    char[] chars = new char[] {'G', 'B', 'C', '가', '각', '간', '똘', '똥'};
    
    out.write(chars, 2, 3);
    
    out.close();
  }
}
