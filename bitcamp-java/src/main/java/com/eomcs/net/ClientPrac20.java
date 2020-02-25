package com.eomcs.net;

import java.net.Socket;

public class ClientPrac20 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);
    System.out.println("서버에 연결됨!");
  }
}
