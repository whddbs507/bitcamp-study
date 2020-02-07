package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
  public static void main(String[] args) throws Exception {
    System.out.println("<< 서버 >>");
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();
    Scanner keyScan = new Scanner(System.in);
    PrintStream out= new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    while(true) {
      String message = in.nextLine();
      System.out.printf("클라이언트 : %s\n", message);

      System.out.print("서버 >> ");
      String sendMsg = keyScan.nextLine();
      out.println(sendMsg);
      if (sendMsg.equals("quit")) {
        break;
      }
    }
    out.close();
    in.close();
    
    serverSocket.close();
    socket.close();
  }
}