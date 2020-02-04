package com.eomcs.io;

import java.io.FileOutputStream;

public class Exam10 {
  public static void main(String[] args) throws Exception {
      FileOutputStream out = new FileOutputStream("temp/test1.data");
      out.write(0x7a6b5c4e);
      out.close();
  }
}