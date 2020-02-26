package com.eomcs.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac23 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();

    PrintStream out = new PrintStream(socket.getOutputStream());
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    String[] input = in.readLine().split(" ");
    
    int a = Integer.parseInt(input[0]);
    String op = input[1];
    int b = Integer.parseInt(input[2]);
    
    out.println(a + b);
  }
}