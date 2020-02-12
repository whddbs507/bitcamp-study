package com.eomcs.net;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac7 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket = serverSocket.accept();

    PrintStream out = new PrintStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());


    int firstInt = in.readInt();
    int sum = firstInt;
    System.out.println("11111");
    while (true) {
      System.out.println("22222");
      String op = in.readUTF();
      int secondInt = in.readInt();
      String s = in.readUTF();
      System.out.println("33333");
      int firstSum = sum;

      if (op.equals("+")) {
        sum += secondInt;
      }
      if (op.equals("-")) {

        sum -= secondInt;
      }
      if (op.equals("*")) {

        sum *= secondInt;
      }
      if (op.equals("/")) {

        sum /= secondInt;
      }
      System.out.println("44444");
      out.printf("%d %s %d = %d", firstSum, op, secondInt, sum);
      if (s.equals("n")) {
        break;
      }
    }
    System.out.println("55555");

    serverSocket.close();
    socket.close();
    out.close();
    in.close();
  }
}