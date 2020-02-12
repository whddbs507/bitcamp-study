package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac7 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 7777);

    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    Scanner keyScan = new Scanner(System.in);

    System.out.println("연결성공");

    System.out.print("숫자를 입력하세요 >> ");
    int firstInt = keyScan.nextInt();
    keyScan.nextLine();
    out.writeInt(firstInt);
    System.out.println("11111");
    while (true) {
      System.out.println("22222");
      System.out.println("연산자를 입력하세요 >> ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.println("33333");
      System.out.print("숫자를 입력하세요 >> ");
      int secondInt = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(secondInt);
      
      System.out.println("44444");
      System.out.println("계속 입력?(y/n)");
      String s = keyScan.next();
      keyScan.nextLine();
      out.writeUTF(s);
      System.out.println(in.nextLine());
      System.out.println("55555");

      if(s.equals("n")) {
        System.out.println("66666");
        break;
      }
    }
    System.out.println("77777");

    socket.close();
    out.close();
    in.close();
  }
}
