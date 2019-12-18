package com.eomcs.basic.ex06.practice;

public class Prac0430 {
  public static void main(String[] args) {
    String[] names = new String[] {"김", "최", "박", "이", "황"};
    for (int i = 0; i < 5; i++) {
      System.out.print(names[i]);
    }
    String[] ames = {"rla", "chl", "qkr", "dl", "ghkd", "ghd"};
    for (int i = 0; i < ames.length; i++) {
      System.out.print(ames[i]);
    }
    int[] mes = {22, 31, 57, 4, 93};
    for (int i = 0; i < mes.length; i++) {
      System.out.println(mes[i]);
    }
    for (int bb : mes)
      System.out.print(bb);
    for (String aa : names)
      System.out.print(aa);
    for (String cc : ames)
      System.out.print(cc);
  }
  
}