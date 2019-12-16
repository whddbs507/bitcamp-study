package com.eomcs.basic.ex05;

// 관계 연산자 : <, <=, >, >=, ==, !=  
public class Exam2_1 {
    public static void main(String[] args) {
        // 비교의 결과는 true 또는 false이다.
        // 즉 boolean 값이다.
        int a = 10;
        int b = 20;
        
        // 비교의 결과는 true 또는 false이다.
        // 즉 boolean 값이다.
        boolean r1 = a < b; // true
        //int r2 = a < b; // 컴파일 오류!

        System.out.println(a < b); // true
        System.out.println(a <= b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true

    }
}
