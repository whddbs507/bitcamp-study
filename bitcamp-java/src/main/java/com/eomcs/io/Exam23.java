package com.eomcs.io;

import java.io.FileOutputStream;

public class Exam23 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test3.data");

    String str = "AB가각간";
    
    out.write(str.getBytes("UTF-8"));
    
    out.close();
  }
}
