package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;
import com.eomcs.oop.ex01.assignment.tt.St;

public class Test011 {
  public static void main(String[] args) {
    

    
   St[] st = new St[3];
    
    
    Scanner keyScan = new Scanner(System.in); 
    System.out.println("이름, 국어, 영어, 수학");
    for (int i = 0; i < 3; i++) {
      St sst = new St();
      System.out.print("입력 > ");
      sst.name = keyScan.next();      
      sst.kor = keyScan.nextInt();
      sst.eng = keyScan.nextInt();
      sst.math = keyScan.nextInt();
      sst.total = sst.kor + sst.eng + sst.math;
      sst.avg = (sst.kor + sst.eng + sst.math) / 3;
      st[i] = sst; 
      keyScan.nextLine();
    }
    
    for (int i = 0; i < 3; i++) {
      System.out.printf("%s  %d  %d  %d  %d  %d\n", st[i].name, st[i].kor
          , st[i].eng, st[i].math, st[i].total, st[i].avg);
    }
  }
}