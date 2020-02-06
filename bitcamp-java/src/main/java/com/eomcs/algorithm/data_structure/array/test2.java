package com.eomcs.algorithm.data_structure.array;

public class test2 {
  public static void main(String[] args) {
    char[] charArr = new char[4];
    
    charArr[0] = 'a';
    charArr[1] = 'b';
    charArr[2] = 'c';
    charArr[3] = 'd';
    
    charArr[1] = charArr[3];
    
    for(int i = 0; i < 4; i++) {
      System.out.println(charArr[i]);
    }
  }
}
