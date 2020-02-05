package com.eomcs.io;

import java.io.FileInputStream;

public class DataInputStream extends FileInputStream {
  public DataInputStream(String name) throws Exception {
    super(name);
  }

  public String readUTF() throws Exception {
    int size = this.read();
    byte[] bytes = new byte[size];
    this.read(bytes);
    return new String(bytes, "UTF-8");
  }

  // 00 1B
  public int readInt() throws Exception {
    int value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();

    return value;
  }

  public boolean readBoolean() throws Exception {
    if(this.read() == 1)
      return true;
    return false;
  }
}