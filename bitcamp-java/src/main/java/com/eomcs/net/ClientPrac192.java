package com.eomcs.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac192 {
  public static void main(String[] args) throws Exception {
    long clientID = 0;
    Scanner keyScan = new Scanner(System.in);
    
    while(true) {
      Socket socket = new Socket("localhost", 7777);
      
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      DataInputStream in = new DataInputStream(socket.getInputStream());
      
      out.writeLong(clientID);
      
      System.out.print("연산자 : ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.print("숫자 : ");
      int value = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(value);
      
      clientID = in.readLong();
      int sum = in.readInt();
      System.out.printf("합계 : %d\n", sum);
      
      System.out.print("계속 입력하실래요?(Y/n)");
      String str =keyScan.nextLine();
      
      if(str.equalsIgnoreCase("n")) {
        break;
      }
    }
  }
}
