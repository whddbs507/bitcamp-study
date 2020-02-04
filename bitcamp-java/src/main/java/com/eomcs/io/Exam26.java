package com.eomcs.io;

import java.io.FileOutputStream;

public class Exam26 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test4.data");

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;
    
    // 이름 출력
    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length);
    out.write(bytes);
    System.out.println(bytes.length);
    
    // 나이 출력 ( 27 -> 00 1B )
    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);
    // 성별 출력
    if (member.gender)
      out.write(1);
    else
      out.write(0);
    
    out.close();
  }
}
