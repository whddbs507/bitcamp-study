package com.eomcs.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac3 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(12345); 
    Socket socket = serverSocket.accept();
    
    OutputStream out = socket.getOutputStream();
    InputStream in = socket.getInputStream();
    
    byte[] buf = new byte[100];
    int size = in.read(buf);
    System.out.printf("읽은 바이트 수 : %d\n", size);
    
    for(int i = 0; i < size; i++) {
      if (i % 20 == 0) {
        System.out.println();
      }
      System.out.printf("%d ", buf[i]);
    }
    
    out.write(buf, 0, size);
    
    out.close();
    in.close();
    serverSocket.close();
    socket.close();
  }
}
