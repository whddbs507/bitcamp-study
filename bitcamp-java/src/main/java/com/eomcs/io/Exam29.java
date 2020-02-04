package com.eomcs.io;

import java.io.FileInputStream;

public class Exam29 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test00.data");
    
    Member member = new Member();
    
    int size = in.read();
    byte[] buf = new byte[size];
    in.read(buf);
    
    member.name = new String(buf, "UTF-8");
    
    // 나이       00 27
    member.age = in.read() << 24;
    member.age += in.read() << 16;
    member.age += in.read() << 8;
    member.age += in.read();
    
    System.out.println(member.age);
    
    if (in.read() == 1)
      member.gender = true;
    member.gender = false;
    
    in.close();
  }
}
