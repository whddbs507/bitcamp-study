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
  static Map<Long, Integer> map = new HashMap<>();
  
  static class ThreadClient extends Thread {
    Socket socket;
    
    ThreadClient(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      try {
        processRequest(socket);
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행 중.");

    ServerSocket serverSocket = new ServerSocket(7777);
    
    while (true) {
      System.out.println("클라이언트 연결을 기다림!");
      Socket socket = serverSocket.accept();
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("클라이언트(%s:%d)가 연결되었음!\n", remoteAddr.getAddress(), remoteAddr.getPort());
     
      ThreadClient threadClient = new ThreadClient(socket);
      threadClient.start();
      
      System.out.printf("%s 클라이언트 요청을 스레드에게 처리 중.\n", remoteAddr.getAddress());
    }
  }
  
  static void processRequest(Socket socket) throws Exception {
    int sum = 0;
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    long clientID = in.readLong();
    String op = in.readUTF();
    int value = in.readInt();
    
    Integer obj = map.get(clientID);
    
    if (clientID == 0) {
      clientID = System.currentTimeMillis();
      System.out.printf("신규 클라이언트 ID\n -> %d", clientID);
    } else {
      System.out.printf("기존 클라이언트 ID\n -> %d", clientID);
      sum = obj;
    }
    

    switch (op) {
      case "+":
        sum += value;
        break;
      case "-":
        sum -= value;
        break;
      case "*":
        sum *= value;
        break;
      case "/":
        sum /= value;
        break;
    }
    System.out.println(sum);
    map.put(clientID, sum);
    
    out.println(clientID);
    out.println(sum);
  }
}