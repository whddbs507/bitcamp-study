package com.eomcs.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientPrac3 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 12345);
    
    OutputStream out = socket.getOutputStream();
    InputStream in = socket.getInputStream();

    // 서버에 보낼 바이트 배열을 준비한다.
    // => 0 ~ 99 의 값을 가진 배열이다.
    byte[] bytes = new byte[100];
    for (int i = 0; i < 100; i++) {
      bytes[i] = (byte)i;
    }
    out.write(bytes);
    
    byte[] buf = new byte[100];
    int size = in.read(buf); 
    
    for(int i = 0; i < size; i++) {
      if (i % 20 == 0) {
        System.out.println();
      }
      System.out.printf("%d ", buf[i]);
    }
    
    out.write(buf, 0, size);
    
    out.close();
    in.close();
    socket.close();
  }
}
