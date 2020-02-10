package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPrac {
  public static void main(String[] args) throws Exception {
    System.out.println("<< 서버 >>");
    
    Scanner keyScan = new Scanner(System.in);
    
    ServerSocket serverSocket = new ServerSocket(22222);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    while (true) {
      String recvStr = in.nextLine();
      System.out.printf("Client : %s\n",recvStr);
      System.out.print("할 말 >> ");
      String sendStr = keyScan.nextLine();
      out.println(sendStr);
      if (sendStr.equals("quit")) {
        break;
      }
    }  
    
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
  }
}
