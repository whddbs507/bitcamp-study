// Stateful Server
package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac18 {

  static class ThreadClient extends Thread {
    Socket socket;

    ThreadClient(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      while(true) {
        try {
          processRequest(socket);
        } catch(Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);

    while(true) {
      Socket socket = serverSocket.accept();

      ThreadClient threadClient = new ThreadClient(socket);
      threadClient.start();

    }

  }

  static void processRequest(Socket socket) throws Exception {
    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    int sum = 0;
    
    while(true) {
      String op = in.readUTF();
      int value = in.readInt();

      switch (op) {
        case "+":
          sum += value;
          break;
        case "-":
          sum -= value;
          break;
        case "*":
          sum *= value;
          break;
        case "/":
          sum /= value;
          break;
      }
      out.println(sum);
      
      if(op.equals("exit")) {
        break;
      }
    }

  }
}
