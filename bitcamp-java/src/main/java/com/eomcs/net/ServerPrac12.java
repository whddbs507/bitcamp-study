package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac12 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(11111);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    
    String str = in.readUTF();
    System.out.println(str);
    int num = in.read();
    System.out.println(num);
    out.println("ㅎㅎㅎ\n");
  }
}
