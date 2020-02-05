package com.eomcs.io;

public class Exam32 {
  public static void main(String[] args) throws Exception {
    DataInputStream in = new DataInputStream("temp/test5_3.data");
    
    Member member = new Member();
    
    member.name = in.readUTF();
    member.age = in.readInt();
    member.gender = in.readBoolean();
    in.close();
    
    System.out.println(member.age);
  }
}
