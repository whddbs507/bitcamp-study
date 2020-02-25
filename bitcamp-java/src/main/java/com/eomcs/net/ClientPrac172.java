// Stateless Client : 편지, https
package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac172 {
  public static void main(String[] args) throws Exception {
    long clientID = 0;
    Scanner keyScan = new Scanner(System.in);
    
    while (true) {
      Socket socket = new Socket("localhost", 7777);
      
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      
      out.writeLong(clientID);
      System.out.print("연산자 : ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.print("숫자 : ");
      int value = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(value);
      
      clientID = in.nextLong();
      in.nextLine();
      int sum = in.nextInt();
      System.out.printf("합계 > %d,  %d\n", sum, clientID);
      
      System.out.print("계속 하시겠습니까? (Y/n)");
      String str = keyScan.nextLine();
      
      if(str.equalsIgnoreCase("n")) {
        break;
      }
    }
  }
}
