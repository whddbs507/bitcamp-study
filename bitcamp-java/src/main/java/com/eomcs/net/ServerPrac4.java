package com.eomcs.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPrac4 {
  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(23456);
    Socket socket = serverSocket.accept();
    
    Scanner keyScan = new Scanner(System.in);
    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
    Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()));
    
    String receiveMsg = in.nextLine();
    System.out.printf("클라이언트 : %s\n", receiveMsg);
    
    System.out.print("입력 >> ");
    String sendMsg = keyScan.nextLine();
    out.println(sendMsg);
    
    out.flush();
    
    keyScan.close();
    serverSocket.close();
    socket.close();
    out.close();
    in.close();
  }
}