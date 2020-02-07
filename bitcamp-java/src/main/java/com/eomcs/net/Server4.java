package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server4 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();
    
    Scanner keyScan = new Scanner(System.in);
    
    DataInputStream in = new java.io.DataInputStream(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    System.out.println("데이터 크기 : " + in.readLong());
    System.out.println("데이터 이름 : " + in.readUTF());
    
    out.println("파일 ㄳ");
    //1) 파일 크기 읽기
    //2) 파일 이름 읽기
    //3) 파일 데이터 읽기
    //4) 클라이언트에게 응답하기
    
    out.close();
    in.close();
    serverSocket.close();
    socket.close();
    keyScan.close();
  }
}
