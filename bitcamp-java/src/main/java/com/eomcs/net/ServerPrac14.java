package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac14 {
  public static class RemoteClient extends Thread {
    Socket socket;
    
    public RemoteClient(Socket socket) {
      this.socket = socket;
    }
    
    @Override 
    public void run() {
      try {
        PrintStream out = new PrintStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        
        int sum = 0;
        
        while (true) {
          String op = in.readUTF();
          int num = in.readInt();
          
          switch(op) {
            case "+":
              sum += num;
              break;
            case "-":
              sum -= num;
              break;
            case "*":
              sum *= num;
              break;
            case "/":
              sum /= num;
              break;
          }
          out.printf("합계 >>> %d\n", sum);
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(33322);
    
    while (true) {
      System.out.println("연결 대기 중.");
      
      Socket socket = serverSocket.accept();
      
      InetSocketAddress remoteAddr = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.printf("연결 완료 (%s:%d)\n", remoteAddr.getAddress(), remoteAddr.getPort());
      
      RemoteClient remoteClient = new RemoteClient(socket);
      remoteClient.start();
    }
  }
}