package com.eomcs.util2;

class Stack2Test {
  public static void main(String[] args) {
    Stack ss = new Stack();
    
    ss.push(1);
    ss.push(2);
    ss.push(3);
    ss.push(4);
    ss.push(5);
    ss.push(6);
    ss.push(7);
    ss.push(8);
    ss.push(9);
    ss.push(10);
    ss.push(11);
    System.out.println(ss.pop());
    System.out.println(ss.pop());
    System.out.println(ss.pop());
    System.out.println(ss.pop());
    System.out.println(ss.pop());
  }
}