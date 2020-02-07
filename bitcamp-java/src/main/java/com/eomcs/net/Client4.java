package com.eomcs.net;

import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;
import java.util.Scanner;

public class Client4 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 7777);
    
    Scanner keyScan = new Scanner(System.in);
    
    Scanner in = new Scanner(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    
    // 1) 파일 크기 보내기
    // 2) 파일 이름 보내기
    // 3) 파일 데이터 보내기
    // 4) 서버에게 응답하기
    
    File file = new File("C:/bin/temp1/ClassDiagram.pdf");
    
    out.writeLong(file.length());
    out.writeUTF(file.getName());
    
    int b;
    for (b = file.) {
      
    }
    
    System.out.println("서버 : " + in.nextLine());
    
    in.close();
    out.close();
    socket.close();
    keyScan.close();
  }
}
