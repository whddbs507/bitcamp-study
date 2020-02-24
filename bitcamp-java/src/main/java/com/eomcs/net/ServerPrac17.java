// Stateless Server
package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerPrac17 {
  
  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행 중.");
    int sum = 0;

    Map<Integer, String> map = new HashMap<>();

    ServerSocket serverSocket = new ServerSocket(7777);
    
    while (true) {
      System.out.println("클라이언트 연결을 기다림!");
      Socket socket = serverSocket.accept();
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("클라이언트(%s:%d)가 연결되었음!\n", remoteAddr.getAddress(), remoteAddr.getPort());
      
      PrintStream out = new PrintStream(socket.getOutputStream());
      DataInputStream in = new DataInputStream(socket.getInputStream());

      long clientID = in.readLong();
      String op = in.readUTF();
      int num = in.readInt();

      switch (op) {
        case "+":
          sum += num;
          break;
        case "-":
          sum -= num;
          break;
        case "*":
          sum *= num;
          break;
        case "/":
          sum /= num;
          break;
      }
      out.println(sum);
    }
  }
}
