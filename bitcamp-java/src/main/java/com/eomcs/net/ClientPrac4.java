package com.eomcs.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac4 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 23456);
    
    Scanner keyScan = new Scanner(System.in);
    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
    Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()));
    
    long startTime = System.currentTimeMillis();
    System.out.print("입력 >> ");
    String sendMsg = keyScan.nextLine();
    out.println(sendMsg);
    
    out.flush();
    
    String receiveMsg = in.nextLine();
    System.out.printf("서버 : %s\n", receiveMsg);
    long endTime = System.currentTimeMillis();
    
    System.out.println(endTime - startTime);
    
    keyScan.close();
    socket.close();
    out.close();
    in.close();
  }
}