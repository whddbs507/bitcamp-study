package com.eomcs.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrac30 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(7777);
    Socket socket= serverSocket.accept();

    PrintStream out = new PrintStream(socket.getOutputStream());
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    out.println("@@@계산기 서버에 오신 걸 환영합니다@@@");
    out.println("계산식을 입력하세요!");
    out.println("예) 11 + 7 ");
    out.println();
    
    String request = in.readLine();
    String[] requests = request.split(" ");
    
    int firstNo = Integer.parseInt(requests[0]);
    String op = requests[1];
    int secondNo = Integer.parseInt(requests[2]);
    int sum = 0;
    
    switch (op) {
      case "+":
        sum = firstNo + secondNo;
        break;
      case "-":
        sum = firstNo - secondNo;
        break;
      case "*":
        sum = firstNo * secondNo;
        break;
      case "/":
        sum = firstNo / secondNo;
        break;
    }
    
    out.printf("결과는 %d입니다.\n", sum);
  }
}