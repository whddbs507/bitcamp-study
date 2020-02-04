package com.eomcs.io;

import java.io.FileOutputStream;

public class Exam21 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test3.data");

    long money = 400_0000_0000_0000L;   // 00 01 6B CC 41 E9 00 00

    out.write((int)(money >> 56));
    out.write((int)(money >> 48));
    out.write((int)(money >> 40));
    out.write((int)(money >> 32));
    out.write((int)(money >> 24));
    out.write((int)(money >> 16));
    out.write((int)(money >> 8));
    out.write((int)(money));

    out.close();
  }
}
