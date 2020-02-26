package com.eomcs.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerPrac21 {
  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket(8888);
    
    byte[] buf = new byte[8196];
    
    DatagramPacket emptyPacket = new DatagramPacket(buf, buf.length);
    
    socket.receive(emptyPacket);
    String message = new String(emptyPacket.getData(), "UTF-8");
    
    System.out.println(message);
  }
}