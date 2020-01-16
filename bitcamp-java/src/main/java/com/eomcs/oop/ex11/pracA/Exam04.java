package com.eomcs.oop.ex11.pracA;

import com.eomcs.oop.ex11.pracA.ArrayList.MyIterator;

public class Exam04 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    
    MyIterator iterator = list.iterator();
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
