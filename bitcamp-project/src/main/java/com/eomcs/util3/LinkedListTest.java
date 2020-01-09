package com.eomcs.util3;

public class LinkedListTest {

  public static void main(String[] args) {
    
    LinkedList linkedList = new LinkedList();
    
    linkedList.add(1111);
    linkedList.add(2222);
    linkedList.add(3333);
    linkedList.add(4444);
    linkedList.add(5555);
    System.out.println(linkedList.get(0));
    System.out.println(linkedList.get(1));
    System.out.println(linkedList.get(2));
    System.out.println(linkedList.get(3));
    System.out.println(linkedList.get(4));
    System.out.println(linkedList.get(5));
    System.out.println("---------------");
    System.out.println(linkedList.get(0));
    System.out.println(linkedList.get(1));
    System.out.println(linkedList.get(2));
    System.out.println(linkedList.get(3));
    System.out.println(linkedList.get(4));
    System.out.println(linkedList.get(5));
    System.out.println("---------------");
  }
}