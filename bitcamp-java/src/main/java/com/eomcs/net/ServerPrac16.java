// Stateful Server
package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac16 {

  static class ThreadClient extends Thread {
    int sum = 0;
    Socket socket;

    ThreadClient(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      try {
        PrintStream out = new PrintStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        while (true) {
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
          out.printf("%d\n", sum);
        }
      } catch(Exception e) {

      }
    }
  }
  
  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(7777);

    while (true) {
      System.out.println("서버 접속 중");
      Socket socket = serverSocket.accept();

      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("클라이언트 -> %s:%d\n", remoteAddr.getAddress(), remoteAddr.getPort());
      ThreadClient threadClient = new ThreadClient(socket);
      threadClient.start();
    }
  }
}
