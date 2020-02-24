// Stateful Client : 채팅, 게임
package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac162 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    Socket socket = new Socket("localhost", 7777);
    
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    while (true) {
      System.out.print("연산자 입력 : ");
      String op = keyScan.nextLine();
      out.writeUTF(op);
      
      System.out.print("숫자 입력 : ");
      int num = keyScan.nextInt();
      keyScan.nextLine();
      out.writeInt(num);
      
      int sum = in.nextInt();
      System.out.print("합계 > ");
      System.out.println(sum);
    }
  }
}
