package com.eomcs.oop.ex11.pracC;

public class Exam0110 {
  public static void main(String[] args) {
    Product p = new Product();
    p.category = "TV";
    p.name = "울트라비전 뷰";
    p.price = 2000000;
    
    Product p2 = new Product();
    p2.category = "computer";
    p2.name = "삼성모듈램 4GB";
    p2.price = 80000;
    
    Product p3 = new Product();
    p3.category = "bok"; // 책 / 소설
    p3.name = "토지";
    p3.price = 18000;
  }
}