package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac7 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    
    
    int firstInt = in.readInt();
    String op = in.readUTF();
    int secondInt = in.readInt();
    
    int sum = 0;
    System.out.println(op);
    
    if (op.equals("+")) {
      sum = firstInt + secondInt;
    }
    if (op.equals("-")) {
      sum = firstInt - secondInt;
    }
    if (op.equals("*")) {
      sum = firstInt * secondInt;
    }
    if (op.equals("/")) {
      sum = firstInt / secondInt;
    }
    System.out.println(sum);
    System.out.println("계산함");
    
    out.print(sum);
    System.out.println("값보냄");
    
    serverSocket.close();
    socket.close();
    out.close();
    in.close();
  }
}
