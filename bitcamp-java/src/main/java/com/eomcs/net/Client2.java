package com.eomcs.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
  public static void main(String[] args) throws Exception {
    
    String serverAddr = null;
    int port = 0;
    Scanner keyScan = new Scanner(System.in);
    
    try {
      System.out.print("서버 IP >> ");
      serverAddr = keyScan.nextLine();
      System.out.print("포트 번호 >> ");
      port = keyScan.nextInt();
      keyScan.nextLine();
      
    } catch(Exception e) {
      System.out.println("서버 주소 또는 포트 번호가 유효하지 않습니다.");
      return;
    }
    
    try {
      Socket socket = new Socket(serverAddr, port);
      
      PrintStream out = new PrintStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      
      System.out.print("서버에 보낼거 입력 : ");
      String sendMsg = keyScan.nextLine();
      out.println(sendMsg);
      
      String message = in.nextLine();
      System.out.println(message);
      
      in.close();
      out.close();
    } catch(Exception e) {
      System.out.println("예외 발생");
      e.printStackTrace();
      return;
    }
    keyScan.close();
  }
}
