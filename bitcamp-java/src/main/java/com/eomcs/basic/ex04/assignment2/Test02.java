package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String aaa;

    System.out.println("사용자 : 가위 / 바위 / 보 선택해주세요!!");
    String inputUser = keyboard.nextLine();

    int iUser = 0;
    if (inputUser.equals("가위")) {
      inputUser = "가위";
      iUser = 1;
    } else if (inputUser.equals("바위")) {
      inputUser = "바위";
      iUser = 2;
    } else if (inputUser.equals("보")) {
      inputUser = "보";
      iUser = 3;
    } else {
      System.out.println("잘못 선택했습니다!!");
      return;
    }
    

    int inputComputer = (int)((Math.random() * 10) % 3 + 1);
    if (inputComputer == 1) {
      System.out.printf("사용자 : %s\n", inputUser);
      System.out.printf("컴퓨터 : 가위");
    } else if (inputComputer == 2) {
      System.out.printf("사용자 : %s\n", inputUser);
      System.out.printf("컴퓨터 : 바위");
    } else if (inputComputer == 3) {
      System.out.printf("사용자 : %s\n", inputUser);
      System.out.printf("컴퓨터 : 보");
    }


    if (inputComputer == iUser) {
      System.out.println("\n비겼습니다!");
    } else if ((inputComputer == 1 && iUser == 2) || (inputComputer == 2 && iUser == 3) || inputComputer == 3 && iUser == 1 ){
      System.out.println("\n이겼습니다!"); 
      } else if ((inputComputer == 2 && iUser == 1) || (inputComputer == 3 && iUser == 2) || inputComputer == 1 && iUser == 3 ){
        System.out.println("\n졌습니다!");
    }
  } 
}