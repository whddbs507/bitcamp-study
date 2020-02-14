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

    while (true) {

      System.out.println("연산자를 입력하세요 >> ");
      String op = keyScan.nextLine();
      out.writeUTF(op);

      System.out.print("숫자를 입력하세요 >> ");
      int secondInt = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(secondInt);

      System.out.println("계속 입력?(y/n)");
      String s = keyScan.next();
      keyScan.nextLine();
      out.writeUTF(s);
      String ss = in.nextLine();
      System.out.println(ss);

      if(s.equals("n")) {
        break;
      }
    }
    socket.close();
    out.close();
    in.close();
  }
}