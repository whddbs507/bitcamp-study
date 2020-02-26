package com.eomcs.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientPrac21 {
  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket();
    
    String receiver = "localhost";
    byte[] bytes = "HelloHellokkk".getBytes("UTF-8");
        
    
    DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(receiver), 8888);
    
    socket.send(packet);
  }
}
