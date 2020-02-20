// Stateless 다중 클라이언트 통신
package com.eomcs.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerPrac15 {

  static Map<Long, Integer> resultMap = new HashMap<>();

  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(7777);
    
    while (true) {
      Socket socket = serverSocket.accept();

      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      DataInputStream in = new DataInputStream(socket.getInputStream());

      long clientID = in.readLong();
      int result = resultMap.get(clientID);

      if(clientID == 0) {
        clientID = System.currentTimeMillis();
        System.out.printf("신규 고객(%d)입니다!\n", clientID);
      } else {
        System.out.printf("기존 고객(%d)입니다!\n", clientID);
      }
      
      
      String op = in.readUTF();
      int num = in.readInt();

      switch(op) {
        case "+":
          result += num;
          break;
        case "-":
          result -= num;
          break;
        case "*":
          result *= num;
          break;
        case "/":
          result /= num;
          break;
      }
      
      
      out.writeLong(clientID);
      out.writeInt(result);
      
      resultMap.put(clientID, result);
    }
  }
}