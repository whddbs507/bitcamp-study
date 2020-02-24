// Stateless Client : 편지, https
package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac17 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    while (true) {
      Socket socket = new Socket("localhost", 7777);
      
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      
      System.out.print("연산자 : ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.print("숫자 : ");
      int num = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(num);
      
      int sum = in.nextInt();
      System.out.printf("합계 > %d\n", sum);
      
      System.out.print("계속 하시겠습니까? (Y/n)");
      String str = keyScan.nextLine();
      
      if(str.equalsIgnoreCase("n")) {
        break;
      }
    }
  }
}
