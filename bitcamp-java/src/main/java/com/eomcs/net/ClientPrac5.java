package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac5 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 23456);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    System.out.println("서버와 연결되었음!");
    
    out.print("안녕?");
    out.println();
    System.out.println("서버에 데이터를 보냈음!");
    
    
    String recvMsg = in.next();
    System.out.println(recvMsg);
    System.out.println("서버에 데이터를 받음!");
    
    out.close();
    in.close();
    socket.close();
  }
}
