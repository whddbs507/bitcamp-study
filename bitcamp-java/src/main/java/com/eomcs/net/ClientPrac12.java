package com.eomcs.net;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac12 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    Socket socket = new Socket("localhost", 11111);
    
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    String str = keyScan.nextLine();
    out.writeUTF(str);
    
    int num = keyScan.nextInt();
    keyScan.nextLine();
    out.writeInt(num);
    System.out.println(in.nextLine());
    out.close();
    socket.close();
  }
}
