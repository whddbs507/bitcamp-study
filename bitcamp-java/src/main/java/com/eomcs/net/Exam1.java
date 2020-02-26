package com.eomcs.net;

public class Exam1 {
  public static void main(String[] args) throws Exception{
    String str = "ABC012가각간";
    
    byte[] bytes = str.getBytes("UTF-8");
    
    for (byte b : bytes) {
      System.out.printf("%x ", b);
    }
  }
}
