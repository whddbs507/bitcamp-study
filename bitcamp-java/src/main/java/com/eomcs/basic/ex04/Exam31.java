package com.eomcs.basic.ex04;

public class Exam31 {
  public static void main(String[] args) {
    // 부동소수점 변수 - 메모리 크기
    float f;    // 7자리까지
    
    f = 3.141592f;    // 7자리
    System.out.println(f);

    f = 3.1415929f;   // 8자리
    System.out.println(f);

    f = 0.0000003141592f;     // 0이 소수점 아래일 때는 0은 자릿수로 안샘
    System.out.println(f);

    f = 0.00000031415929f;
    System.out.println(f);

    f = 3141592900000.0f;   // 0이 소수점 위일때는 뒤의 0을 자릿수로 계산
    System.out.println(f);

    double d;   // 15자리까지

    d = 9.87654321234567;   // 7자리
    System.out.println(d);

    d = 98765432.1234567;
    System.out.println(d);

    d = 98765432123456.7;
    System.out.println(d);

    d = 98765432123456.74;   // 8자리
    System.out.println(d);

    // 변수와 리터럴
    f = 99999.88f;
    System.out.println(f);

    f = 99999.887777f;    // 이미 리터럴이 4바이트 유효자릿수를 넘어감.
    System.out.println(f);

    d = 99999.88f;    // 4바이트를 8바이트에 넣을 때
    System.out.println(d);

    d = 99999.88;   // 8바이트를 8바이트에 넣을 때
    System.out.println(d);

    // 4바이트 리터럴은 4바이트에 넣고
    // 8바이트 리터럴은 8바이트에 넣는걸 권고

    // 부동소수점은 뒤에 아무것도 안붙을 때 8바이트
    // f가 붙으면 4바이트


    float f1 = 99988.88f;
    float f2 = 11.11111f;
    System.out.println(f1);
    System.out.println(f2);
    
    float f3 = f1 + f2;     // 99988.88
    System.out.println(f3); //    11.11111
                            // ------------
                            // 99999.99111

    double r = f1 + f2;   // float + float = float 이미 결과에서 값이 왜곡된다.
    System.out.println(r);

    double d1 = 99988.88;
    double d2 = 11.11111;
    System.out.println(d1);
    System.out.println(d2);

    double t = d1 + d2;   // double + double = double 정상
    System.out.println(t);

    f1 = 3.141592f;
    d1 = f1;    // 컴파일 ok. 단, 값이 왜곡될 수 있다.
    System.out.println(d1);

    // f1 = d1;    // 컴파일 오류, double값을 float값에 넣을 수 없다.
  }
}