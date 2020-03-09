package com.eomcs.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac24 {
  public static void main(String[] args) throws Exception{
    Scanner keyScan = new Scanner(System.in);
    
    Socket socket = new Socket("localhost", 7777);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    while (true) {
      String read = in.readLine();
      System.out.println(read);
      if (read.length() == 0) {
        break;
      }
    }
    
    System.out.print("> ");
    String input = keyScan.nextLine();
    out.println(input);
  }
}
