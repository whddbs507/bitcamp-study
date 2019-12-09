package com.eomcs.basic.ex03;

// 부동소수점 리터럴(literal) - 부동소수점의 리터럴은 기본이 왜 8바이트인가?

public class Exam342 {
  public static void main(String[] args) {

    System.out.println(54345.66f);
    System.out.println(11.23456f);
    //  54345.66      (7자리 : OK)
    //     11.23456   (7자리 : OK)
    // ------------
    //  54356.89456   (10자리 : 계산 결과가 유효자릿수를 넘는다)
    System.out.println(54345.66f + 11.23456f);

    // 실행 결과를 보면 기대했던 수가 출력되지 않는다.
    // 왜?
    // 각각의 수는 유효자릿수이지만, 계산 결과는 유효자릿수를 넘어간다.
    //     => 이렇게 작은 부동소수점인 경우도 유효자릿수를
    //        쉽게 넘어가기 때문에, 자바는 기본적으로 8바이트 사용
              
    // 결론 : 자바로 프로그래밍을 할 때 부동소수점은 8바이트 사용!!
    
  }
}
