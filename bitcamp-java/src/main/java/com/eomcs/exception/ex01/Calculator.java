package com.eomcs.exception.ex01;

public class Calculator {
  static int compute(String operator, int a, int b) {
    if (operator == "+") 
      return a + b;
    if (operator == "-")
      return a - b;
    if (operator == "*")
      return a * b;
    if (operator == "/")
      return a / b;
    else {
      throw RuntimeException("해당 연산자 지원 안해");
    }
  } 
}
