package com.eomcs.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CllientPrac30 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    Socket socket = new Socket("localhost", 7777);
    
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    while (true) {
      String str = in.readLine();
      System.out.println(str);
      
      if(str.length() == 0) {
        break;
      }
    }
    
    System.out.print("입력 >> ");
    String input = keyScan.nextLine();
    out.println(input);
    
    String sum = in.readLine();
    System.out.println(sum);
  }
}