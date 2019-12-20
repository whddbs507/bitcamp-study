package com.eomcs.basic.ex07.assignment;

public class Test03 {
  public static void main(String[] args) {
    
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    // 배열의 들어 있는 값을 순서를 거꾸로 바꿔라.
    reverse(values);   
    
    for (int value : values) {
      System.out.print(value + "   ");
    }
  }
  
  static int[] reverse(int[] array) {
    int i = 0;
    int j = 0;
    int temp = 0;
    
    for (i = 0; i < 9 / 2 ; i++) {
      j = 8 - i;
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
    return array;
  }
  
  // 출력 결과 : { -22, 0, 45, 22, 12, 78, -3, 4, 34}
}
