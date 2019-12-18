package com.eomcs.basic.ex06.practice;

import java.util.ArrayList;

public class Prac0440 {
  public static void main(String[] args) {
    
    ArrayList arrayPt = new ArrayList();
    
    arrayPt.add(2323);
    arrayPt.add('강');
    arrayPt.add("안녕하세요");
    arrayPt.add(true);
    arrayPt.add(3.14f);
    
    for (int i = 0; i < arrayPt.size(); i++) {
      System.out.println(arrayPt.get(i));
    }
  }
  
}