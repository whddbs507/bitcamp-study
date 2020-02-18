package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac11 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    Socket socket = new Socket("localhost", 6666);
    
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    while(true) {
      
      System.out.print("연산자 : ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.print("숫자 : ");
      int num = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(num);
      
      int aa = in.nextInt();
      System.out.println(aa);
      
    }
    
  }
}
