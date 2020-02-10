package com.eomcs.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac2 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(11111);
    Socket socket = serverSocket.accept();
    
    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
    DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    File file = new File("C:/Users/user/git/bitcamp-study/bitcamp-java/temp/ssszzz/jls14.pdf");
    BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream(file));
    
  //1) 파일 크기 읽기
  //2) 파일 이름 읽기
  //3) 파일 데이터 읽기
  //4) 클라이언트에게 응답하기
    long size = in.readLong();
    String name = in.readUTF();
    System.out.printf("파일 사이즈 : %s\n", size);
    System.out.printf("파일 이름 : %s\n", name);
    for (int i = 0; i < size; i++) {
      fileOut.write(in.read());
    }
    
    out.println("잘받았어요 ㅋㅋ");
    
    out.flush();
    
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    fileOut.close();
  }
}