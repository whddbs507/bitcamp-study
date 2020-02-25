package com.eomcs.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerPrac19 {
  static Map<Long, Integer> map = new HashMap<>();
  
  static class ThreadClient extends Thread {
    Socket socket;
    
    public ThreadClient(Socket socket) {
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
    ServerSocket serverSocket = new ServerSocket(7777);
    
    while(true) {
      Socket socket = serverSocket.accept();
      
      ThreadClient threadClient = new ThreadClient(socket);
      threadClient.start();
    }
  }
  
  static void processRequest(Socket socket) throws Exception {
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    
    int sum = 0;
    
    long clientID = in.readLong();
    String op = in.readUTF();
    int value = in.readInt();
    
    Integer obj = map.get(clientID);
    
    if (clientID == 0) {
      clientID = System.currentTimeMillis();
      System.out.printf("새로운 고객 ID >> %d", clientID);
    } else {
      System.out.printf("기존 고객 ID >> %d", clientID);    
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
    
    out.writeLong(clientID);
    out.writeInt(sum);
    map.put(clientID, sum);
  }
}