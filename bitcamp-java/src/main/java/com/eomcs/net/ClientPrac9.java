package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac9 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 7777);
    
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
  }
}