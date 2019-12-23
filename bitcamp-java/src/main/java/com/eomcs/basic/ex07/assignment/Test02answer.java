package com.eomcs.basic.ex07.assignment;

public class Test02answer {
  
  public static void main(String[] args) throws Exception {

    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    sort(values);   // 배열에 들어있는 값을 오름차순으로 정렬을 수행

    System.out.println("--------------------");

    Thread.currentThread().sleep(1000);
    
  }

  //출력 결과 : { -22, -3, 0, 4, 12, 22, 34, 45, 78}
  // 메서드 완성
  static int[] sort(int[] valuezz) throws Exception {
    // 크기 비교를 위해 현재 위치의 값과 앞 쪽의 값을 비교해야 한다.
    // 따라서 배열 개수 만큼 반복하지 말고 한 번 적게 반복해야 한다.
    // 다음 반복문을 한 번 돌면 가장 큰 수가 맨 오른쪽에 놓인다.
    int sort = 0;
    int temp = 0;
    
    for (int x = (valuezz.length - 1); x > 0; x--) {
      for (int i = 0; i < valuezz.length - 1; i++) {
        Thread.currentThread().sleep(1000);
        printValues(valuezz, i);
        if (valuezz[i] > valuezz[i + 1]) {
          temp = valuezz[i];
          valuezz[i] = valuezz[i + 1];
          valuezz[i + 1] = temp;
          Thread.currentThread().sleep(1000);
          printValues(valuezz, i);
        }
      }
    }
    return valuezz;
  }


  static void printValues(int[] values) {
    for (int i = 0; i < values.length; i++) {
      System.out.printf("%3d  ", values[i]);
    }
    System.out.println();
  }

  static void printValues(int[] values, int currPos) {
    for (int i = 0; i < values.length; i++) {
      if (i == currPos) {
        System.out.printf("%3d <- ", values[i]);
      } else {
        System.out.printf("%3d    ", values[i]);
      }
    }
    System.out.println();
  }
}
