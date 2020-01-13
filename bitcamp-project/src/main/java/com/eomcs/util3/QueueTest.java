package com.eomcs.util3;

public class QueueTest {
  public static void main(String[] args) {
    Queue qq = new Queue();
    
    qq.offer(1);
    qq.offer(2);
    qq.offer(3);
    qq.offer(4);
    qq.offer(5);
    System.out.println(qq.poll());
    System.out.println(qq.poll());
    System.out.println(qq.poll());
    System.out.println(qq.poll());
    System.out.println(qq.poll());
  }
}
