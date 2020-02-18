package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerPrac11 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(6666);
    int sum = 0;
    
    while (true) {
      System.out.println("사용자 접속 대기 중.");
      Socket socket = serverSocket.accept();
      
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("사용자 접속(%s:%d)", remoteAddr.getAddress(), remoteAddr.getPort());
      
      PrintStream out = new PrintStream(socket.getOutputStream());
      DataInputStream in = new DataInputStream(socket.getInputStream());
      
      System.out.println();
      String op = in.readUTF();
      int num = in.readInt();
      System.out.println(op);
      System.out.println(num);
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
