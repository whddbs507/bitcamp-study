package com.eomcs.io;

public class Exam31 {
  public static void main(String[] args) throws Exception{
    DataOutputStream out = new DataOutputStream("temp/test5_3.data");
    
    Member member = new Member();
    member.name = "AB가각간";
    member.age = 37;
    member.gender =  true;
    
    out.writeUTF(member.name);
    out.writeInt(member.age);
    out.writeBoolean(member.gender);
    out.close();
    
    System.out.println("d");
  }
}
