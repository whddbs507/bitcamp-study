package com.eomcs.basic.ex03;

// 정수 리터럴(literal) - _ (언더바)

public class Exam22 {
  public static void main(String[] args) {
    // 10진수 리터럴
    System.out.println(2_3500_0000);
    System.out.println(235_000_000);
    // System.out.println(_235_000_000); (맨 앞자리 _ 안됨)
    // System.out.println(235_000_000_); (맨 뒷자리 _ 안됨)

    // 8진수 리터럴
    System.out.println(01_44);
    System.out.println(0_144); 
    // System.out.println(_0144); (맨 앞자리 _ 안됨)
    // System.out.println(0144_); (맨 뒷자리 _ 안됨)

    // 16진수 리터럴
    System.out.println(0x64);
    // System.out.println(_0x64); (맨 앞자리 _ 안됨)
    // System.out.println(0x64_); (맨 뒷자리 _ 안됨)

    // 2진수 리터럴
    System.out.println(0b1100100);
    // System.out.println(_0b1100100); (맨 앞자리 _ 안됨)
    // System.out.println(0b1100100_); (맨 뒷자리 _ 안됨)

  }
}