package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac {
  public static void main(String[] args) throws Exception {
    System.out.println("<< 클라이언트 >>");
    
    Scanner keyScan = new Scanner(System.in);

    System.out.print("서버IP >> ");
    String host = keyScan.nextLine();
    System.out.print("포트 >> ");
    int port = keyScan.nextInt();
    keyScan.nextLine();
    Socket socket = new Socket(host, port);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    while (true) {
      System.out.print("할 말 >> ");
      String sendStr = keyScan.nextLine();
      out.println(sendStr);
      String recvStr = in.nextLine();
      System.out.printf("Server : %s\n", recvStr);
      if (recvStr.equals("quit")) {
        break;
      }
    } 
    
    in.close();
    out.close();
    socket.close();
  }
}