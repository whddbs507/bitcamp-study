package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPrac5 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(23456);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    System.out.println("클라와 연결되었음!");
    
    String recvMsg = in.next();
    System.out.println(recvMsg);
    System.out.println("클라에서 데이터를 받음!");
    
    out.print("그래요 ^^");
    out.println();
    System.out.println("클라에서 데이터 보냄!");
    
    out.close();
    in.close();
    socket.close();
    serverSocket.close();
  }
}
