package com.eomcs.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  public static void main(String[] args) throws Exception {
    System.out.println("서버 수업 관리 시스템입니다.");
    
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("클라이언트 연결 대기 중");
    
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트 연결되었음!");

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    System.out.println("통신을 위한 소켓 입출력 스트림 준비하였음!");
    
    String message = in.nextLine();
    System.out.printf("Client: %s\n", message);
    System.out.println("상대편이 보낸 메시지를 수신하였음!");
    
    out.println("그래요!!!!!");
    
    in.close();
    out.close();
    
    socket.close();
    serverSocket.close();
  }
}
