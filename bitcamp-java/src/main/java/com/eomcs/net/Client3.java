package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
  public static void main(String[] args) throws Exception {
    System.out.println("<< 클라이언트 >>");
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("IP => ");
    String ip = keyScan.nextLine();
    System.out.print("Port => ");
    int port = keyScan.nextInt();
    keyScan.nextLine();
    
    Socket socket = new Socket(ip, port);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    while (true) {
      System.out.print("클라이언트 >> ");
      String sendMsg = keyScan.nextLine();
      out.println(sendMsg);
      
      String message = in.nextLine();
      System.out.printf("서버 : %s\n", message);
      
      if (message.equals("quit")) {
        break;
      }
    }
    out.close();
    in.close();
    
    socket.close();
  }
}
