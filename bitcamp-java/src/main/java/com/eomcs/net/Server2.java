package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
  public static void main(String[] args) throws Exception {
    try {
      Scanner keyScan = new Scanner(System.in);
      
      System.out.println("서버 수업 관리 시스템입니다.");

      ServerSocket serverSocket = new ServerSocket(7777);
      System.out.println("서버소켓 생성!");
      System.out.println("클라이언트 연결 대기중...");

      Socket socket = serverSocket.accept();
      System.out.println("클라이언트와 연결 준비 완료!");

      PrintStream out = new PrintStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      System.out.println("통신을 위한 입출력 스트림을 준비하였음!");
      
      while(true) {
        try {
          String message = in.nextLine();
          System.out.printf("클라이언트 : %s\n" , message);
          
          System.out.print("서버 >> ");
          String sendMsg = keyScan.nextLine();
          out.print(sendMsg);

        } catch(Exception e) {
          System.out.print("예외 발생 : ");
          return;
        }
      }
    } catch (Exception e) {
      System.out.println("서버 준비 중 오류 발생");
      return;
    }
  }
}