package com.eomcs.io;

import java.io.FileInputStream;

public class Exam27 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test4.data");
    
    Member member = null;
    
    member = new Member();
    
    int size = in.read();
    System.out.println(size);
    byte[] buf = new byte[size];
    in.read(buf);
    member.name = new String(buf, "UTF-8");
    
    //////////// 나이 출력 ( 27 -> 00 1B )
    
    member.age = in.read() << 24;
    member.age += in.read() << 16;
    member.age += in.read() << 8;
    member.age += in.read();
    
    if (in.read() == 1)
      member.gender = true;
    else
      member.gender = false;
    
    in.close();
    
    System.out.println(member.age);
    System.out.printf("%x",member.age);
  }
}
