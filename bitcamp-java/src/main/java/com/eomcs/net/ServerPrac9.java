package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerPrac9 {
  
  static class RequestHandler extends Thread {
    Socket socket;
    
    public RequestHandler(Socket socket) {
      this.socket = socket;
    }
  }

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    
    while (true) {
      System.out.println("클라이언트의 연결을 기다림");
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("클라이언트(%s:%d)가 연결되었음!\n", 
          remoteAddr.getAddress(), remoteAddr.getPort());
      RequestHandler requestHandler = new RequestHandler(socket);
      requestHandler.start();
      requestHandler.run();
      System.out.printf("%s 클라이언트와의 대화를 별도의 스레드에서 담당합니다!\n",
          remoteAddr.getAddress());
    }
  } 
}