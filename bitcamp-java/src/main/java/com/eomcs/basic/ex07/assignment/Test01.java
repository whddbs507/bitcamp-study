package com.eomcs.basic.ex07.assignment;

public class Test01 {
  public static void main(String[] args) {
    // 배열의 값 중에서 최대 값을 출력하라.
    
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    int value = max(values);
    System.out.println(value);
  }
  static int max(int[] values) {
    // 파라미터로 배열을 받고 그 값 중에서 최대 값을 찾아 리턴한다.
    int max = 0;
    for (int i = 0; i < 9; i++) {
      if (values[i] > max) {
        max = values[i];
      } 
    }
    return max;
  }
}
