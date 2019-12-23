package com.eomcs.basic.ex07.assignment;

public class Test01answer {
  public static void main(String[] args) {
    // 배열의 값 중에서 최대 값을 출력하라.
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    
    int value = max(values);    // 메서드 호출 // values -> 아규먼트(argument)
    
    System.out.println(value);  // 출력결과 : 78
  }
  static int max(int[] values) {    // values -> 파라미터(parameter)
    // 파라미터로 배열을 받고 그 값 중에서 최대 값을 찾아 리턴한다.
    int maxValue = values[0];
    for (int i = 0; i < values.length; i++) {
      if (values[i] > maxValue) {
        maxValue = values[i];
      } 
    }
    return maxValue;
  }
}
