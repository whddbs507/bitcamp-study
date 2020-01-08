package com.eomcs.util2;

public class ArrayListTestTest {
  public static void main(String[] args) {
    ArrayListPrac XX = new ArrayListPrac();
    
    XX.add(11);
    XX.add(22);
    XX.add(33);
    XX.add(44);
    XX.add(55);
    XX.print();
    XX.set(1, "99");
    XX.set(3, "77");
    XX.print();
    System.out.println(XX.size());
    XX.remove(1);
    System.out.println(XX.size());
    XX.print();
    XX.remove(1);
    XX.print();
    
    System.out.println(XX.size());
  }
}