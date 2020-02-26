package com.eomcs.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class ServerPrac20 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    DatagramSocket socket = new DatagramSocket(8888);
    
    byte[] buf = new byte[8196];
    
    DatagramPacket emptyPacket = new DatagramPacket(buf, buf.length);
    
    System.out.println("데이터를 받기 전에 잠깐 멈춤>");
    keyScan.nextLine();
    
    socket.receive(emptyPacket);
    
    String message = new String(emptyPacket.getData(), 0, emptyPacket.getLength(), "UTF-8");
    
    System.out.println(message);
  }
}
