package com.eomcs.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac2 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 11111);
    
    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()));
 // 1) 파일 크기 보내기
 // 2) 파일 이름 보내기
 // 3) 파일 데이터 보내기
    File file = new File("C:/Users/user/git/bitcamp-study/bitcamp-java/temp/jls11.pdf");
    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));
    
    long startTime = System.currentTimeMillis();
    
    out.writeLong(file.length());
    out.writeUTF(file.getName());
    
    int byteCode;
    while ((byteCode = fileIn.read()) != -1) {
      out.write(byteCode);
    }
    out.flush();
    
    long endTime = System.currentTimeMillis();
    System.out.printf("실행 시간 : %d\n", endTime - startTime);
    
    String recvStr = in.nextLine();
    System.out.printf("서버 : %s\n", recvStr);
    
    in.close();
    out.close();
    socket.close();
    fileIn.close();
  }
}