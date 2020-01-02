// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용을 익혀보자!
package com.eomcs.oop.ex04;

public class Exam0111 {

  public static void main(String[] args) throws Exception {
    
    String s1 = new String("Hello");
    
    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
    
    String s2 = new String(chars);

    byte[] bytes = {
        (byte)0x48, // H 
        (byte)0x65, // e
        (byte)0x6c, // l
        (byte)0x6c, // l
        (byte)0x6f  // o 
    };
    String s3 = new String(bytes);
    int[] s4 = new int[] {3,4,5};
    System.out.printf("%s, %s, %s, %s, %s\n", s1, s2, s3, s4, chars);
  
  }
  
}
