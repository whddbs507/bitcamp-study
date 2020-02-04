package com.eomcs.io;

import java.io.FileOutputStream;

public class Exam28 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test00.data");

    Member member = new Member();
    member.name = "CD나낙난";
    member.age = 39;
    member.gender = false;

    // 이름
    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length);
    out.write(bytes);

    // 나이       00 27
    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);
    
    System.out.println(member.age);
    // 성별
    if (member.gender == true) 
      out.write(1);
    out.write(0);
  }
}
