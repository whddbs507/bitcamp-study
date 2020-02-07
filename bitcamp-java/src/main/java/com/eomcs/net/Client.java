package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    out.println("안녕하세요!!");
    
    String message = in.nextLine();
    System.out.printf("Server: %s", message);
    
    in.close();
    out.close();
    
    socket.close();
  }
}