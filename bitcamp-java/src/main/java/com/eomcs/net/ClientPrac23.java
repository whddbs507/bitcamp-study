package com.eomcs.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientPrac23 {
public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 7777);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    out.println("10 + 20");
    
    String str = in.readLine();
    System.out.println(str);
  }
}
