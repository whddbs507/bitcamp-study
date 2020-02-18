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
    
    @Override
    public void run() {
      // JVM과 분리하여 별도로 실행할 코드를 이 메서드에 둔다.
      try {
        processRequest(socket);
      } catch (Exception e) {
        System.out.println("클라이언트 요청 처리 중 오류 발생!");
      } finally {
        System.out.println("클라이언트 연결 종료!");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    
    while (true) {
      System.out.println("클라이언트의 연결을 기다림");
      Socket socket = serverSocket.accept();
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("클라이언트(%s:%d)가 연결되었음!\n", 
          remoteAddr.getAddress(), remoteAddr.getPort());
      RequestHandler requestHandler = new RequestHandler(socket);
      requestHandler.start();
      System.out.printf("%s 클라이언트와의 대화를 별도의 스레드에서 담당합니다!\n",
          remoteAddr.getAddress());
    }
  }
  
  static void processRequest(Socket socket) throws Exception {
    try (Socket socket2 = socket;
        DataInputStream in = new DataInputStream(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());) {

      // 작업 결과를 유지할 변수
      int result = 0;

      loop: while (true) {
        String op = in.readUTF();
        int a = in.readInt();

        switch (op) {
          case "+":
            result += a;
            break;
          case "-":
            result -= a;
            break;
          case "*":
            result *= a;
            break;
          case "/":
            result /= a;
            break;
          case "quit":
            break loop;
        }

        out.printf("계산 결과: %d\n", result);
      }
      out.println("quit");
    }
  }
}