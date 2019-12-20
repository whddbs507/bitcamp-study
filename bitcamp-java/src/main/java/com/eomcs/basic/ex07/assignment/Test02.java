package com.eomcs.basic.ex07.assignment;

public class Test02 {
  public static void main(String[] args) {

    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    sort(values);   // 배열에 들어있는 값을 오름차순으로 정렬을 수행

    for (int value : values) {
      System.out.print(value +"  ");
    }
  }
  //출력 결과 : { -22, -3, 0, 4, 12, 22, 34, 45, 78}
  // 메서드 완성
  static int[] sort(int[] valuezz) {
    int sort = 0;
    int temp = 0;

    for (int i = 0; i < 8; i++) {
      for (int j = 1; j < 9-i; j++) {
        if (valuezz[i] > valuezz[i+j]) {
          temp = valuezz[i+j];
          valuezz[i+j] = valuezz[i];
          valuezz[i] = temp;
        }
      } 
    }
    return valuezz;
  }
}
